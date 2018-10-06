package h_javaLang;

/**
 * instance 사용법
 * .equals overriding
 * @author soso
 *
 */

public class EqualsTest02 {
	public static void main(String[] args) {
		Person p1 = new Person(931231L);		//주민번호 같은지 판단하는 법
		Person p2 = new Person(931231L);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		
		
	}

}

class Person{
	long id;
	
	public Person(long id){
		this.id = id;
	}
	
	public String toString(){
		return ""+id;
		
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Person && obj != null){
			result = id == ((Person)obj).id;	//null값이 들어가면 nullException 발생
		}
		return result;
	}
	
	
	
	
}