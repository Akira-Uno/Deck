package Card;

import java.util.Random;


public class Card {
	private Object[] card;
	private int size;
	private String[] nipe = {"!","@","#","$"};
	Random r = new Random();
	
	public Card(){
		card = new Object[size];
		size = 0;
	}
	
	public void addCard() {
		if(card.length == size) {
			aumentarTamanho();
		}
		int indexNipe = r.nextInt(nipe.length);
		String quantCard = nipe[indexNipe];
		for(int i = 0; i < card.length;i++) {
			card[size] = r.nextInt(13) + quantCard; 
			size++;
			break;
		}
	
		
	}
	public void aumentarTamanho() {
		Object newArray[] = new Object[size + 2];
		for(int i = 0; i < size;i++ ) {
			newArray[i] = card[i];
		}
		card = newArray;
		
	}

	
	public void remover() {
		int indx =size -1;
		for(int i = 0; i <size;i++) {
			if(card != null) {
				card[indx] = null;
				size--;
				break;
			}
			
		}
	}
	public void exibir() {
		for(Object ob  :  card) {
			if(ob != null) {
				System.out.println(ob);
			}else if(size <= 0) {
				System.out.println("Cabo");
				break;
				
			}
		}

		
	}
			
}
