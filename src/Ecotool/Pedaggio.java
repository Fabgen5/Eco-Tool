package Ecotool;

public class Pedaggio {
	protected Casello caselloin;
	protected Casello caselloout;
	protected Veicolo veicolo;
	
	public Pedaggio(Casello caselloin, Casello caselloout, Veicolo veicolo) {
		this.caselloin = caselloin;
		this.caselloout = caselloout;
		this.veicolo= veicolo;
	}
	
	public Casello getCaselloin() {
		return caselloin;
	}
	public void setCaselloin(Casello caselloin) {
		this.caselloin = caselloin;
	}
	public Casello getCaselloout() {
		return caselloout;
	}
	public void setCaselloout(Casello caselloout) {
		this.caselloout = caselloout;
	}
	public Veicolo getVeicolo() {
		return veicolo;
	}
	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
	
	
	public double CalcolaPedaggio() {
		
		double iva=22;
		double tariffa=caselloin.autostrada.getTariffa();
		double maggiorazioneclasse=0;
		double diffkm=0;
		double pedaggio;
		
		//Al veicolo calcola la maggiorazione relativa alla classe
		switch(veicolo.getClasse()) {
			case 1:	
				maggiorazioneclasse=1.10; 
				break;
			case 2:	
				maggiorazioneclasse=1.15;
				break;
			case 3:
				maggiorazioneclasse=1.20;
				break;
			case 4:
				maggiorazioneclasse=1.25;
				break;
			case 5:
				maggiorazioneclasse=1.30;	
		}
		
		//calcola i chilometri tra due caselli
		
		if(caselloin.autostrada.equals(caselloin.autostrada)) {
			diffkm = caselloin.getAltezzakm()-caselloout.getAltezzakm() ;
			if ( diffkm <= 0) diffkm=diffkm*-1;				
			}
		//else vuoto dovuto al caso in cui i due caselli sono su due autostrade diverse
		
		//la tariffa viene maggiorata in base alla classe
		
		tariffa *= maggiorazioneclasse;
		
		//calcolo il pedaggio in fuzione dei km percorsi e la tariffa maggiorata
		
		pedaggio = diffkm *(tariffa);
		
		//Aggiungo l'iva al 22%
		
		iva *= pedaggio/100;
		pedaggio+=iva;
		
		//arrotondamento alla prima cifra dopo la virgola
		pedaggio = Math.round(pedaggio * 10) / 10.0;
		
			
		
		return pedaggio;
	}

	

}
