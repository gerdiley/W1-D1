package it.epicode.be;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println("--------------------------------------");
		
		// Es 2
		int firstNumber = 10;
		int secondNumber = 5;
		String helloWorld = "Hello, World #";
		
		
		String[] gods = {"Hades", "Aphrodite", "Dionysus", "Artemis", "Zeus"};
		String seaGod = "Poseidon";
		String hearthGoddess = "Hestia";
		
		System.out.println("");		
		System.out.println("- Es. 2 -");
		
		System.out.println("Moltiplica:");
		System.out.println( firstNumber * secondNumber);
		System.out.println("");
		
		System.out.println("Concatena:");
		System.out.println( helloWorld + secondNumber);
		System.out.println("");
		
		System.out.println("inserisciInArray:");
		System.out.println( java.util.Arrays.toString( gods ) );
		
		gods[ gods.length - 3 ] = seaGod;
		System.out.println( java.util.Arrays.toString( gods ) );
		
		gods[ gods.length - 3 ] = hearthGoddess;
		System.out.println( java.util.Arrays.toString( gods ) );
		
		// ^ non funziona....
		
		// Es 3
		System.out.println("");
		System.out.println("- Es. 3 -");
		System.out.println( firstNumber * secondNumber);
		
		// Es 4
		System.out.println("");
		System.out.println("- Es. 4 -");
		System.out.println( firstNumber * secondNumber);
		
		}
}



