package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrity;

public class DeletarDados {

	public static void main(String[] args) {
	
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?"
					);
			
			st.setInt(1, 5);
			
			int linhasAlt = st.executeUpdate();
			System.out.println("Foram alteradas " + linhasAlt + " Linhas");
		}
		catch (SQLException e) {
			
			throw new DbIntegrity(e.getMessage());
		}
		finally {
			
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
