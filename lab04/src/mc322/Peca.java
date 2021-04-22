package mc322.lab04;

public class Peca {
	
	int linha;
	int coluna;
	Tabuleiro tabuleiro;//A pe�a sabe o tabuleiro em que est�
	
	Peca(Tabuleiro tabuleiro,int linha,int coluna){
		this.linha = linha;
		this.coluna = coluna;
		this.tabuleiro= tabuleiro;
		
	}

	void movimentarPeca(int[] coordsAlvo) {
		//Movimenta a pe�a e come remove a da casa intermedi�ria
	
		tabuleiro.tabuleiro[linha][coluna] = null;
		tabuleiro.tabuleiro[(linha+coordsAlvo[0])/2][(coluna+coordsAlvo[1])/2] = null;
		linha=coordsAlvo[0];
		coluna=coordsAlvo[1];
		tabuleiro.tabuleiro[coordsAlvo[0]][coordsAlvo[1]]=this;
		
		
	}

}
