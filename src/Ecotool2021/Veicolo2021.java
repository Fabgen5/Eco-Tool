package Ecotool2021;
import Ecotool.Veicolo;

public class Veicolo2021 extends Veicolo{
	
	private double emissioneCO2;//Espressa in Milligrammi 
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
					
			switch(categoria) {
			case "Elettrico":	
				return 6;
			case "Ibrido":
				return 6;
				
			default:
				if(emissioneCO2<100) return 6;
				if(emissioneCO2<200) return 5;
				if(emissioneCO2<300) return 4;
				if(emissioneCO2<400) return 3;
				if(emissioneCO2<500) return 2;
				if(emissioneCO2<600) return 1;
				else return 0;
				
			}
			
		}

	@Override
	public String toString() {
		return super.toString()+ "emissioneCO2=" + emissioneCO2 + ", categoria=" + categoria;
	}
		
}
