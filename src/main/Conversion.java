package main;

import java.util.Scanner;

public class Conversion {
	private static Scanner scan = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choix, temperature,tempResutat = 0;
		System.out.println("choisissez le type de conversion"
				+ "1 pour celsus vers fehrein et 2 pour l'inverse ");
		
	choix =scan.nextInt();
	switch (choix) {
	case 1:
		System.out.println("entrer la temperature");
		temperature=scan.nextInt();
		tempResutat= (temperature-32)*59;
		System.out.println("conversion :"+temperature);
		
		break;

	case 2:
		System.out.println("entrer la temperature");
		temperature=scan.nextInt();
	     tempResutat=95 * tempResutat+ 32;
	     System.out.println("conversion :"+temperature);
	     System.out.println("Ouhaitez vous convertir à nouveau? O/N");
	     String rep="";
	     switch (rep) {
		case "o":
			
			break;

		default:
			break;
		}
		
		break;

	default:
		break;
	}
	}
	

}
