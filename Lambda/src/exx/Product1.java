package exx;

public class Product1 {

	private String name;
	private String email;
	private Double salario;
	
	public Product1(String name, String email, Double salario) {

		this.name = name;
		this.email = email;
		this.salario = salario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", email=" + email + ", salario=" + salario + "]";
	}
	
	
}
