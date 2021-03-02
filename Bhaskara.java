import java.lang.Math;

public class Bhaskara {

	public static void main(String[] args) {
		int a,b,c;
		a=1;
		b=6;
		c=9;
		double Delta = Math.pow(b,2) - 4*a*c;
		double X1 = (-b+Math.sqrt(Delta))/2*a;
		double X2 = (-b-Math.sqrt(Delta))/2*a;
		System.out.println("Valor X1:" + (double)X1);
		System.out.println("Valor X2:" + (double)X2);
	}

}
