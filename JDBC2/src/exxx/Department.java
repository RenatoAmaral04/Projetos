package exxx;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	public Department() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Deparment [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department(Integer id, String name) {
	
		this.id = id;
		this.name = name;
	}

}
