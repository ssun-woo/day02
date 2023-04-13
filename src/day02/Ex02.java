package day02;

public class Ex02 {
	public static void main(String[] args) {
		
		int num = 123;
		char ch = 'a'; 
		// char를 표현 할때는 ''안에 넣는다. ""안의 것들은 문자열로 인식한다
		System.out.println("변경 전");
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		System.out.println();
		
		// int num = 500; >> 같은 이름으로 다시 자료형을 선언할 수 없다
		// int num1 과 같이 다른건 사용 할 수 있음
		// 변수명만 사용해서 다시 선언 해주면 된다
		num = 500;
		ch = 'B';
		System.out.println("변경 후");
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		System.out.println();
		
		num = num + 200;
		System.out.println("num = num + 200");
		System.out.println("num : " + num);
		// 마지막으로 num의 값이 500이기 때문에 위의 식에 num에 500이 들어감
		
	}
}
