package Ecotool;

import java.util.TreeSet;

public class Autostrada {
	private String nome;
	private TreeSet<Casello> caselli;
	private double tariffa;//espressa in euro/km ad esempio tariffa= 0.50euro/km
	

public Autostrada(String nome, double tariffa) {
		this.nome = nome;
		this.tariffa = tariffa;
		this.caselli= new TreeSet<Casello>() ;
	}


public boolean addCasello(Casello casello) {
	
	return caselli.add(casello);
}
public boolean addCasello(int altezzakm,String nome,Autostrada autostrada) {
	Casello casello = new Casello(altezzakm, nome,autostrada);
	boolean result=caselli.add(casello);
	return result;
}


public void setCaselli(TreeSet<Casello> caselli) {
	this.caselli = caselli;
}
public TreeSet<Casello> getCaselli() {
	return caselli;
}


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getTariffa() {
	return tariffa;
}
public void setTariffa(double tariffa) {
	this.tariffa = tariffa;
}


@Override
public String toString() {
	return "Autostrada [nome=" + nome + ", caselli=" + caselli + ", tariffa=" + tariffa + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Autostrada other = (Autostrada) obj;
	if (caselli == null) {
		if (other.caselli != null)
			return false;
	} else if (!caselli.equals(other.caselli))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (Double.doubleToLongBits(tariffa) != Double.doubleToLongBits(other.tariffa))
		return false;
	return true;
}




}
