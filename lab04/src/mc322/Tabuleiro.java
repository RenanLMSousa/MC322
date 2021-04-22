package mc322.lab04;

public class Tabuleiro {

	Peca[][] tabuleiro = new Peca[7][7];
	
	Tabuleiro() {
		//Inicia o tabuleiro
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++){
				
				if(noTabuleiro(i,j)) {
					
					tabuleiro[i][j]=new Peca(this,i,j);
				}
				else {
					tabuleiro[i][j]= null;
				}
			}		
			
		}
		tabuleiro[3][3]=null;
		
	}
	int[] strParaCoords(String coords){
		//Converte as coordenadas do Tipo CharInt -> IntInt
		int[] ret = {coords.charAt(1)-1-'0',coords.charAt(0)-'a'};
		return(ret);
		
	}
	Boolean noTabuleiro(int i,int j) {
		//Verifica se uma casa está no tabuleiro.
		return(!((i<=1 && j<=1)||(i>=5 && j>=5) || (i<=1 && j>=5)||(i>=5 && j<=1)));
		
	}
	void movimentar(String fonte,String alvo) {
		//Movimenta a peça na casa fonte até a casa alvo
		int[] coordsFonte = strParaCoords(fonte);
		int[] coordsAlvo = strParaCoords(alvo);
		Peca pecaFonte = tabuleiro[coordsFonte[0]][coordsFonte[1]];
		pecaFonte.movimentarPeca(coordsAlvo);
		
	}
	String estadoEmString() {
		//Retorna o estado atual do tabuleiro em uma string
		String estadoAtual = "";
		for(int i=6;i>=0;i--) {
			for(int j=0;j<7;j++){

				if(tabuleiro[i][j]!=null) {

					estadoAtual+="P";
				}
				else if(noTabuleiro(i,j)) {

					estadoAtual+="-";
				}
				else {

					estadoAtual+=" ";
				}
				
			}
			estadoAtual+='\n';
		}

		return estadoAtual;
		
		
	}
	void imprimir() {
		//Imprime como o tabuleiro está no momento.
		for(int i=6;i>=0;i--) {
			System.out.print(i+1+" ");
			for(int j=0;j<7;j++){

				if(tabuleiro[i][j]!=null) {
					System.out.print("P");
				}
				else if(noTabuleiro(i,j)) {
					System.out.print("-");
				}
				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			
			
		}
			
			System.out.print("\n");
	}
	System.out.print("  a b c d e f g \n");
	}
}
