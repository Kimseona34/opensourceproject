package oss.practice.chap02;

import java.util.Scanner;

public class prac04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("���� 3�� �Է�>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if(a > b && a < c)
			System.out.print("�߰� ���� " + a);
		else if (b > a && b < c)
			System.out.print("�߰� ���� " + b);
		else
			System.out.print("�߰� ���� " + c);
				
		scanner.close();
		
	}

}
