package servicomensageminstantanea.apps.secondclass;

import servicomensageminstantanea.servicos.secondclass.ServicoMensagemInstantanea;
import servicomensageminstantanea.servicos.secondclass.MSNMessenger;
import servicomensageminstantanea.servicos.secondclass.Telegram;
import servicomensageminstantanea.servicos.secondclass.FacebookMessenger;

public class Computador {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "tlg";
				
		if (appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		} else if (appEscolhido.equals("tlg")) {
			smi = new Telegram();
		} else if (appEscolhido.equals("fbm")) {
			smi = new FacebookMessenger();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
