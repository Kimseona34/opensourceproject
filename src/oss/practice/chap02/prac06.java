package oss.practice.chap02;

import java.util.Scanner;

public class prac06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int number = scanner.nextInt();
		
		if(number != 0 && number>=1 && number <=99) { 
			int a,b; 
			a=number/10; 
			b=number%10; 
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println("�ڼ�¦¦"); 
				}
			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)) {
				System.out.println("�ڼ�¦"); } 
			} 
		else { 
		System.out.println("������ ������ ������ϴ�."); 
		}
		scanner.close(); 
		}
}

		
			
		
		

