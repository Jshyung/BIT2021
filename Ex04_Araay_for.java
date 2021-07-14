
public class Ex04_Araay_for {

	public static void main(String[] args) {
//		Today Point
//		향상된 for문, 개선된 for문
//		JAVA : for(type 변수명 : array or collection {실행블럭}
//		C# : for(type 변수명 : in array or collection {실행블럭}
//		JavaScript : for(type 변수명 in 배열){실행블럭}
		
		int[]arr = {5,6,7,8,9};
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*********************");
//		개선된 for
		for(int value : arr) { // 논리가 생략되어있음, 논리는 컴파일러가 대신해줌
			System.out.println(value);
			
			}
		String [] strarr = {"A","B","C","D","FFFF"};
		for(String value : strarr) {
			System.out.println(value);
		}
		
		}

	}


