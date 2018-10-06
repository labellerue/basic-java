package z_exam;

public class test {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		
		String[] name = {"나진실","구인수","유다영"};
		String[] subject = {"국어","영어","수학","과학"};
		int[][] score = new int[name.length][subject.length];
		
		for(int i=0 ; i<score.length ; i++){
			for(int j=0 ; j<score[i].length ; j++){
				score[i][j] = (int)(Math.random()*19+25);
			}
		}
		int[] sum= new int[name.length];
		for(int i=0 ; i<name.length ; i++){
			for(int j=0 ; j<subject.length ; j++){
				sum[i]+= score[i][j];
			}
		}
		float[] avg = new float[name.length];
		for(int i=0 ; i<name.length ; i++){
			avg[i] = (float)sum[i]/subject.length;
			avg[i] = (int)(avg[i]*100+0.5)/100f;
		}
		int[] subSum = new int[subject.length];
		for(int j=0 ; j<subject.length ; j++){
			for(int i=0 ; i<name.length ; i++){
				subSum[j]+= score[i][j];
				}
			}
		float[] subAvg = new float[subject.length];
		for(int j=0 ; j<subject.length ; j++){
			subAvg[j] = (float)subSum[j]/name.length;
			subAvg[j] = (int)(subAvg[j]*100+0.5)/100f;
		}
		int[] rank = new int[name.length];
		int bigger = 1;
		for(int i=0; i<name.length ; i++){
			for(int z=0 ; z<name.length ; z++){
				if(sum[i]<sum[z]){
					rank[i]+=bigger;
					}
				}
				rank[i]+=1;
			}
		
		System.out.print("\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"과학");
		System.out.print("\t"+"합계"+"\t"+"평균"+"\t"+"석차");
		System.out.println();
		
		for(int i=0; i<name.length; i++){
			System.out.print(name[i]+"\t");
			for(int j=0 ; j<subject.length ; j++){
				System.out.print(score[i][j]+"\t");
				}
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(rank[i]+"\n");
			}
		System.out.print("과목합계"+"\t");
		for(int j=0; j<subject.length ; j++){
			System.out.print(subSum[j]+"\t");
			}
		System.out.println();
		System.out.print("과목평균"+"\t");
		for(int j=0; j<subject.length; j++){
			System.out.print(subAvg[j]+"\t");
			}
		
		
	}

}
