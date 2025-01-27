package Objektuak;

import java.util.Objects;

public class Taldea {
	private String izena;
	private String herrialdea;
	
	//Getter eta Setter
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getHerrialdea() {
		return herrialdea;
	}
	public void setHerrialdea(String herrialdea) {
		this.herrialdea = herrialdea;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(herrialdea, izena);
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taldea other = (Taldea) obj;
		return Objects.equals(herrialdea, other.herrialdea) && Objects.equals(izena, other.izena);
	}
	
	//toString
	@Override
	public String toString() {
		return "Taldea [izena=" + izena + ", herrialdea=" + herrialdea + ", getIzena()=" + getIzena()
				+ ", getHerrialdea()=" + getHerrialdea() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}	
}
