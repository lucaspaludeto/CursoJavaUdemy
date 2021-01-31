package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + "  " + b);
		
		Data d1 = new Data(1, "Maio", 2020);
		Data d2 = d1; //atribuição por referênciaO(objeto)
		
		d1.dia = 22;
		d2.mes = "Abril";
		
		System.out.println(d1.obterDataFormadata());
		System.out.println(d2.obterDataFormadata());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormadata());
		System.out.println(d2.obterDataFormadata());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = "Janeiro";
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
