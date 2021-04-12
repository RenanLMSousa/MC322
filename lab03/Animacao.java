package mc322.lab03;

public class Animacao {

		AquarioLombriga lombriga;
		int passoAtual; //Próximo passo a ser executado
		String strAnimacao;
		
		Animacao(String strAnimacaoIn){
			
			strAnimacao = strAnimacaoIn;
			
			int tamanhoAquario = (int)10*(strAnimacao.charAt(0)-'0')+(strAnimacao.charAt(1)-'0');
			int tamanhoLombriga = (int)10*(strAnimacao.charAt(2)-'0')+(strAnimacao.charAt(3)-'0');
			int posInicial = (int)10*(strAnimacao.charAt(4)-'0')+(strAnimacao.charAt(5)-'0');
			
			passoAtual=1;
			

			lombriga = new AquarioLombriga(tamanhoLombriga,tamanhoAquario,posInicial);			
		}
		
		public void apresenta() {
			
			
			lombriga.apresenta();
			
			
		}
		public void passo() {
			
			if(passoAtual+5>=strAnimacao.length()) {
				
				System.out.println("Já acabaram os passos!");
				return;
			}
			char proxPasso = strAnimacao.charAt(passoAtual+5);
			passoAtual+=1;

			
			switch(proxPasso) {
			
			case 'C':
				lombriga.crescer();
				break;
			case 'M':
				lombriga.mover();
				break;
			case 'V':
				lombriga.virar();
				break;
				
			
			
			}
			
		}
}
