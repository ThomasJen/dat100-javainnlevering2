package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
	
		}
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String retur = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i == 0) {
				retur += tabell[i];
			}else {
				retur += "," + tabell[i];
			}
		}
		retur += "]";
		return retur;	
	}

	// c)
	public static int summer(int[] tabell) {
		int retur = 0;
		int a = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			retur += tabell[i];
		}
	
/*		while(a < tabell.length) {
			retur += tabell[a];
			a++;
		}
		for (int x:tabell) {
			retur += x;
		}*/
		
		return retur;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean finnes = false;
		int x = 0;
		
		while (x < tabell.length && (!finnes)) {
			
			if (tabell[x] == tall) {
				finnes = true;
			}
			
			x++;
		}
		
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int[] timeTab = tabell;
		int posisjon = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {		
	    System.out.println();
	    int [] tab1 = new int [tabell.length]; 
	    int x = tabell.length-1;
	    for(int i = 0; i < tabell.length; i++) {
	    	tab1[i] = tabell[tabell.length-1-i];
	    }
	  return tab1;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		int j = 1;
		boolean sortert = true;
		while (sortert && j < tabell.length - 1) {
			if (tabell[j] > tabell[j + 1]) {
				sortert = false;
			}
			j++;
		}
	
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
			
		
			System.out.println();
			
			int settsammen = tabell1.length + tabell2.length;
			int[] nytab = new int [settsammen];
			for (int i = 0; i < tabell1.length; i++) {
				nytab[i] = tabell1[i];
			}
			for (int j = 0; j < tabell2.length; j++) {
				nytab[tabell1.length+j] = tabell2[j];
			}
				
		return nytab;
	}
}
