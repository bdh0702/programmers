package level1;

import java.util.Arrays;

public class Math_giveup {

	
	public int[] solution(int[] answers) {
		int max,count=0;
		int[] a = {1,2,3,4,5}; //5
		int[] b = {2,1,2,3,2,4,2,5}; //8
		int[] c = {3,3,1,1,2,2,4,4,5,5}; //10
		int[] result = new int[3];
		int[] answer;
		for(int i=0; i<answers.length; i++) {
			if(answers[i]==a[i%5]) result[0]+=1;
			if(answers[i]==b[i%8]) result[1]+=1;
			if(answers[i]==c[i%10]) result[2]+=1;
		}
		max=result[0];
		for(int i=1; i<result.length; i++) {
			if(max<result[i]) {
				max = result[i];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			if(max==result[i]) count++;
			else {
				result[i]=0;
			}
		}
		int j=0;
		answer = new int[count];
		for(int i=0; i<result.length; i++) {
			if(result[i]!=0) {
				answer[j]=i+1;
				System.out.print(answer[j]+" ");
				j++;
			}
		}
		Arrays.sort(answer);
		return answer;
	}
	
	
	public static void main(String args[]) {
		Math_giveup a = new Math_giveup();
		int[] answers = {1,2,3,4,5};
		a.solution(answers);
	}
}
