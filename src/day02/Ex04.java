package day02;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 상수 : 한 번 저장하면 변경할 수 없다
		 */
		
		int num = 100;
		num = 200;
		// 일반적인 변수
		System.out.println(num);
		
		final int num01 = 200;
		// num2 = 300;
		// final로 저장된 변수는 다시 재정의 할 수 없다
		// 어디서 어떻게 사용되든지 처음 설정한 값으로 나온다
		System.out.println( num01 );
		
		String name = "홍길동";
		// String : 문자열을 설정하기 위한 변수명
		// ""안에 내용을 넣어야 한다
		System.out.println( name );
		
		final String KOREA = "대한민국";
		// KOREA = "미국";
		// 이렇게 선언하면 바뀌기 때문에 상수화 시켜야한다
		System.out.println( KOREA );
		// 보편적으로 상수화 시키는 값들은 대문자로 표현한다
		
		
		boolean bool = true;
		System.out.println( bool );
		bool = false;
		System.out.println( bool );
		
		String addr;
		// 변수명을 미리 지정해 놓는 경우도 있다
		addr = "산골짜기";
		System.out.println( addr );
		
		int n1, n2, sum;
		n1 = 10;
		n2 = 20;
		sum = n1 + n2;
		System.out.println( sum );
		System.out.println( n1+n2 );
		
		int num1, num2, sum2;
		// System.out.println( sum2 );
		// sum2에 어떠한 값도 저장하지 않았기 때문에 출력 할 수 없음 >> 에러 발생
		// sum2 = num1 + num2;
		// num1, num2에 어떠한 값도 저장하지 않았기 때문에 출력할 수 없음 >> 에러 발생
		
		// 초기화
		int nu1=0, nu2=0, su2=0;
		su2 = nu1 + nu2;
		System.out.println( su2 );
		// 초기화한 값들에 대해서는 오류가 발생하지 않음
		
		String a;
		// System.out.println(a);
		// 알 수 없는 값은 에러발생
		
		String b = null;
		System.out.println(b);
		// 변수명이 대문자로 시작 >> 초기화 값은 null
		// 변수명이 소문자로 시작 >> 초기화 값은 0
		
	}
	

}





























