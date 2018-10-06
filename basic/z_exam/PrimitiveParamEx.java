package z_exam;

//클래스 Data 생성
class Data{
	//4. 정수형 x 선언
	int x;
}

public class PrimitiveParamEx {
	public static void main(String[] args) {
		//5. Data 인스턴스화  d
		Data d = new Data();
	
		//x에 값 10 넣기
		d.x = 10;
	
		//출력 main() : x = x의 값
		System.out.println("main() : x = " + d.x);
	
		//change메서드에 인자값 x 넣기
		change(d.x);
		
		System.out.println("After change(d.x)");
		//출력  main() : x = Data형 x값
		System.out.println("main() : x = " + d.x);
	
	}
	
	//1. 한개의 정수형 매개변수를 가진 클래스메서드 생성  change
	//2. 매개변수에 값 1000 넣기
	//3. 출력  change() : x = 매개변수값
	static void change(int x){
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	
}
