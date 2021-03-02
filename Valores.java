import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int a = input.nextInt();
		 int b = input.nextInt();
		 int c = input.nextInt();
		 
		 if(a > b) {
			 if(a > c) {
				 System.out.println("Maior:" + a);
				 if(b > c) {
					 System.out.println("Menor = " + c);
				 }else {
					 System.out.println("Menor = " + b);
				 }
			 }else {
				 System.out.println("Maior = " + c);
				 System.out.println("Menor = " + b);
			 }
		 }else{
			 if(b > c) {
				 System.out.println("Maior = " + b);
				 if(a > c) {
					 System.out.println("Menor = " + c);
				 }else {
					 System.out.println("Menor = " + a);
				 }
			 }else {
				 System.out.println("Maior = " + c);
				 System.out.println("Menor = " + a);
			 }
		 }
		 
		
		input.close();
	}

}
