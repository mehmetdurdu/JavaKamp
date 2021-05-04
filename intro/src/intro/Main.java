package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false; 
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}		
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		System.out.println("\n*****************\n");
		
		String [] krediler = 
			{
					"Hýzlý kredi",
					"Mutlu emekli kredisi",
					"Konut kredisi",
					"Çiftçi kredisi",
					"Msb kredisi",
					"Meb kredisi",
					"Taþýt kredisi"
			};
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		System.out.println("\n***********************\n");
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
	}

}
