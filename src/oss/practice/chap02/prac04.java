package oss.practice.chap02;

import java.util.Scanner;

public class prac04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("정수 3개 입력>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if(a > b && a < c)
			System.out.print("중간 값은 " + a);
		else if (b > a && b < c)
			System.out.print("중간 값은 " + b);
		else
			System.out.print("중간 값은 " + c);
				
		scanner.close();
		
	}

}
