package z_exam;

//1. Data2클래스 생성
class Data2{
	//정수형 변수 x 선언
	int x;
}

public class ReferenceReturnEx {
	public static void main(String[] args) {
		//Data2클래스 인스턴스화 d
		Data2 d = new Data2();
		
		//x값을 10으로 저장
		d.x = 10;
		
		//Data2형 변수를 새로 선언하여 copy메서드로 초기화
		//인자값 d
		Data2 d2 = copy(d);
		
		//첫번째 변수와 두번째 변수의 x값 출력
		System.out.println("d.x: " + d.x);
		System.out.println("d2.x: " + d2.x);
	}
	
	//1. Data2를 받아 그 복사본을 반환하는 클래스 메서드 생성 copy
	static Data2 copy(Data2 d){
		Data2 tmp = new Data2();
		tmp.x = d.x;
		return tmp;
	}
	 

}
