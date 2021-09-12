package oss.practice.chap02;

import java.util.Scanner;

public class prac1201 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	      
	      String sign;
	      System.out.print("연산>>");
	      double number = scanner.nextDouble();
	      sign = scanner.next();
	      double number1 = scanner.nextDouble();
	      
	      if(sign.equals("+"))
	         System.out.print(number+sign+number1+"의 계산 결과는 "+(number + number1));
	      else if(sign.equals("-"))
	     	 System.out.print(number+sign+number1+"의 계산 결과는 "+(number - number1));
	      else if(sign.equals("*"))
	         System.out.print(number+sign+number1+"의 계산 결과는 "+(number*number1));
	      else if(sign.equals("/"))
	      {  
	         if(number1==0)
	            System.out.print("0으로 나눌 수 없습니다.");
	         else
	            System.out.print(number+sign+number1+"의 계산 결과는 "+(number/number1));
	      }
	      scanner.close();
	   }
	}