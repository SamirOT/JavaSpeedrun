package Objektuak;

import java.util.Objects;

public class Partida {
	private int etxekoGolak;
	private int kanpokoGolak;
	
	
	//Getter eta Setter
	public int getEtxekoGolak() {
		return etxekoGolak;
	}
	public void setEtxekoGolak(int etxekoGolak) {
		this.etxekoGolak = etxekoGolak;
	}
	public int getKanpokoGolak() {
		return kanpokoGolak;
	}
	public void setKanpokoGolak(int kanpokoGolak) {
		this.kanpokoGolak = kanpokoGolak;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(etxekoGolak, kanpokoGolak);
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
		Partida other = (Partida) obj;
		return etxekoGolak == other.etxekoGolak && kanpokoGolak == other.kanpokoGolak;
	}
	
	//toString
	@Override
	public String toString() {
		return "Partida [etxekoGolak=" + etxekoGolak + ", kanpokoGolak=" + kanpokoGolak + ", getEtxekoGolak()="
				+ getEtxekoGolak() + ", getKanpokoGolak()=" + getKanpokoGolak() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
