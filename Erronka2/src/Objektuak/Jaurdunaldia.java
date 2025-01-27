package Objektuak;

import java.util.Objects;

public class Jaurdunaldia {
	private int jaurdunaldiaKod;
	private static int hurrengoJaurdunaldia;
	
	
	//Getter eta Setter
	public int getJaurdunaldiaKod() {
		return jaurdunaldiaKod;
	}
	public void setJaurdunaldiaKod(int jaurdunaldiaKod) {
		this.jaurdunaldiaKod = jaurdunaldiaKod;
	}
	public static int getHurrengoJaurdunaldia() {
		return hurrengoJaurdunaldia;
	}
	public static void setHurrengoJaurdunaldia(int hurrengoJaurdunaldia) {
		Jaurdunaldia.hurrengoJaurdunaldia = hurrengoJaurdunaldia;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(jaurdunaldiaKod);
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
		Jaurdunaldia other = (Jaurdunaldia) obj;
		return jaurdunaldiaKod == other.jaurdunaldiaKod;
	}
	
	//toString
	@Override
	public String toString() {
		return "Jaurdunaldia [jaurdunaldiaKod=" + jaurdunaldiaKod + ", getJaurdunaldiaKod()=" + getJaurdunaldiaKod()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
