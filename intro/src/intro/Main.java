package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false; 
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if (dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}		
		else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		System.out.println("\n*****************\n");
		
		String [] krediler = 
			{
					"H�zl� kredi",
					"Mutlu emekli kredisi",
					"Konut kredisi",
					"�ift�i kredisi",
					"Msb kredisi",
					"Meb kredisi",
					"Ta��t kredisi"
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
