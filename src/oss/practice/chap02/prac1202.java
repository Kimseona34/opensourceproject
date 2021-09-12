package oss.practice.chap02;

import java.util.Scanner;

public class prac1202 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	      
	      String sign;
	      
	      System.out.print("연산>> ");
	      double number = scanner.nextDouble();
	      sign = scanner.next();
	      double number1 = scanner.nextDouble();

	      switch(sign) {
	      
	      case "+" :
	         System.out.print(number+sign+number1+"의 계산 결과는 "+(number+number1));
	         break;
	      case "-":
	          System.out.print(number+sign+number1+"의 계산 결과는 "+(number-number1));
	         break;
	      case "*":
	          System.out.print(number+sign+number1+"의 계산 결과는 "+(number*number1));
	         break;
	      case "/":
	        
	    	  if(number1==0) {
	            System.out.print("0으로 나눌 수 없습니다.");
	            break;
	            
	         }
	         else {
	            System.out.print(number+sign+number1+"의 계산 결과는 "+(number+number1));
	            break;
	         }
	      default:
	         System.out.print("잘못 입력하였습니다.");
	         break;
	      }
	      
	      scanner.close();
	      
	   }
	
	}
