package oss.practice.chap02;

import java.util.Scanner;

public class prac10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> ");
		double number = scanner.nextDouble();
		double number1 = scanner.nextDouble();
		double r = scanner.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> ");
        double i = scanner.nextDouble();
        double j = scanner.nextDouble();
        double r1 = scanner.nextDouble();
      
        double distance = Math.sqrt(((number-i)*(number-i)) + ((number1-j)*(number1-j)));
      
        if(distance <= r+r1)
           System.out.print("�� ���� ���� ��ģ��.");
        else
           System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
        scanner.close();
   }
}
