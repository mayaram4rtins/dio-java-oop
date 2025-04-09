package servicomensageminstantanea.servicos.secondclass;

public class MSNMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo MSN");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}
