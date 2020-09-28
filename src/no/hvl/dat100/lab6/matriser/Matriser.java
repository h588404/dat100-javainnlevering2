package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		String tekstUt = "{\n";
		for(int test[] : matrise) {
			tekstUt += "{";
			for(int element : test) {
				tekstUt += element + ","; 
			}
			tekstUt += "}\n";
		}
		tekstUt += "}";
		System.out.println(tekstUt);
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String tekstUt = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				tekstUt += matrise[i][j] + " ";
			}
			tekstUt += "\n";
		}
		return tekstUt;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int[][] nyTabell = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++) {
			nyTabell[i] = new int[matrise[i].length];
		}
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				nyTabell[i][j] = matrise[i][j] * tall;
			}
		}
		
		return nyTabell;
		//throw new UnsupportedOperationException("skaler ikke implementert");
		
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		Boolean bool = true;
		if(a.length != b.length) {
			bool = false;
			return bool;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i].length != b[i].length) {
				bool = false;
				return bool;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					bool = false;
				}
			}
		}
		return bool;
		
		//throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int[][] nyTabell = new int[matrise.length][matrise[0].length];

		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				nyTabell[j][i] = matrise[i][j];
			}
		}
		return nyTabell;
		
		
		
		//throw new UnsupportedOperationException("speile ikke implementert");
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int[][] nyTabell = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				nyTabell[i][j] = a[i][j]*b[j][i];
			}
		}
		return nyTabell;
		//throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
