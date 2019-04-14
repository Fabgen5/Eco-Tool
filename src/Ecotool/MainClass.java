package Ecotool;


public class MainClass {

	public static void main(String[] args) {
		
		Autostrada A24 = new Autostrada("A24", 0.21);
		Autostrada A14 = new Autostrada("A14", 0.10);
		//Aggiungo Caselli all'autostrada
		A24.addCasello(0,"Basciano",A24);
		A24.addCasello(25,"Colledara",A24);
		A24.addCasello(42,"Assergi",A24);
		A24.addCasello(59,"L'Aquila Est",A24);
		
		
		A14.addCasello(330,"San Benedetto del Tronto",A14);
		A14.addCasello(501,"Pescara nord/Città Sant'Angelo",A14);
		
		
		//Prima Instanzio Caselli poi li aggiungo nell'autostrada
		Casello C1 = new Casello(68,"L'Aquila Ovest",A24);
		A24.addCasello(C1);
		Casello C2 = new Casello(88,"Tornimparte",A24);
		A24.addCasello(C2);
		
		
		Casello C10 = new Casello(370,"Val Vibrata",A14);
		A14.addCasello(C10);
		Casello C11 = new Casello(410,"Mosciano Sant'Angelo/Teramo",A14);
		A14.addCasello(C11);
		Casello C12 = new Casello(457,"Roseto",A14);
		A14.addCasello(C12);
		Casello C13 = new Casello(473,"Pineto",A14);
		A14.addCasello(C13);
		
		
		Veicolo v1= new Veicolo("California" , "Ferrari", 2018, "FF007XY" , 1.00, 2, 1350);	
		Veicolo v2= new Veicolo("Mito" , "Alfa", 2010, "CF346TM" , 1.40, 2, 1200);
		Veicolo v3= new Veicolo("Bus" , "IrisBus", 2016, "FA009GY" , 2.00, 3, 2500);
		Veicolo v4= new Veicolo("DucatoMax" , "Fiat", 2018, "FB999AS" , 2.00, 4, 3000);
		Veicolo v5= new Veicolo("Stralis" , "Iveco", 1999, "AB189PD" , 2.50, 5, 10000);
		
		
		
		//Calcolo del pedaggio dei veicoli relativi allo stesso casello per testare la maggiorazione
		System.out.println("Test Maggiorazione");
		System.out.println(new Pedaggio(C1,C2,v1).CalcolaPedaggio());
		System.out.println(new Pedaggio(C1,C2,v2).CalcolaPedaggio());
		System.out.println(new Pedaggio(C1,C2,v3).CalcolaPedaggio());
		System.out.println(new Pedaggio(C1,C2,v4).CalcolaPedaggio());
		System.out.println(new Pedaggio(C1,C2,v5).CalcolaPedaggio());
		
		
		
		//Stesso veicolo senso opposto
		System.out.println("Test stessa tratta senso opposto");
		System.out.println(new Pedaggio(C10,C13,v2).CalcolaPedaggio());
		System.out.println(new Pedaggio(C13,C10,v2).CalcolaPedaggio());
		
		
		//Altre prove
		System.out.println("Altri pedaggi");
		System.out.println(new Pedaggio(C10,C11,v1).CalcolaPedaggio());
		System.out.println(new Pedaggio(C11,C13,v3).CalcolaPedaggio());
		System.out.println(new Pedaggio(C10,C12,v3).CalcolaPedaggio());
		System.out.println(new Pedaggio(C13,C11,v5).CalcolaPedaggio());

	}

}
