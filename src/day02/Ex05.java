package day02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		// 사용자의 키보드로 부터 입력을 받아서 출력하는 변수명 >> Scanner
		Scanner input = new Scanner(System.in);
		int n;
		double dou;
		String str;
		// 어떠한 타입으로 입력받는지에 따라 선언해주면 됨
		
		System.out.print("정수 입력 : ");
		n = input.nextInt();
		System.out.println("입력한 정수 : " + n);
		
		System.out.println("실수 입력 : ");
		dou = input.nextDouble();
		System.out.println("입력한 실수 : " + dou);
		
		System.out.print("문자열 입력 : ");
		str = input.next();
		System.out.println("입력한 문자열 : " + str);
		
		
	}
}
