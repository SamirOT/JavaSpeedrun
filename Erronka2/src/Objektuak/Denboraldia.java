package Objektuak;

import java.io.Serializable;

public class Denboraldia implements Serializable {
    private static final long serialVersionUID = 1L; // Necesario para serialización
    private int urtea;

    // Constructor
    public Denboraldia(int urtea) {
        this.urtea = urtea;
    }

    // Getter
    public int getUrtea() {
        return urtea;
    }

    // Setter
    public void setUrtea(int urtea) {
        this.urtea = urtea;
    }

    @Override
    public String toString() {
        return "Denboraldia{" + "urtea=" + urtea + '}';
    }
}
