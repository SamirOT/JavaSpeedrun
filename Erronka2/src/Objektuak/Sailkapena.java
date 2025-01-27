package Objektuak;

import java.util.Objects;

public class Sailkapena {
	private int golBatuketa;

	//Getter eta Setter
	public int getGolBatuketa() {
		return golBatuketa;
	}

	public void setGolBatuketa(int golBatuketa) {
		this.golBatuketa = golBatuketa;
	}

	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(golBatuketa);
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
		Sailkapena other = (Sailkapena) obj;
		return golBatuketa == other.golBatuketa;
	}
	
	//toString
	@Override
	public String toString() {
		return "Sailkapena [golBatuketa=" + golBatuketa + ", getGolBatuketa()=" + getGolBatuketa() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
}
