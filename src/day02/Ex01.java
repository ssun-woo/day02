package day02;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 변수 : 데이터를 저장하는 공간
		 자료형 : 데이터가 어떤 값인지에 따라 사용하는 값, 변수에 어떤 값을 사용할지 지정하는 값
		 	- int : 정수를 표현할 때 사용 (4byte)
			- float / double : 실수를 표현할 때 사용 (4 / 8byte)
			- char(character) : 문자(한글자)를 표현 (2byte)
			- boolean : true / false 를 표현 (1byte)
		 
	 	 bit >> 0 또는 1의 값(2진수의 한 자리)
		 byte >> 8개의 비트로 이루어진 값
		      >> int는 총 32비트, 0~32bit의 크기를 갖는다
		
		 변수 생성
		    - 자료형 변수명; / 자료형 변수명 = 값; (보통 변수명에는 의미를 부여해서 지정하는게 좋음)
			- 1number(x), n12yu123fa2(o) (변수명의 가장 앞에는 숫자가 올 수 없음)
			- changenumber => changeNumber, change_number 
				(합성어의 첫번째 글자는 '대문자'or'_'로 사용하는게 규칙)
			- 예약어는 사용할 수 없다 (print, System...)
		
		 값을 변수명에 저장
		
		*/
		
		int age = 50; 
		// 자료형 변수명 = 값;	
		// int age = 50.123; >> 자료형이 맞지 않으면 에러발생
		
		float height = 150.0f; 
		// 정수의 값은 자동으로 변환됨
		// float height = 150.0; >> 150.0은 8byte로 인식됨 
		// 150.0을 사용하기 위해선 마지막에 f를 붙여야함
		
		double weight = 20.0;
		// 자료형과 크기가 일치(값보다 자료형이 더 클경우도 가능) 하기 때문에 오류발생하지 않음
		
		
	
		
		System.out.println("나의 나이는 50살 입니다");
		System.out.println("나의 나이는 "+ age + "살 입니다");
		// 위의 두 결과가 같음
		System.out.println("나의 키는 "+ height + "(cm) 입니다");
		System.out.println("나의 몸무게는 "+ weight + "(kg) 입니다");
		
		System.out.println("나의 나이는 50살 입니다");
		System.out.println("50살의 홍길동 입니다");
		System.out.println("50살이지만 만으로는 49살입니다");
		// 해가 지나면 숫자를 일일이 바꿔줘야함(하드 코딩)
		
		System.out.println("나의 나이는 " + age + "입니다");
		System.out.println(age + "살의 홍길동 입니다");
		System.out.println(age + "살이지만 만으로는 "+ (age-1)+ "살입니다");
		
		
		
		
		
		
	}

}






































