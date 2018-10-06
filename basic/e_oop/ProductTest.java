package e_oop;

public class ProductTest {
	public static void main(String[] args) {
		System.out.println(Init.action);//명시적 초기화:10 => 초기화 블럭으로 감:60
		
		Init i = new Init(200);//첫 초기화값:0 => 초기화블럭:100 => 메소드에 인자값 들어감:200
		System.out.println(i.action2);
		

		
	}

}


//시작할 때 사용하는 클래스명 Init
class Init{
	static int action = 10;	//명시적 초기화
	int action2;
	
	Init(){
		action2 = 50;
	}
	
	Init(int action2){
		this.action2 = action2;
	}
	
	{//인스턴스초기화블럭		생성자보자 효율성이 좋음
		action2=100;
		
	}
	
	static{//클래스초기화블럭
		action = 60;
	}
	
	
	
}













