package dio.poo.banco;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
	
    protected int agencia;
	protected int numero;
	private double saldo;
	private Cliente cliente;
    
    public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}	
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;	
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);		
	}
	
	protected void imprimirDadosBancarios() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
