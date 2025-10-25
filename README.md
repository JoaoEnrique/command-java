```java
package padrao;

import padrao.commands.Command;
import padrao.commands.DesligarLuzCommand;
import padrao.commands.LigarLuzCommand;

/**
 *
 * @author joao
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Luz luz = new Luz();
        
        Command ligar = new LigarLuzCommand(luz);
        Command desligar = new DesligarLuzCommand(luz);
        
        ControleRemoto controle = new ControleRemoto();
        
        controle.setCommand(ligar);
        controle.apertarBotao();
        
        controle.setCommand(desligar);
        controle.apertarBotao();
    }
    
}
