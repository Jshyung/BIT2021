/*
 1. 자바가 제공하는 기본타입 (시스템 타입) : 자료형 >> 8가지
 2. 8가지 기본타입 : 값을 저장
 3. 숫자 > 정수 (음의정수 , 0 , 양의정수) > byte (1byte) (-128 ~ 127)까지의 정수값 표현가능
 								    > char (한문자를 표현) >> 'A'  '가' , 'AB'(x) ' ' 안에는 한개의 문자만 가능		
 								     >> 영문자, 특수문자, 공백 : 1byte
 								     >> 한글 1자 : 2byte  한글과 영문자등 크기가 달라서 복잡
 								     >> 합의 char(2byte) 한글자(한문자)
 								     >> 국가간 협의 (Unicode) :2,3byte >> 아스키 코드
 								     >> 문자  -> 십진수 65. a -> 십진수 97 (아스키 코드표)
 								    >> short (c언어 호환성 2byte)
 								    >> int (4byte : -21억 .. ~ 21억 ...) ** java 정수 연산 기본타입 **
 								    >> long
 
 
 		> 실수						>> float (4byte) : 
 									>> double (8byte) : 정밀도 (표헌의 범위가 크다) **java 실수 연산 기본타입**
 			
 
 	논리 > 참,거짓(true,false)			>> boolean (프로그램의 논리적 흐름제어) 판단의 조건
 	
 	
 *** 문자열  표현(" ")  >> "홍길동", "Hello"
 String name = "홍길동"  >String 클래스(참조타입)
 
 그럼에도 불구하고
 별도의 이야기 전까지 Stirng은 9가지 기본타입으로 포함시킨다.
 int, double 과 동일하게 사용한다.
 
 자바는 크게
 1. 값 타입 : 8가지 기본타입 ( ex) int i = 100;  + String)

 2. 주소 타입(객체의 주소) : 클래스, 배열, 등... 변수의 값이 저장되는 것이 아니고 주소값이 저장되는 참조 타입.
 	
 	
 */

//참조타입

class Bus { //클래스 == 설계도 == 타입(큰타입)
	String color;
	int window;
}


public class Exo2_DataType {

	public static void main(String[] args) {
		int age = 100;
		System.out.println("age : " + age);
		
		Bus b = new Bus();
		b.color = "blue";
		b.window = 2;
		System.out.println("b 라는  Bus 타입 변수 : " + b); //Car@5
		System.out.println("b.window 개수 :" + b.window);
		
		// 변수
		// 선언과 동시에 초기화
		// 선언과 초기화를 분리할 수 있는것
		int i = 10;
		
		int j; // 선언
		j = 100; // 초기화
		System.out.println(j);
		
		int k;
		k = j; //POINT (값 할당)
		System.out.println("k : " + k);
		k = 300;
		
		System.out.println("k : " + k);
		System.out.println("j : " + j);
//		
//		int p, g, q;
//		p = 1;
//		g = 2;
//		q = 3;
		//같은 타입의 변수 3개를 만들고 값을 넣으세요 > int p, g, q;
		// int[] arr = new int[3] >> 연속적으로 같은 값은 배열을 사용한다.
		
		//int (-21 ~ 21)
		
		
		// 오늘 제일 중요한것!!!!!!!!
		
		// *literal : 있는 그대로의 값 > 소스코드에서 개발자가 직접 입력한 값;
		// 정수 리터럴 [** 정수를 표현하는 기본값은(default) int 범위]
		int p = 100000; // 우리가 입력하는 정보는 4byte int라는 그릇에 들어가있음, 그것을 리터럴이라고함. 
		//long l = 10000000000; 
		// 입력하는 정수값은 기본적인 그릇의 크기가 4byte 
		long l = 10000000000L; //강제로 그릇의 크기를 8byte로 늘린것
		
		//int p2 = 10000L;// 그릇의 크기가 다른것. 작은 그릇에 큰 그릇의 값을 넣을수 없다.
		int p2 = (int)10000L;
		// 위의문법이 문제가 있다, 없다
		
		int p3 = (int)100000000000L; // 값을 초과해서 버려지는 값이 발생.
		System.out.println(p3);
		
		long p4 = 100000000000L; // 값에 맞게 앞에 
		System.out.println(p4);
		
		//정수 리터럴의 기본 타입은 int. ***Point
		
		//char : 2byte : 한문자를 저장할 수 있는 타입. 내부적으로는 정수값을 가지고 있다.
		// 한문자 : 'A' << char ch = 'a'; char ch2 = '가'; 
		// 문자열 : "아무개" , "ABC" > String str = "아무개";
		
		char single = '가';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);
		//char는 문자를 저장하지만 내부적으로 정수값을 가지고있다.
		int intch = 'A';
		System.out.println("intch : " + intch);  // 내부족으로 자동 형변환 (아스키코드표 참고)
		System.out.println("intch : " + (char)intch); //char 값은 숫자값으로, 숫자값을 char값으로 변환가능
		// char 와 정수(int) 서로 호환가능하다.
		// 문자 -> 숫자, 숫자(char) -> 문자[숫자를 문자로 바꾸는 과정만 casting 이필요)
		
