
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// 수학과 학생들의 기말고사 점수
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; // max라는 변수에는 79가 들어있는것
		int min = score[0]; // min라는 변수에도 79가들어감
		
		/*
		제어문을 사용해서 max라는 변수에 시험점수중에서 가장큰 최대값을 담고
		min이라는 변수에는 시험점수중에 최소값을 담아라
		
		출력결과는 : max = 97
				  min = 54
		조건)for문은 한번만 사용해라.
		 */
		
		for(int i =1; i<score.length; i++) {
			System.out.println(score[i]);
			
//			if(max <score[i]) {max = score[i];}
//			if(score[i]< min) {min = score[i];}
//			if를 안쓰고 3항연산자로도 가능
			max = (score[i]>max) ? score[i] : max;
			min = (score[i]<min) ? score[i] : min;

	}
		System.out.println("max 는 : " +max);
		System.out.println("min 는 : " +min);
		
		int[] numbers = new int[10];
//		10개의 정수방이 만들어지고 그방에는 default :0
//		10개의 방에있는값을 1~10 까지의 정수로 초기화
//		ex) number[0] = 1
		
		for(int i =0; i<numbers.length; i++){
			System.out.println(numbers[i]);
			numbers[i] = i + 1; // i를돌면서 1을더해줌 1+2+3+4+.....
		}
		
		
		for(int i =0; i<numbers.length; i++){
		System.out.println(numbers[i]);
		}
//		기말고사 시험점수 5과목 
		int sum =0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,70};
		/*
		 1. 총과목의 수
		 2. 과목의 합 =sum
		 3. 과목의 평균 = average 전체합을 과목수로 나눈것
		 단. 2번과 3번은 하나의 for문으로 해결하기.
		 어려우면 for문 2개사용가능
		 */
		for(int i = 0; i<jumsu.length; i ++) {
			System.out.println("점수는 : " +jumsu[i]);
				sum += jumsu[i];
			if(i == jumsu.length-1) {
				average = sum/(float)jumsu.length;
			}
		
			
		}
		System.out.println("과목합계는 : " +sum);
		
		System.out.println(average);
		
	}
}

