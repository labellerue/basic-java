package h_javaLang;

import java.util.Arrays;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneEx c1 = new CloneEx(5, 5);
		CloneEx c1Copy = (CloneEx)c1.clone();
		System.out.println(c1);			//복사 잘 됐나 확인~
		System.out.println(c1Copy);
		
		c1.x = 100;
		System.out.println(c1);
		System.out.println(c1Copy);
		
		CloneEx[] cArr = new CloneEx[]{new CloneEx(5, 5), new CloneEx(10, 10)};
		
		CloneEx[] cArrCopy = cArr.clone();
		
		System.out.println(Arrays.toString(cArr));
		System.out.println(Arrays.toString(cArrCopy));
		
		cArr[0].x =1000;
		System.out.println(Arrays.toString(cArr));
		System.out.println(Arrays.toString(cArrCopy));
		
		
		
		
		
	}
}

class CloneEx implements Cloneable{	//Cloneable 인터페이스 필수
	int x;
	int y;
	
	public CloneEx(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "CloneEx [x=" +x+", y=" +y+"]";
	}
	
	
	
	
	
}

