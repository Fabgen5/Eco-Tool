package Ecotool;

public class Casello implements Comparable<Object> {
	
	private int altezzakm;
	private String nome;
	public Autostrada autostrada;
	
	public Casello(int altezzakm,String nome,Autostrada autostrada) {
		this.nome = nome;		
		this.altezzakm = altezzakm;
		this.autostrada=autostrada;
	}
	public Autostrada getAutostrada() {
		return autostrada;
	}

	public void setAutostrada(Autostrada autostrada) {
		this.autostrada = autostrada;
	}
	
	public int getAltezzakm() {
		return altezzakm;
	}
	public void setAltezzakm(int altezzakm) {
		this.altezzakm = altezzakm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Casello [ nome=" + nome + ", altezzakm=\" + altezzakm + \", autostrada=" + autostrada + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casello other = (Casello) obj;
		if (altezzakm != other.altezzakm)
			return false;
		if (autostrada == null) {
			if (other.autostrada != null)
				return false;
		} else if (!autostrada.equals(other.autostrada))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
   
	@Override
	public int compareTo(Object casello) {
		
		return (this.altezzakm - ((Casello) casello).getAltezzakm());
	}
	
}
