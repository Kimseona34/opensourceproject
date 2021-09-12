package oss.practice.chap02;

import java.util.Scanner;

public class prac02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, a, b;
		
		System.out.print("2자리수 정수 입력(10~99)>> ");
		num = scanner.nextInt();
		
		a = num / 10;
		b = num % 10;
		
		if(a==b)
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.print("No! 10의 자리와 1의 자리가 같지 않습니다");
		
		scanner.close();
		
	}

}
