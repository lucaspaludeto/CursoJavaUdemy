package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		
	// Ana mae = new Ana();-> PARA ACESSAR A PARTIR DA HERANÇA NÃO PRECISA CRIAR UMA INSTÂNCIA
	
	// System.out.println(segredo); PRIVADO não é transmitido por HERANÇA
	// System.out.println(facoDentroDeCasa); DEFAULT visibilidade mesmo pacote. Só terá visibilidade se a HERANÇA estiver no mesmo pacote
	System.out.println(formaDeFalar);
	System.out.println(todosSabem);
	System.out.println(new Ana().todosSabem);
	}

}
