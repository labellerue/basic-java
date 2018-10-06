package z_exam;

public class TotalTest {//0 TotalTest클래스가 컴파일되어 MethodArea에 로드됩니다
						//클래스 친구들인 클래스 변수와 클래스 메서드를 호출합니다.
							
	public static void main(String[] args) {//0 클래스 메서드인 main()이 호출되어 MethodArea에 로드되고
											//함수이므로 CallStack에 쌓입니다.
		
		TvMaker.color = "Blue"; //0 TvMaker클래스가 MethodArea에 로드됩니다.
								//TvMaker내에 있는 클래스 변수와 클래스 메서드가 로드됩니다.
								//로드됨과 동시에 초기화 됩니다. color=null, inch=0
								//TvMaker클래스의 클래스전역변수인 color는 "Blue"로 초기화 됩니다.
		TvMaker tm = new TvMaker(); //0 TvMaker클래스는 이미 MethodArea에 로드되어있습니다.
								    //TvMaker형인 참조변수 tm은 main메서드에 선언된 지역변수로 CallStack에 있는 main()안에 생깁니다.
									//new를 통해  tm이라는 주소가 생기고
									//TvMaker내에 있는 인스턴스 변수와 인스턴스 메서드가 heap에 로드됨과 동시에 초기화됩니다.  
									//name="", age=0, TvMaker(), TvMaker(String, int)
									//=을 통해 지역변수 tm과 주소인 tm이 연결됩니다. 
									//0 TvMaker()생성자가 CallStack에 쌓입니다.
									//this가 가리키는 TvMaker(String, int)가 CallStack에 로드됩니다.
									//TvMaker()는 또다른 생성자인 TvMaker(String, int)에게 인자값 "man",25을 보냅니다.
									//TvMaker(String, int)는 인스턴스 전역변수인 name과 age에게 각각 "man",25값으로 초기화 합니다.
									//TvMaker(String, int)는 퇴근합니다
									//TvMaker()도 퇴근합니다.
		tm.age = 30; //0 tm주소를 타고 heap영역에 age의 값을 30으로 초기화 합니다.
		//3. 메서드 호출
		// 3.1 
		System.out.println(TvControll.channel); //-1 TvControll클래스가 MethodArea에 로드됩니다.
												//TvControll내에 있는 클래스 변수와 클래스 메서드가 로드됩니다.
												//로드됨과 동시에 초기화 됩니다.  MAX_CHANNEL= 50, MIN_CHANNEL= 1, channel = 15,  volumeDown()
												//TvControll클래스의 클래스전역변수인 channel 값을 콘솔창에 출력합니다.
												//15
		TvControll.volumeDown();//TvControll클래스 내에 있는 volumeDown()가 호출되어 CallStack에 쌓입니다.
								//volumeDown()는 int형 값을 돌려주는 함수입니다.
								// 1 조건에 따라 채널을 변경하는 메서드로, 현재 channel값은 15이기 때문에 채널을 한번 올려주고 올려진 값이 반환됩니다.
								//channel=16
								//퇴근합니다.
		System.out.println(TvControll.channel); //TvControll클래스는 이미 MethodArea에 로드되어 있습니다.
												//channel 값이 16이기 때문에 콘솔창에 출력합니다.
												//16
		// 3.2
		TvControll tc; //TvControㅣl형인 참조변수 tc는 main메서드에 선언된 지역변수로 CallStack에 있는 main()안에 생깁니다.
		tc = new TvControll();  //0 new를 통해  tc이라는 주소가 생기고 참조하고 있는 클래스의 인스턴스 변수와 인스턴스 메서드가 heap에 로드됨과 동시에 초기화 됩니다.
								//TvControll내에 있는 인스턴스 변수와 인스턴스 메서드가 heap에 로드됨과 동시에 초기화됩니다. 
								//MAX_VOLUME = 100, MIN_VOLUME = 0, volume = 99, volumeUp()
								//생성자 TvControll()가 컴파일러에 의해 기본모습으로 TvControll클래스에 생성됩니다.
								//CallStack에 쌓이고 지역변수 tc와 heap영역의 tc의 주소가 연결됩니다. 아무 내용이 없기 때문에 퇴근합니다.
		System.out.println(tc.volume);// -1 tc의 주소를 타고 내려가 volume의 값을 콘솔창에 출력합니다.
									  //99
		tc.volumeUp();//tc의 주소를 타고 내려가 volumeUp()이 CallStack에 
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);
		
		//
		Calc cc = new Calc(); // -1(힙메모리에 적어준다)
		System.out.println(cc.add(Integer.MAX_VALUE, 4)); // -1(int,int 메서드) ,0 (int의 최대값) , 0(오버플로가 발생)
		System.out.println(cc.add(3L, Integer.MAX_VALUE));// -1 
		
	}
}
	class TvMaker{
		//1.
		//  1.1 
		static String color; 
		static int inch; 
		//  1.2  0
		String name = "";
		int age;
		//2.
		//  2.1  -1 , 0
		TvMaker(){ 
			this("man",25); 
			// 1 
		}
		//  2.2  -1 , 0 
		TvMaker(String name, int age){
			this.name = name;
			this.age = age;
		}
	}
		
	class TvControll{ // 0
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		static final int MAX_CHANNEL= 50;
		static final int MIN_CHANNEL= 1;
		
		static int channel = 15;
		int volume = 99;

		//4. return문 , 0(void가 적혀있지 않다)
		int volumeUp(){ // -1
			if(volume == MAX_VOLUME){
				volume = MIN_VOLUME;
			}else{
				volume++;
				
				
				
				
			}
			
			return volume;
		}
		
		static int volumeDown(){ // -1 
			if(channel == MAX_CHANNEL){
				channel = MIN_CHANNEL;
			}else{
				channel++;
			}
			return channel;
		}
	}
	
	class Calc{ // -1 (오버로딩), -1(오버로딩의 특징) 
		//5.
		int add(int a, int b){
			return a+b;
		}
		long add(long a, int b){
			return a+b;
		}
		
		
		int minus(int a, int b){
			return a+b;
		}
	}