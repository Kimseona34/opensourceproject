package oss.practice.chap02;

import java.util.Scanner;

public class prac06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		int number = scanner.nextInt();
		
		if(number != 0 && number>=1 && number <=99) { 
			int a,b; 
			a=number/10; 
			b=number%10; 
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println("¹Ú¼öÂ¦Â¦"); 
				}
			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)) {
				System.out.println("¹Ú¼öÂ¦"); } 
			} 
		else { 
		System.out.println("¼ıÀÚÀÇ ¹üÀ§¸¦ ¹ş¾î³µ½À´Ï´Ù."); 
		}
		scanner.close(); 
		}
}

		
			
		
		

