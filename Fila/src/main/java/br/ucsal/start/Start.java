package br.ucsal.start;

import br.ucsal.contato.model.Contato;
import br.ucsal.fila.model.Fila;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

public class Start {

	public static void main(String[] args) {

		Contato teste = new Contato();
		Contato teste2 = new Contato();
		Contato teste3 = new Contato();

		teste.setNome("geromel");
		teste.setNumero("98432167");

		teste2.setNome("hidromel");
		teste2.setNumero("98456455");

		teste3.setNome("gargamel");
		teste3.setNumero("9846841");

		Fila test = new Fila();

		test.adicionar(teste);
		test.adicionar(teste2);
		test.adicionar(teste3);

		test.imprimir();

		Contato primeiro = test.proximoContato();

		System.out.println("\n\n\n\n\n");
		System.out.println(primeiro.getNome());
		System.out.println("\n\n\n\n\n");

		test.imprimir();

//		get("/hello", new Route() {
//			public Object handle(Request req, Response res) throws Exception {
//				return "Hello World";
//			}
//		});
	}
	
}
