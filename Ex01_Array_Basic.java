import java.util.Arrays;

/*
 배열은 객체다. !!!!!! 매우중요
 1. 배열은 new 를 통해 만든다.
 2. 그배열은 heap 메모리에 만들어진다.
 3. 고정배열(정적) 배열의 크기가 한번 정해지면 변경 불가(고정). <-> Collection (동적배열)
 4. 같은 데이터 표현 : 일반변수 ,, Array >> Array 추가점수 : 자료구조 필수 요소
 
 */
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		int s, s1, s2, s3; // 같은 타입의 변수
		int[] score = new int[3]; // int 방 3개를 연속적으로 생성.. 생성된 방은(방번호[index]:첨자) 방의 시작값은 정의되어잇음 : 0
		System.out.println(score[0]); // 배열 타입은 default 값. //배열값 road
		score[0] = 106;
		score[1] = 103;
		score[2] = 105;
		System.out.println(score[0]); // n개의 방이라면 >> n-1 마지막 index 와 같은 값이다.
//		방의 개수는 index(첨자)값보다 1크다.
//		score[3] = 50; // 예외처리 오류가뜸.
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
//		ㄴ 없는방을 사용하려고 한다면...
//		제어문 (배열 : Array ) 조합이 좋은것 >> for문
		for(int i =0; i <3; i++) {
			System.out.printf("[%d]=[%d]\t",i,score[i]);
		}
		System.out.println();
//			위는 잘 안쓴다. why? 배열의 갯수가 적기때문. 갯수가 많으면 힘들다.
			for(int i =0; i< score.length;i++) { // score.length = length 는 배열의 인덱스 값을 가져온다.
				System.out.printf("[%d]=[%d]\t",i,score[i]);
			}
			System.out.println(); 
//			Tip!!! Array를 도와주는 클래스(금기 : 초보자에게) why? 초보자는 배열을 풀여야하지만
//			알아서 배열을 풀어줌. 나중에 실력을 쌓고 사용하자.
//			for 문을 사용하지 않아도 배열방에 있는 값을 이쁘게 출
			Arrays.sort(score);
			String resultarray = Arrays.toString(score);
			System.out.println(resultarray);
			
			//입사시험
//			12,8,1,20  낮은순서대로 출력
			//1. Arrays.sort
			//2. for문 돌면서 서로비교하면서 순서를 정의 출력
			
//			Today Point !!! 암기!!!
//			배열을 생성 방법 3가지
			int []arr = new int[5]; //>> 제일기본
			int []arr2 = new int[] {10,20,30}; // 초기값을 정의해서 방을 만들고 초기화
			int []arr3 = {11,22,33,44}; // 컴파일러가 알아서 
										// 내부적으로 new 하고 값을 사용
										// javascript  let carrarr = [1,2,3,4,5]
//			arr 한배열 안에 있는 값을 출력
			arr[0] = 100;
			arr[1] = 101;
			arr[2] = 102;
			arr[3] = 103;
			arr[4] = 104;
			for(int index = 0; index <arr.length; index++) {
				System.out.println(arr[index]); // 방에 접근하는방법 
			}
//			배열은 객체다.
//			new를 통해서 memory(heap)
//			선언과 할당
			int[] arr4 ; //선언 arr4 는 참조변수(주소)
			arr4 = new int[] {11,22,33,44,55}; // 주소값을 할당
			System.out.println(arr4); //[I@74a14482
			
			int[] arr5 = arr4; //주소값 할당
			System.out.println(arr4 == arr5);
//			Array의 타입은 8가지 + String + ***사용자 정의 타입(class)
			String[] strarr = new String[] {"가", "나", "다"};
			for(int i = 0; i <strarr.length; i++) {
				System.out.println(strarr[i]);
				
			}
			
			char[] charr = new char[10]; // default 빈문자 \0000
			for(int i =0; i <charr.length; i++) {
				System.out.println(">"+ charr[i]+"<");
			}
//			오늘의 제일중요한부분
//			객체 배열
//			class Car{}
//			자동차 10대 생산
//			Car c = new Car(); Car c2 = new Car(); ... 비효율
//			Car[] carc = new Car[10];
		}
		
	

}
