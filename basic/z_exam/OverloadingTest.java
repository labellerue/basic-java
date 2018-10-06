package z_exam;

public class OverloadingTest {
	public static void main(String[] args) {
		//인자값 3 혹은 3L을 주어 add 메서드 호출 및 출력
		//출력방법 "add(**) 결과: "
		MyMath3 mm = new MyMath3();
		System.out.println("add(3,3) 결과: "+ mm.add(3,3));
		System.out.println("add(3,3L) 결과: "+ mm.add(3,3L));
		System.out.println("add(3L,3) 결과: "+ mm.add(3L,3));
		System.out.println("add(3L,3L) 결과: "+ mm.add(3L,3L));
		
		//배열에 100,200,300값을 넣어 add메서드 호출 및 출력
		int[] a = {100, 200, 300};
		System.out.println("add[] 결과: "+ mm.add(a));

	}

 
}

//MyMath3 클래스
class MyMath3{
	//1 두개의 매개변수, long형과 int형으로 나올 수 있는 모든 경우의 수개의 메서드 
	//메서드명 출력
	int add(int a, int b) {
		System.out.println("int add(int a, int b)  ");
		return a+b;
	}

	long add(int a, long b) {
		System.out.println("long add(int a, long b)  ");
		return a+b;
	}

	long add(long a, int b) {
		System.out.println("long add(long a, long b)  ");
		return a+b;
	}

	long add(long a, long b) {
		System.out.println("long add(long a, long b)  ");
		return a+b;
	}

	//2 배열형 매개변수를 가진 add 메서드, 배열의 값을 모두 더한 값을 반환
	//메서드명 출력
	int add(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length ; i++) {
			sum+=a[i];
		}
		System.out.println("int add(int[] a)  ");
		return sum;
	}

	
}