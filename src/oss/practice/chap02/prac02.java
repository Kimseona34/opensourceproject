package oss.practice.chap02;

import java.util.Scanner;

public class prac02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, a, b;
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>> ");
		num = scanner.nextInt();
		
		a = num / 10;
		b = num % 10;
		
		if(a==b)
			System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�");
		
		scanner.close();
		
	}

}
