package Ecotool2021;
import Ecotool.Veicolo;

public class Veicolo2021 extends Veicolo{
	
	private double emissioneCO2;//Espressa in Milligrammi 
		
		/*1. Categorie “M”: Veicoli a motore progettati e costruiti per il trasporto di persone ed aventi
		almeno quattro ruote.
		Categoria M1: Veicoli progettati e costruiti per il trasporto di persone, aventi al massimo otto posti
		a sedere oltre al sedile del conducente.
		Categoria M2: Veicoli progettati e costruiti per il trasporto di persone, aventi più di otto posti a
		sedere oltre al sedile del conducente e massa massima non superiore a 5 t.
		Categoria M3: Veicoli progettati e costruiti per il trasporto di persone, aventi più di otto posti a
		sedere oltre al sedile del conducente e massa massima superiore a 5 t.
		2. Categorie “N”: Veicoli a motore progettati e costruiti per il trasporto di merci ed aventi
		almeno quattro ruote.
		Categoria N1: Veicoli progettati e costruiti per il trasporto di merci, aventi massa massima non
		superiore a 3,5 t.
		Categoria N2: Veicoli progettati e costruiti per il trasporto di merci, aventi massa massima
		superiore a 3,5 t ma non superiore a 12 t.
		Categoria N3: Veicoli progettati e costruiti per il trasporto di merci, aventi massa massima
		superiore a 12 t. */
	private String categoria;
	
	public Veicolo2021(String modello, String marca, int anno, String targa, double altezza, int numeroassi,
			double peso,double emissioneCO2, String categoria) {
		super(modello, marca, anno, targa, altezza, numeroassi, peso);
		this.setEmissioneCO2(emissioneCO2);
		this.setCategoria(categoria);
			
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getEmissioneCO2() {
		return emissioneCO2;
	}

	public void setEmissioneCO2(double emissioneCO2) {
		this.emissioneCO2 = emissioneCO2;
	}
	
	//Metodo per la classe Euro in base alle emissioni di co2
	
	public int getClasseEuro() {
					
				if(emissioneCO2<100) return 6;
				if(emissioneCO2<200) return 5;
				if(emissioneCO2<300) return 4;
				if(emissioneCO2<400) return 3;
				if(emissioneCO2<500) return 2;
				if(emissioneCO2<600) return 1;
				else return 0;
				
			
			
		}

	@Override
	public String toString() {
		return super.toString()+ "emissioneCO2=" + emissioneCO2 + ", categoria=" + categoria;
	}
		
}
