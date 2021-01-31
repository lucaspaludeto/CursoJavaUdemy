package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Compraremos TV 50\"? " + comprouTv50);
		System.out.println("Compraremos TV 32\"? " + comprouTv32);
		System.out.println("Tomou sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
	}

}
