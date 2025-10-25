package padrao.commands;

import padrao.Luz;

/**
 *
 * @author joao
 */
public class LigarLuzCommand implements Command {
    private Luz luz;
    
    public LigarLuzCommand(Luz luz){
        this.luz = luz;
    }
    
    public void execute(){
        this.luz.ligar();
    }
}
