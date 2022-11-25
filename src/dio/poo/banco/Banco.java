package dio.poo.banco;

import java.util.HashSet;
import java.util.List;

public class Banco {
	
	private int codigo;
	private String nome;
	private List<Conta> contas;
	
	public void ListarClientes() {
		HashSet<String> clientes = new HashSet<String>();
		for (Conta conta : contas) {
			clientes.add(conta.getCliente().getNome());
		}
		
		System.out.println("------ Lista de clientes -----");
		for (String cliente : clientes) {
			System.out.println(cliente);
		}
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
