package controle;

import interfaces.InterfaceControle;
import modelo.BairroModelo;

public class BairroControle implements InterfaceControle {
    
    BairroModelo bm = new BairroModelo();
    
    @Override
    public void salvarControle(Object... valor) {
        bm.setId((int)valor[0]);
        bm.setDescricao((String)valor[1]);
        bm.setCidade((String)valor[2]);
        
        //Enviar informações para o DAO
       
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void consultarControle(Object... valor) {

    }
    
}
