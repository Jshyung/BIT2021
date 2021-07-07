
public class Variable {

	public static void main(String[] args) {
			int a = 1; //number -> integer(정수)
			System.out.println(a);
			//int b = 1.1; // 정수 타입을 선언했는데 실수가와서 오류
			double b = 1.1;
			System.out.println(b);
			
			String c = "Hello World";
			System.out.println(c);
			
			//변수의 효용
			String name = "egoing";
			System.out.println("hello, "+ name +"... "+ name +" ... bye");
			
			double VAT = 10.0;
			System.out.println(VAT);
			//코드는 내가 보고, 남이보고 또 미래의 내가 보기에 값을 쓸때 무슨값을 썻는지 쉽게 파악하
			
			//CASTING 
			double k = 1.1;
			double l =1; // 손실이 없으므로바로 컴파일링 해줌
			System.out.println(l); // 1.0 이나옴
			
			//int j = 1.1;
			double m = 1.1;
			int n = (int) 1.1; // 1.1은 정수형으로 casting 한다면 1.1 > 1.0 으로 손실이 나므로 안해준
			System.out.println(n);
			
			

	}

}
