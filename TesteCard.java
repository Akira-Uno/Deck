package Card;

import java.util.Scanner;

public class TesteCard {
	public static void main(String[] args) {
		Card c = new Card();
		boolean verificaMenu = false;
		Scanner scanner = new Scanner(System.in);
		
		do {
			menu();
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:
				c.addCard();
				break;
			case 2:
				c.remover();
				break;
			case 3:
				c.exibir();
				break;
			case 4:
				System.out.println("...");
				verificaMenu = true;
				break;
			default:
				System.out.println("Invalido");
			}
			
			
			
		}while(verificaMenu = true);
		
	}
	
	public static void menu() {
		System.out.println("1 - add");
		System.out.println("2 - excluir");
		System.out.println("3 - exibir");
		System.out.println("0 - sair");
	}
}
