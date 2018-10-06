package f_oop2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 100;		//변수에 직접 접근하면 안됨. 함수를 통해 24시간 환산
		t.setHour(117);
		t.setMinute(330);
		t.setSecond(100000);
		System.out.println(t.getHour()+"시간 "+ t.getMinute()+"분 "+t.getSecond()+"초");
		System.out.println(t.getTime());
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour){
		this.hour = hour%24;
	}
	
	public int getHour(){
		return hour;
	}
	
	public void setMinute(int minute){
		this.minute = minute%60;
		setHour(hour+minute/60);
	}
	
	public int getMinute(){
		return minute;
	}
	
	
	public void setSecond(int second){
		this.second = second%60;
		setMinute(minute+second/60);
	}
	
	public int getSecond(){
		return second;
	}
	
	public String getTime(){
		return hour + "시간 " +minute + "분 "+ second+ "초";
	}
	
	
}