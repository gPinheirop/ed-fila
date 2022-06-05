package br.ucsal.fila.model;

import br.ucsal.contato.model.Contato;

public class Fila {

	Contato[] contatos = new Contato[0];

//	int tamanho = 1;

	public void adicionar(Contato contato) {

		Contato[] listaNova = new Contato[contatos.length + 1];

		for (int i = 0; i < listaNova.length; i++) {

			if (i == contatos.length) {

				listaNova[i] = contato;

			} else {

				listaNova[i] = contatos[i];
			}
		}

		contatos = listaNova;
	}

	public Contato proximoContato() {

		if (contatos.length == 0) return null;

		Contato[] listaNova = new Contato[contatos.length - 1];
		Contato primeiro = contatos[0];

		for (int i = 0; i < contatos.length; i++) {

			if (i != 0) {

				listaNova[i - 1] = contatos[i];

			}
		}
		
		contatos = listaNova;

		return primeiro; 	
	}

	public void imprimir() {

		if (contatos.length == 0) {
			System.out.println("deu ruim");
		}

		for (int i = 0; i < contatos.length; i++) {
			
			System.out.println(contatos[i].getNome());
			
		}
		
		System.out.println(contatos.length);
		System.out.println("=====================================");
	}
}
