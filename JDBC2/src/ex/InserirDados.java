package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class InserirDados {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+"(Name, Email, BirthDate, BaseSalary, DepartmentId) "	
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Roberto");
			st.setString(2, "robert@robert");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 200.0);
			st.setInt(5, 4);
			
			int linhasAlt = st.executeUpdate();
			
			if (linhasAlt > 0) {
				
			ResultSet rs =	st.getGeneratedKeys();
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				System.out.println(id);
			}
			}
			else {
				
				System.out.println("Nenhuma linha foi alterada");
			}
			System.out.println("Foram alteradas " + linhasAlt + " Linhas");
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch(ParseException e) {
			
			e.printStackTrace();
		}
		finally {
			
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
