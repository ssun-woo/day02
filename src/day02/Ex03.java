package day02;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 자료형 변환
		 - 특정 자료형을 다른 자료형으로 변환하는 것
		*/
		
		char ch = 'a';
		int num = 65;
		System.out.println( ch );
		System.out.println( num );
		System.out.println();
		
		// 2byte 공간에 4byte를 넣을 순 없다
		// 4byte 공간에는 2byte를 넣을 수 있다
		// 컴퓨터는 문자를 입력해도 숫자로 인식한다
		// ascii 코드에 의해 변환되서 출력된다
		
		char ch02 = (char)num; 
		// 뒤의 값에 변환시키고 싶은 자료형을 ()로 묶어서 적어준다
		// 강제형변환
		
		int num02 = ch;
		// 뒤에 따로 변환하지 않아도 자동으로됨
		// 자동형변환
		
		System.out.println(ch02);
		System.out.println(num02);
		
	
		
	}
}
