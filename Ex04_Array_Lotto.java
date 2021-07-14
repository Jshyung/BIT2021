/*
 로또 프로그램
 1. 1~45까지의 난수를 발생시켜서 6개의 배열방에 담기
 (int)(Math.random()*45 +1)
 lotto[0]... lotto[5] ..방에넣기
 
 2.배열의 담긴 6개의 배열값은 중복값이 안나오게 (중복값검증)
 ex)
 lotto[0] = 45
 다시 난수값 추출 : 45 < lotto[1] 번방에 같은값이 안들어가게
 
 3. 배열에 담긴 6개의 값을 낮은 순으로 정렬시켜서 출력하기.
 
 4. 위결과가 담긴 배열 6개를 출력하기.
 
 class 빼서함수 만들기 x
 
  4가지를 main함수 안에서 해결...
  
 */
public class Ex04_Array_Lotto {

	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++)
		{
			lotto[i] = (int) (Math.random() * 45 + 1); // 1~45 난수
			for (int j = 0; j < i; j++) // 중복 제거하기
			{
				if (lotto[i] == lotto[j]) // 먼저 생성된 i를 j와 비교
				{
					i--; // 참이면 다시 돌리기
					
				}
			}
			for (int k = 0; k < i; k++) // 선택 정렬
			{
				if (lotto[i] < lotto[k]) // i와 k를 비교
				{
					int temp = lotto[i]; // i를 temp에 먼저 넣고
					lotto[i] = lotto[k]; // k를 i에 넣고
					lotto[k] = temp; // 다시 k에 temp를 넣는다
				}
			}
		}
		for (int i = 0; i < lotto.length; i++)
		{
			System.out.println(lotto[i]);
		}
//		int[] a = {0,0,0,0,0,0}; // 추출한 난수 초기화전상태
//		
//		int r = (int)(Math.random()*45 +1); //난수생성
//		int j ; // 공을뽑을때 직전까지 뽑는값 
//		a[0] = r; // 배열값에 첫번째 값;
//		
//		for(int i =1; i <a.length; i++) { // 6개의 변수를 뽑는다
//			r = (int)(Math.random()*45 +1);
//			
//			for(j =0; j<i; j++) {//직전까지 뽑은공
//				if(r == a[j]) { //중복이면 
//					break; // 뒤는무시
//				}
//		}
//		if (j==i) { // 중복없이 무사통과
//			a[i]=r; // 추출을 확정짓고
//			
//		}
//		else {// 중복발생했을때
//			--i;
//		}
//	
//	}
//	for(int i : a) {
//		System.out.print(i+"\t");
//	}
	}
}
		

	


