package z_exam;

public class MyMathTest {
	public static void main(String[] args) {
		//MyMath클래스 객체화 mm
		MyMath mm = new MyMath();
		
		//덧셈 메서드를 이용한 값 저장 result1 / 5L,3L
		long result1 = mm.add(5L,3L);
		
		//뺄셈 메서드를 이용한 값 저장 result2 / 5L,3L
		long result2 = mm.subtract(5L,3L);
		
		//곱셈 메서드를 이용한 값 저장 result3 / 5L,3L
		long result3 = mm.multiply(5L,3L);
		
		//나눗셈 메서드를 이용한 값 저장 result4 / 5L,3L
		float result4 = mm.divide(5L,3L);
		
		//모두 출력
		System.out.println("5L와 3L의 덧셈 "+ result1);
		System.out.println("5L와 3L의 뺄셈 "+ result2);
		System.out.println("5L와 3L의 곱셈 "+ result3);
		System.out.println("5L와 3L의 나눗셈 "+ result4);

		
	}
}

//MyMath클래스 생성
class MyMath{
	//두개의 매개변수를 가진 덧셈 메서드, 리턴값 있음
	long add(long a, long b){
		return a+b;
	}
	
	//두개의 매개변수를 가진 뺄셈 메서드, 리턴값 있음
	long subtract(long a, long b){
		return a-b;
	}
	
	//두개의 매개변수를 가진 곱셈 메서드, 리턴값 있음
	long multiply(long a, long b){
		return a*b;
	}
	
	//두개의 매개변수를 가진 나눗셈 메서드, 리턴값 있음
	float divide(long a, long b){
		return (float)a/b;
	}

}