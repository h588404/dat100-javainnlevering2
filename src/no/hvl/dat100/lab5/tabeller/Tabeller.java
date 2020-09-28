package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		String tekstUt = "{ ";
		for(int i = 0; i < tabell.length; i++) {
			tekstUt += tabell[i] + ", ";
		}
		tekstUt += "}";
		
		System.out.println(tekstUt);
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String streng = "[";
		for(int i = 0; i < tabell.length; i++) {
			streng += tabell[i];
			if(i < tabell.length-1) {
				streng += ",";
			}
		}
		streng += "]";
		return streng;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		/*for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}*/
		/*int i = 0;
		while(i < tabell.length) {
			sum+= tabell[i];
			i++;
		}*/
		
		for(int element : tabell) {
			sum += element;
		}
		
		
		return sum;
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		boolean bool = false;;
		for(int element : tabell) {
			if(element == tall) {
				bool = true;
			}
		}
		return bool;
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		int posisjon = -1;
		for(int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				return i;
			}
		}
		return posisjon;
		
		
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		
		int[] nyTabell = new int [tabell.length];
		int pos = 0;
		
		for(int i = tabell.length-1;i >= 0; i-- ) {
			nyTabell[i] = tabell[pos];
			pos ++;
		}
		return nyTabell;
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		boolean bool = true;
		for(int i = 0; i < tabell.length-1; i++) {
			if(tabell[i+1] < tabell[i]) {
				bool = false;
			}
		}
		return bool;
		
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int pos = 0;
		int[] nyTabell = new int [tabell1.length + tabell2.length];
		for(int element : tabell1) {
			nyTabell[pos] = element;
			pos++;
		}
		for(int element : tabell2) {
			nyTabell[pos] = element;
			pos++;
		}
		return nyTabell;
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
