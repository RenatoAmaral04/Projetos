package exx;

import java.util.Objects;

public class Candidato {

	private String name;
	private Integer votos;
	public Candidato(String name, Integer votos) {
		
		this.name = name;
		this.votos = votos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVotos() {
		return votos;
	}
	public void setVotos(Integer votos) {
		this.votos = votos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, votos);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
