package f_oop2;

import java.util.Arrays;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();
//		System.out.println(Arrays.toString(d.c));
		Card a = d.pick();
		System.out.println(a);

		d.shuffle(1000);
		Card b = d.pick(7);
		System.out.println(b);

		d.shuffle();
		b = d.pick(7);
		System.out.println(b);
	}

}

class Deck{
	//1. 카드의 수량을 저장할 수 있는 변수를 선언 및 초기화하세요 CARD_NUM
	//단, Card클래스의 상수를 이용하세요
	final int CARD_NUM = Card.KIND_MAX*Card.NUM_MAX;
	
	//2. 카드 52장을 담을 변수를 선언 및 생성해주세요 c
	Card[] c = new Card[CARD_NUM];
	
	//3. 기본생성자를 만드세요
	//1,1 1,2 1,3 ~ 4,11 4,12 4,13
	//c에 52장의 카드를 채워주세요
	Deck(){
		int i=0;
		for(int j=1 ; j<Card.KIND_MAX+1 ; j++){
			for(int k=1 ; k<Card.NUM_MAX+1 ; k++){
				c[i++] = new Card(j,k);
			}
		}
	}
	
	//4. c의 방번호를 입력받아 해당 방번호의 카드를 반환하는 메서드를 만드세요
	// pick
	/**
	 * 방번호를 입력받아 카드한장을 반환하는 메서드
	 * @param pc 입력받는 방번호
	 * @return 해당 방의 카드 한장
	 */
	Card pick(int pc){
		Card pickCard = c[pc];
		return pickCard;
	}
	
	//5. 랜덤번째 방의 카드를 한장 반환하는 메서드를 만드세요  pick
	// 단 4번에서 만든 메서드를 활용하세요
	Card pick(){
		Card pickCard = pick((int)(Math.random()*52));
		return pickCard;
	}
	
	//6. 카드를 섞어주세요 shuffle
	// 단, 연습문제 5-5번을 응용해주세요
	void shuffle(){
		for(int i=0 ; i<CARD_NUM ; i++){
			int random= (int)(Math.random()*CARD_NUM);
			Card tmp;
			tmp = c[i];
			c[i] = c[random];
			c[random] = tmp;
		}
	}
	
	//7. 카드를 섞어주세요 shuffle
	// 반복횟수를 입력받아서 해당 횟수만큼 랜덤한 방을 두개 뽑아 위치를 변경해 주세요
	void shuffle(int repeat){
		for(int k=0 ; k<repeat ; k++){
			int ran1= (int)(Math.random()*CARD_NUM);
			int ran2= (int)(Math.random()*CARD_NUM);
			Card tmp;
			tmp = c[ran1];
			c[ran1] = c[ran2];
			c[ran2] = tmp;
		}
	}
}

class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 1;
	static final int CLOVER = 2;
	static final int DIAMOND = 3;
	static final int HEART = 4;
	
	int kind;
	int number;
	 
	//1. 매개변수가 두개인 생성자를 만드세요
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	//2. 기본생성자를 만드세요
	//	단, 매개번수가 두개인 생성자를 이용하여 1,1의 값으로 초기화 하세요
	Card(){
		this(SPADE,1);
	}
	
	@Override
	public String toString(){
		String kind = "";
		String number = "";
		
		switch (this.kind){
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "CLOVER";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		default:
			kind = "HEART";
			break;
		}
		
		switch (this.number){
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number = this.number+ "";
			break;
		}
		return kind +" :" + number;
	}
	
	
}



