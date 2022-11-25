package dio.poo.banco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Cliente Teste");
		
		IConta cc = new ContaCorrente(cliente);
		IConta cp = new ContaPoupanca(cliente);
		
		cc.depositar(100);		
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		Banco banco = new Banco();
		banco.setCodigo(1);
		banco.setNome("Banco de Teste");
		
		List<Conta> lista = new ArrayList<Conta>();
		lista.add((Conta) cp);
		lista.add((Conta) cc);
		banco.setContas(lista);
		
		banco.ListarClientes();
	}

}


// TODO
// Incluir novas classes, atributos e/ou métodos
// Listar todos os clientes do banco
// Lombok ???7

