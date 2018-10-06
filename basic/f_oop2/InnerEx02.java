package f_oop2;

/**
 * 내부클래스
 * @author pc02
 *
 */
public class InnerEx02 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner inn = o.new Inner();	//Inner클래스 타입은 Outer의 Inner 타입
		inn.method();
	}
}


class Outer{
	int value = 20;
	
	class Inner{
		int value = 30;
		
		void method(){
			int value = 40;
			System.out.println(value); //40
			System.out.println(this.value); //30
			System.out.println(Outer.this.value); //20
		}
	}
	
	
}