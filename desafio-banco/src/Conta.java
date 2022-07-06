
public abstract class Conta implements IConta{
	private int agencia;
	private int numero;
	private double saldo;
	
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 0;
	
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
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
	
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d",this.getAgencia()));
		System.out.println(String.format("Numero: %d",this.getNumero()));
		System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
	}

}
