package Objektuak;

import java.util.Objects;

public class Denboraldia {
	private int urtea;
	private int hasieraData;
	private int amaieraData;	
	
	//Eraikitzailea utzik
	public Denboraldia() {
		this.urtea = 0;
		this.hasieraData = 0;
		this.amaieraData = 0;
	}
	
	//Eraikitzaile osoarik
	public Denboraldia(int urtea, int hasieraData, int amaieraData) {
		super();
		this.urtea = urtea;
		this.hasieraData = hasieraData;
		this.amaieraData = amaieraData;
	}
	
	//Eraikitzailearen kopia
	public Denboraldia(Denboraldia kopia) {
		this.urtea = kopia.urtea;
		this.hasieraData = kopia.hasieraData;
		this.amaieraData = kopia.amaieraData;
	}
	
	//Getter Setter
	public int getUrtea() {
		return urtea;
	}
	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}
	public int getHasieraData() {
		return hasieraData;
	}
	public void setHasieraData(int hasieraData) {
		this.hasieraData = hasieraData;
	}
	public int getAmaieraData() {
		return amaieraData;
	}
	public void setAmaieraData(int amaieraData) {
		this.amaieraData = amaieraData;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		return Objects.hash(amaieraData, hasieraData, urtea);
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
		Denboraldia other = (Denboraldia) obj;
		return amaieraData == other.amaieraData && hasieraData == other.hasieraData && urtea == other.urtea;
	}
	
	//toString
	@Override
	public String toString() {
		return "Denboraldia [urtea=" + urtea + ", hasieraData=" + hasieraData + ", amaieraData=" + amaieraData + "]";
	}	
	
}
