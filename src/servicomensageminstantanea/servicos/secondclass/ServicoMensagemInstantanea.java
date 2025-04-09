package servicomensageminstantanea.servicos.secondclass;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	public abstract void salvarHistoricoMensagem();
	
	protected void validarConexao() {
		System.out.println("Verificando conexão com a Internet!");
	}
}
