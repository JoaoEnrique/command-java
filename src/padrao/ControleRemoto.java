package padrao;

import padrao.commands.Command;

/**
 *
 * @author joao
 */
public class ControleRemoto {
    private Command comando;
    
    void setCommand(Command comando){
        this.comando = comando;
    }
    
    void apertarBotao(){
        this.comando.execute();
    }
}
