package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i: matrise) {
			for (int j: i) {
				System.out.print(j + "|");
			}
			System.out.println();
		}
		
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String retur = "";
		for (int j = 0; j < matrise.length; j++) {
			for (int i = 0; i < matrise[j].length; i++) {
				if (i < matrise[j].length - 1) {
					retur += matrise[j][i] + " ";
				}else {
					retur += matrise[j][i] + " \n";
				}
			}
		}
		return retur;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nymatrise = new int[matrise.length][matrise.length];
		int sum = 0;
		
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				sum = sum + (matrise[i][j] * tall);
				nymatrise[i][j] = sum;
			}
	    	
	    }
	    return nymatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
			boolean lik = false;
			int x = 0;
			
			while (x < a.length && (!lik)) {
				if (a == a) {
					lik = true;
				}else {
					lik = false;
				}
				if (a == b) {
					lik = true;
				}else {
					lik = false;
				}
			}
			
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
