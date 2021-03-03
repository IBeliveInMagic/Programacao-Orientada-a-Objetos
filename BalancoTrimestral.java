
public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		
		float mediaMensal = gastosTrimestre/3F;
		
		System.out.println("Valor da média mensal = " + mediaMensal);
	}

}
