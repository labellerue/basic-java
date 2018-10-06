package e_oop;

public class PrintCall {
	public static void main(String[] args) {
		
		Calc2 c = new Calc2();
		System.out.println(c.add());
		System.out.println(c.add(1,1));
		System.out.println(c.add(1));
		System.out.println(c.add(1,1L));
		System.out.println(c.add(1L,1L));
		
		
		
	}

}

class Calc2{
	
	int a1 = 3;
	int a2 = 4;
	//1. 인스턴스변수 a1과 a2의 합을 반환하는 메서드를 만드세요  add
	int add(){
		int result = a1+a2;
		return result;
	}
	
	//2. 매개변수 int형 두개를 받아서 두 값의 합을 반환하는 메서드를 만드세요  add
	int add(int b1, int b2){
		int result = b1+b2;
		return result;
	}
	
	//3. 매개변수 int형 하나를 받아서 매개변수와 a1과 a2의 합을 반환하는 메서드를 만드세요  add
	int add(int b){
		int result = b+a1+a2;
		return result;
	}
	
	//4. 매개변수 int형 하나와 long형 하나를 받아서 두개의 합을 반환하는 메서드를 만드세요  add
	long add(int b1, long b2){
		long result = b1+b2;
		return result;
	}
	
	//5. 매개변수 long형 두개를 받아서 두 값의 합을 반환하는 메서드를 만드세요  add
	long add(long b1, long b2){
		long result = b1+b2;
		return result;
	}
	
	
	
	
	
	
}