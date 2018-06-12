package com.mmonsoor;

import java.util.Scanner;

public class Program {
	public Program() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tentative de division pat zéro	
/*		
		try {
			int a=10, b=0;
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Suite du programme sans interuption");
		
*/
		System.out.println(saisiStrings());
	}
	public static String saisiStrings() {
		String [] tabString= {"Bonjour","monsieur","loulou"};
		Scanner sc = new Scanner(System.in);
		boolean erreurUtili=true;
		String motRetourne="";
		System.out.println("Veuillez saisir un chiffre [0,1,2] pour lire le texte dans une de cases du tableau");
		//On teste à chaque fois si l'utilisateur n'a pas fait d'erreur
		while(erreurUtili) {
			try {
				int saisie = Integer.parseInt(sc.nextLine());
				motRetourne=tabString[saisie];
				erreurUtili=false;
			}
			catch(NumberFormatException e) {
				System.out.println("Veuillez rentrer un nombre valide[0,1,2], et pas des lettres s'il vous plait");
				erreurUtili=true;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Veuillez rentrer un nombre valide compris parmi ces chiffres là: [0,1,2]");
				erreurUtili=true;
			}
		}
		return motRetourne;
	}

}
