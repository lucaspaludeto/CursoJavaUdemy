package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(06, "Maio", 1991);
		
		Data d2 = new Data();
		
		System.out.println(d1.obterDataFormadata());
		System.out.println(d2.obterDataFormadata());
		
	}

}
