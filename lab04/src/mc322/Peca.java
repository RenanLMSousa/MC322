package mc322.lab04;

public class Peca {
	
	int linha;
	int coluna;
	Tabuleiro tabuleiro;//A peça sabe o tabuleiro em que está
	
	Peca(Tabuleiro tabuleiro,int linha,int coluna){
		this.linha = linha;
		this.coluna = coluna;
		this.tabuleiro= tabuleiro;
		
	}

	void movimentarPeca(int[] coordsAlvo) {
		//Movimenta a peça e come remove a da casa intermediária
	
		tabuleiro.tabuleiro[linha][coluna] = null;
		tabuleiro.tabuleiro[(linha+coordsAlvo[0])/2][(coluna+coordsAlvo[1])/2] = null;
		linha=coordsAlvo[0];
		coluna=coordsAlvo[1];
		tabuleiro.tabuleiro[coordsAlvo[0]][coordsAlvo[1]]=this;
		
		
	}

}
