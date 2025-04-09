package servicomensageminstantanea.servicos.secondclass;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}
	
}
