package Temel_Kavramlar;


import java.util.Scanner;
public class EtkinlikÖnerenProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int derece;
		System.out.println("Hava sıcaklığını giriniz: ");
		derece = scan.nextInt();
		
		
		if(derece > 30) {
			System.out.println("Bu havada pikniğe gidilir.");
		}
		else if(derece <= 30 && derece >= 5) {
			System.out.println("Bu havada sinemaya gidilebilir.");
		}
		else{
			System.out.println("Bu havada en iyi kayağa gidilir.");
		}

	}

}
