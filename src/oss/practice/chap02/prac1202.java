package oss.practice.chap02;

import java.util.Scanner;

public class prac1202 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	      
	      String sign;
	      
	      System.out.print("����>> ");
	      double number = scanner.nextDouble();
	      sign = scanner.next();
	      double number1 = scanner.nextDouble();

	      switch(sign) {
	      
	      case "+" :
	         System.out.print(number+sign+number1+"�� ��� ����� "+(number+number1));
	         break;
	      case "-":
	          System.out.print(number+sign+number1+"�� ��� ����� "+(number-number1));
	         break;
	      case "*":
	          System.out.print(number+sign+number1+"�� ��� ����� "+(number*number1));
	         break;
	      case "/":
	        
	    	  if(number1==0) {
	            System.out.print("0���� ���� �� �����ϴ�.");
	            break;
	            
	         }
	         else {
	            System.out.print(number+sign+number1+"�� ��� ����� "+(number+number1));
	            break;
	         }
	      default:
	         System.out.print("�߸� �Է��Ͽ����ϴ�.");
	         break;
	      }
	      
	      scanner.close();
	      
	   }
	
	}
