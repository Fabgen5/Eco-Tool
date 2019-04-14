package Ecotool;

public class Veicolo {
	private String modello;
	private String marca;
	private int anno;
	private String targa;
	private double altezza;
	private int numeroassi;
	private double peso;
	
	public Veicolo(String modello, String marca, int anno, String targa, double altezza, int numeroassi, double peso) {
		this.modello = modello;
		this.marca = marca;
		this.anno = anno;
		this.targa = targa;
		this.altezza = altezza;
		this.numeroassi = numeroassi;
		this.peso = peso;
	}

	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public int getNumeroassi() {
		return numeroassi;
	}
	public void setNumeroassi(int numeroassi) {
		this.numeroassi = numeroassi;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	//Metodo per il calcolo della classe
	
	public int getClasse() {
		
		switch(numeroassi) {
		case 2:	
			if (altezza<1.30) return 1;
			else return 2;
		
		case 3:
			return 3;
			
		case 4:
			return 4;
			
		default:
			return 5;	
		}
		
		
	}
	@Override
	public String toString() {
		return "Veicolo modello=" + modello + ", marca=" + marca + ", anno=" + anno + ", targa=" + targa + ", altezza="
				+ altezza + ", numeroassi=" + numeroassi + ", peso=" + peso;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veicolo other = (Veicolo) obj;
		if (Double.doubleToLongBits(altezza) != Double.doubleToLongBits(other.altezza))
			return false;
		if (anno != other.anno)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modello == null) {
			if (other.modello != null)
				return false;
		} else if (!modello.equals(other.modello))
			return false;
		if (numeroassi != other.numeroassi)
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (targa == null) {
			if (other.targa != null)
				return false;
		} else if (!targa.equals(other.targa))
			return false;
		return true;
	}

	
	
	

}
