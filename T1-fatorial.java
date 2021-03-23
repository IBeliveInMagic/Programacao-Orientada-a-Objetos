
public class fatorial {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++) {
			int fatorial = 1;
			for(int j = i ; j>0 ; j--) {
				fatorial = fatorial * j;
			}
			System.out.println(fatorial);
		}

	}

}
