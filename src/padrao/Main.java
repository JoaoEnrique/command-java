package padrao;

/**
 *
 * @author FATEC ZONA LESTE
 */
class Luz{
    void ligar() {System.out.println("Luz ligada");}
    void desligar(){System.out.println("Luz desligada");}
}

class ControleRemoto{
    private Luz luz;
    
    ControleRemoto(Luz luz){
        this.luz = luz;
    }
    
    void apertarBotaoLigar(){
        luz.ligar();
    }
    
    void apertarBotaoDesligar(){
        luz.desligar();
    }
}


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Luz luz = new Luz();
        ControleRemoto controle = new ControleRemoto(luz);
        
        controle.apertarBotaoLigar();
        controle.apertarBotaoDesligar();
    }
    
}
