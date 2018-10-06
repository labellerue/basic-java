package z_exam;

//MyMath2 클래스 생성

class MyMath2{
	//long타입 변수 두개 선언
	long a;
	long b;


	//결과값 반환하는 메서드 4개
	//add, subtract, multiply, divide
	long add(){
		return a+b;
	}

	long subtract() {
		return a-b;
	}

	long multiply() {
		return a*b;
	}
	
	float divide() {
		return (float)a/b;
	}
	

	//long형 매개변수를 이용한 결과값 반환하는 클래스 메서드 4개 
	//add, subtract, multiply, divide
	static long add(long a, long b) {
		return a+b;
	}

	static long subtract(long a, long b) {
		return a-b;
	}

	static long multiply(long a, long b) {
		return a*b;
	}

	static float divide(long a, long b) {
		return (float)a/b;
	}

}



public class MyMathTest2 {
	public static void main(String[] args) {
		//클래스 메서드 출력  200L,100L
		System.out.println("add "+ MyMath2.add(200L, 100L));
		System.out.println("subtract "+ MyMath2.subtract(200L, 100L));
		System.out.println("multiply "+ MyMath2.multiply(200L, 100L));
		System.out.println("divide "+ MyMath2.divide(200L, 100L));

		//인스턴스 메서드 출력
		MyMath2 m = new MyMath2();
		m.a= 200L;
		m.b= 100L;
		System.out.println("add "+ m.add());
		System.out.println("subtract "+ m.subtract());
		System.out.println("multiply "+ m.multiply());
		System.out.println("divide "+ m.divide());

	}
}

