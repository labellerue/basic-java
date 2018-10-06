package e_oop;

import java.util.Scanner;

public class DiceTest {
	public static void main(String[] args) {

		//throwDice()를 호출하면 
		//System.out.println(result 이동할 칸 수);
		DoubleDice dice = new DoubleDice();
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위를 던지시려면 Enter를 치세요!");	//사용자 놀이 시작!
		String deonjeo;

		do{
			deonjeo = sc.nextLine();
			if(deonjeo.equals("")){							//enter값을 쳤을 때 주사위 돌리기
				int result = dice.throwDice();				//모두 합친 주사위 값 받기
				System.out.println("이동할 칸 수: "+result);
				System.out.println("다시 던지기: Enter  나가기: exit");
			}
		}while(!deonjeo.equals("exit"));					//exit에서 나가기
	}
}


class DoubleDice{
	
	//메서드명 throwDice
	//주사위 두개 던지고 나온 수 합만큼 리턴합니다.
	//주사위 두개의 값이 같으면 한번 더 던질 수 있다. 재귀호출을 이용하세요

	int throwDice(){
		int diceNum1 = (int)(Math.random()*6+1);			//주사위 랜덤
		int diceNum2 = (int)(Math.random()*6+1);
		System.out.print(diceNum1+"랑 "+ diceNum2+"가 나왔습니다~   ");
		int result = diceNum1 + diceNum2;					//처음 주사위를 돌렸을 때 합
		if(diceNum1==diceNum2){								//같은 수가 나왔을 경우 또 돌리기
			System.out.println("더블입니다! 한번 더 돌려요~ Enter!");
			Scanner sc = new Scanner(System.in);			//사용자가 한번 더 돌리기
			String deonjeo = sc.nextLine();
			if(deonjeo.equals("")){
				result = result + throwDice();				//재귀함수로 이전 주사위값+새로운 주사위값
			}
		}
		return result;										//합계 return
	}
}





