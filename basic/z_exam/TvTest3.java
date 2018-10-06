package z_exam;

//Tv클래스를 생성하세요
class Tv{
	//Tv의 인스턴스변수 color, power, channel 을 선언하세요
	String color;
	boolean power;
	int channel;
	
	//인스턴스 메서드, 전원을 켜고 끄는 power 메서드를 만드세요
	void power(){
		power = !power; 
	}
	
	//인스턴스 메서드, 채널을 높이는 channelUp 메서드를 만드세요
	void channelUp(){
		channel++;
	}
	
	//인스턴스 메서드, 채널을 낮추는 channelDown 메서드를 만드세요
	void channelDown(){
		channel--;
	}
	
}


public class TvTest3 {
	public static void main(String[] args) {
		//Tv클래스를 인스턴스화 하세요. t1, t2
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//출력하세요
		//t1의 channel값은  * 입니다.
		//t2의 channel값은  * 입니다.
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		//t1의 주소를 t2에 저장하세요
		t2 = t1;
		
		//t1의 채널을 7로 변경해주세요
		t1.channel = 7;
		
		System.out.println("t1의 channel값을 7로 변경하였습니다");
		
		//t1의 channel값은  * 입니다.
		//t2의 channel값은  * 입니다.
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
	}

}
