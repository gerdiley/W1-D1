package it.epicode.be;

public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] gods = {"Hades", "Aphrodite", "Dionysus", "Artemis", "Zeus"};
		
		moltiplica(10, 5);
		
		concatena("Giovanna", 19);
		
		inserisciInArray(gods, "Poseidon");

	}
	
	static int moltiplica(int firstNumber,	int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	static void concatena( String nome,	int anni) {
		System.out.println( nome + " ha " + anni + " anni." );
	}
	
	static void inserisciInArray( String[] godsArray, String newGod) {		
		// System.out.println( java.util.Arrays.toString( "boh" ) );
		
		String[] gods2 = new String[6];
		gods2[0] = godsArray[0];
		gods2[1] = godsArray[1];
		gods2[2] = newGod;
		gods2[3] = godsArray[2];
		gods2[4] = godsArray[3];
		gods2[5] = godsArray[4];
		
		System.out.println( java.util.Arrays.toString( gods2 ) );
	}

}
