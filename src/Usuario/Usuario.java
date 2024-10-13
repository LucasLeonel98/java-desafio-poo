package Usuario;

import iphone.Iphone;
public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.exibirPagina("google.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.ligar("555-456");
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("musica teste");
	}

}
