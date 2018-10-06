package e_oop;

public class Test01 {
	
	public static void main(String[] args) {
//		int[] all = new int[Test02.score.length];
//		Test02.method2();
//		Test02.method(all);
		
		Test03 n = new Test03();
		n.method(5);
		
		Test04.call();
	}
}
	
		
class Test02{
	
	 static String[] student = {"유민지", "변찬우", "이소형", "박찬배", "박진", "김지태", "나진실"};
	 static int[] score = new int[student.length];

	 static void method2(){
		 for(int i=0; i<score.length ; i++){
			 score[i] = (int)(Math.random()*101);
		 }
	 }
	 
	 static void method(int[] allScore){
		for(int i=0; i<allScore.length ; i++){
			System.out.print(student[i]+"\t");				
				System.out.print(score[i] + "\t");		
		}	
	}

}
		
class Test03{
	void method(int n){
		if(n==0)
			return;
		System.out.println(n);
		
		method(--n);
	}
}
class Test04{
	void insMethod(){System.out.println("인스턴스메소드당!");}
	static void clMethod(){System.out.println("클래스메소드당!");}

	static void call(){
		clMethod();
		Test04 tt = new Test04();
		tt.insMethod();
	}
}
		