		char ch2 = 'a';
		//정수값을 출력하시오.
		System.out.println((int)ch2);
//		int intch2 = (int)ch2;
//		System.out.println(intch2);

		int intch3 = 65;
		//char ch3 = intch3;
		// why?
		// 값을 보지말고 값이 가지는 타입을 보자. int 가 char 보다 크기때문에 넣을 수 없음
		// 강제적 형변환 (명시적)
		char ch3 = (char)intch3;
		System.out.println("ch3 : " + ch3);
		
		//발생할 수 있는 문제점
		//key point : 65라는 숫자가 char 타입에 속하는 경우(데이터 손실없이 ) 가능
		// int ch3 = 9999999; >>  큰것을 작은 것에 넣는다면 (데이터 손실이 발생)
		
		int intch4 = ch3; // 컴파일러가 자동으로 형변환 해주는것은 명시적 형변환
		// 내부적으로 컴파일러는 (int intch4 = (int)ch3; >> 코드 재생산 실행)
		
		/*
		Today  Point
		1. 할당에서 변수가 가지고 있는 값을 보지말고 변수의 타입을 보자.
		1.1 정수 리터럴(literor)의 기본 타입은 int.
		2. 변수가 가지는 타입을 확인하자.
		3. 큰타입 에는 작은 타입을 넣을 수 있다.(자동 형변환)
		4. 작은타입에는 큰타입을 넣을 수 없다. (하고싶다면? : 강제 형변환) > 타입앞에 가로로 
		ex) 
		char <-- int >> char <--(char)int 데이터 손실의 책임은 사용자가.
		int <-- char >> 문제 없음. 컴파일러가 자동으로 int <--(int)char 작업...
		
		
		 */
//		int intvalue = 1015555;
//		byte bytevalue = (byte)intvalue;
//		System.out.println(bytevalue); // 원하지 않는 쓰레기값.. 나오지 않게 고민
//		
		int intvalue = 10;
		byte bytevalue = (byte)intvalue;
		System.out.println(bytevalue); // 값이 작다면 오류를 만날 일은 없지만. 값이 클 경우를 대비하자...
		
		//String (문자열)
		String name = "hello world";
		System.out.println(name);
		
		String name2 = name + "반가반가";
		System.out.println(name2); // 문자열 + 문자열 (결합)
		// 자바 : + (산술과 결합)
		// Oracle : + 산술만함, || 결합연산자 >> '안녕' || '하세요' ( '안녕하세요')
		
		//Tip) java 에서 특수문자
		//이스케이프 문자 >> 특정한 문자 앞에 \ 
		char sing = '\'';
		System.out.println(sing);
		
		
		// \(역슬러시)와 결합하면 문자로 인정
		 //홍"길"동 String 변수에 담아서 ㅅ출
		
		String name3 = "홍\"길\"동";
		System.out.println(name3);
		
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4;
		System.out.println(result); //100010
		
		
	//형변환 (+산술, 결합)
		System.out.println("100" + 100);
		System.out.println(100 + "100");
		System.out.println(100 + 100 + "100");
		System.out.println(100 + (100+"100"));
		System.out.println(100 +"100" + 100);
		
		//c:\temp 문자열을 String 변수에 넣고 출력하기
		String temp = "c:\\temp";
		System.out.println("temp : " + temp);
		// \t >> tab,  \n >> new line
		String temp2 = "\ta\ta\na";
		System.out.println(temp2);
		
		//실수형 (부동 소수점)
		//float (4byte)
		//double(8byte) ***실수 리터럴의 기본타입 : double ***
		//float f =3.14; // 3.14 리터럴은 default double
		//float f =3.14f; // 1. 접미사(f, F) float
		//float f =3.14F;
		float f = (float)3.14;
		System.out.println("f : " + f);
		
		float f2 = 1.123456789f;
		System.out.println("f2 : " + f2);
		//f2 : 1.1234568
		//소수 이하 대략 7자리 
		//default 반올림
		
		double d = 1.123456789123456789;
		System.out.println("d : " + d);
		// 대략 소수이하 16자리
		// default 반올림
		
	System.out.println((byte)129);
	//byte > 8bit > -128 ~ 127 
	//overflow 시 순환...
	
	byte by = (byte)129;
	System.out.println("순환 : overflow : " + by); //-127
	
	double d2 = 100; //암시적 형변환 (double)100
	System.out.println(d2);
	
	//quiz
	double d3 = 10.5;
	int z = 100;
	//int result5 = d3 + z;
	// 위코드가 error 없이 처리
	//1. int result5 = (double)d3 + z;
	//2. int result5 = (int)(d3 + z); > 데이터의 손실이 있을 수 있음.
	//3. int result5 = (int)d3 + z; > 데이터의 손실이 있을 수 있음
	//4. double result5 = d3 + z;
	double result5 = d3 + z;
	System.out.println(result5);
	
	//Today Point
	// 작은타입 + 큰타입 >> 큰타입.
	// 명시적 형변환 고민.(casting) 손실데이터에 대해 고민해봐야함.
	
	int i6 = 100;
	byte b2 = (byte)16; // 명시적 형변환 > 데이터손실에 대해 고민해야한다.
	System.out.println(b2);
	
	
	}

}
