package padrao.commands;

import padrao.Luz;

/**
 *
 * @author joao
 */
public class DesligarLuzCommand implements Command {
    private Luz luz;
    
    public DesligarLuzCommand(Luz luz){
        this.luz = luz;
    }
    
    public void execute(){
        this.luz.desligar();
    }
}
