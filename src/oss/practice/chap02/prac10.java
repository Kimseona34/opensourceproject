package oss.practice.chap02;

import java.util.Scanner;

public class prac10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		double number = scanner.nextDouble();
		double number1 = scanner.nextDouble();
		double r = scanner.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>> ");
        double i = scanner.nextDouble();
        double j = scanner.nextDouble();
        double r1 = scanner.nextDouble();
      
        double distance = Math.sqrt(((number-i)*(number-i)) + ((number1-j)*(number1-j)));
      
        if(distance <= r+r1)
           System.out.print("두 원은 서로 겹친다.");
        else
           System.out.print("두 원은 서로 겹치지 않는다.");
        scanner.close();
   }
}
