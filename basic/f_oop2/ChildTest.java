package f_oop2;

public class ChildTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.volume= 15;
		c.volumeUp();
		System.out.println(c.volume);
		
		c.channel = 20;
		c.channelUp();
		System.out.println(c.channel);
		
		
		
		
	}

}

class Parent{
	int channel;
	void channelUp(){
		channel++;
	}
}


class Child extends Parent{
	int volume;
	int channel;
	void volumeUp(){
		volume++;
	}
	
}