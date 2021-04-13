package mc322.lab03;


public class AquarioLombriga{
    int tamanhoLombriga;
    int tamanhoAquario;
    boolean orientadaDireita; //True se a cabeça estiver à direita
    int posInicial; //Sempre a posição à esquerda
    
    AquarioLombriga(int tamanhoLombriga,int tamanhoAquario, int posInicial){

        this.tamanhoLombriga = tamanhoLombriga;
        this.tamanhoAquario = tamanhoAquario;
        this.orientadaDireita = true;
        this.posInicial = posInicial;
        if(posInicial + tamanhoLombriga -1 > tamanhoAquario){
            
            if(tamanhoLombriga > tamanhoAquario){
                //Se a lombriga for maior : aumenta o aquário o suficiente para manter a lombriga na pos desejada
                tamanhoAquario+=(tamanhoLombriga-tamanhoAquario)+posInicial;
            }
            else{
                posInicial = 0;
            }
            
        }

                
        
    } 
    public void crescer(){
        
        if(!orientadaDireita){
            if(posInicial + tamanhoLombriga <= tamanhoAquario)
            {
                //Se a lombriga couber ela cresce
                tamanhoLombriga+=1;
                
            }
         
        }
    
        else{
            if(posInicial + tamanhoLombriga -1 <=tamanhoAquario){
                //Se a lombriga couber ela cresce
                posInicial-=1;
                tamanhoLombriga+=1;
                
            }    
            
            
        }
        
    }
    public void virar(){
        
        orientadaDireita = !orientadaDireita;
        
    }
    public void mover(){
       //Verifica a orientação da Lombriga e efetua o movimento
        
        if(orientadaDireita){
            if(posInicial + tamanhoLombriga <= tamanhoAquario){
                posInicial +=1;
                
            }
            
            else{
                virar();
            }
        }
        
        else{
            if(posInicial + tamanhoLombriga -1 <=tamanhoAquario){
                posInicial -=1;
                
                
            }
            
            else{
                virar();
            }
            
        }
       
    }
    
    public void apresenta(){
        //Apresenta  a lombriga no aquário
        for(int i =1; i<=tamanhoAquario;i++){
            if(i>=posInicial && i<posInicial+tamanhoLombriga){
                if(orientadaDireita) {
                	if(i == posInicial+tamanhoLombriga-1){
                        System.out.print("O");
                    }
                    else{
                        
                        System.out.print("@");
                    }
                	
                }
                else {
                	if(i == posInicial){
                        System.out.print("O");
                    }
                    else{
                        
                        System.out.print("@");
                    }
                	
                }
            }
            else {
            		System.out.print("#");
            }
            
        }
        System.out.print("\n");
    }
}


