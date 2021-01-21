package Entities;

public class Empregado {
	
	private String name;
	private Double salario;
	private Integer id;

	
	public Empregado() {
		
	}
	
	public Empregado(Integer id, String name, Double salario) {
		
		this.id = id;
		this.name = name;
		this.salario = salario;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\n" + "Salario: " + salario + "\n" + "Id: " + id + "\n";
	}

	public void addsalario(double percent) {
		salario += salario * percent / 100;
	}
	
	
	
	
}
