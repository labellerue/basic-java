package e_oop;

class Data{
	int x;
}

public class InteVari {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x = 10;
		System.out.println("main기본형 : "+d1.x);
		
		InteVari.change(d1.x);
		System.out.println("after main기본형 : "+d1.x);
		
		Data d2 = new Data();
		d2.x = 10;
		System.out.println("main참조형 : "+d2.x);
		
		change(d2);							//같은 클래스 내에서 클래스메소드를 호출할 때 클래스명은 생략 가능
		System.out.println("after main참조형 : "+d2.x);
		
	}
	static void change(int x){ //기본형 매개변수
		x = 1000;
		System.out.println("change기본형 : "+ x);
	}
	static void change(Data d1){ //참조형 매개변수
		d1.x = 1000;
		System.out.println("change참조형 : "+d1.x);
		}

}
