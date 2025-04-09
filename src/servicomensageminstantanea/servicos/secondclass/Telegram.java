package servicomensageminstantanea.servicos.secondclass;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagem pelo Telegram");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}
