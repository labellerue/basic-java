package h_javaLang;

import static java.lang.Math.*;

/**
 * Math 클래스
 * @author pc02
 *
 */
public class MathTest {
	public static void main(String[] args) {
//		Math클래스의 메서드를 활용해 봅시다~
		double d = 25.843636;
		
		//모든 메서드는 소숫점 첫째자리를 기준으로 한다.
		//반올림
		System.out.println(round(d));
		
		//올림
		System.out.println(ceil(d));
		
		//버림
		System.out.println(floor(d));
		
		//제곱
		int a = 2;
		System.out.println(pow(2, 3));	//2의 3승
		
		//루트
		int b = 3;
		System.out.println(sqrt(b));
		
		//1. Point 클래스를 만드세요
		
		//2. Point 클래스에 인스턴스 메서드를 만드세요. getDistance
		// 매개변수로 Point를 하나 받아서 현재 점과 매개변수로 받은 점 사이의 거리를 반환해주는 메서드입니다.
		// 소숫점 셋째자리에서 반올림하여 둘째자리까지 반환하도록 해주세요.
		
		//3. getDistance메서드를 호출해주세요
		
		
		Point3 pp = new Point3(1,1);
		float answer = pp.getDistance(new Point3(2,2));
		System.out.println(answer);
		
	}
}

class Point3{
	int x;
	int y;
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	float getDistance(Point3 p1){
		float answer = (float)sqrt(pow((x-p1.x),2)+pow((y-p1.y),2));
		answer = round((answer*100))/100f;
		return answer;
	}
	
	
}





