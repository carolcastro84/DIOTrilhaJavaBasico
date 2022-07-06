
public class Main {
	public static void main (String[] args) {
		Cliente clienteCC = new Cliente();
		clienteCC.setNome("Carol");
		
		Cliente clienteCP = new Cliente();
		clienteCP.setNome("Eduardo");
		Conta cc = new ContaCorrente(clienteCC);
		Conta cp = new ContaPoupança(clienteCP);
		
		cc.depositar(500);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		
	}
}
