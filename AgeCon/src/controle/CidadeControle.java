package controle;

import interfaces.InterfaceControle;
import modelo.CidadeModelo;


public class CidadeControle implements InterfaceControle{
    
    CidadeModelo cim = new CidadeModelo();  
    
    @Override
    public void salvarControle(Object... valor) {
        cim.setId((int)valor[0]);
        cim.setDescricao((String)valor[1]);
        cim.setUf((String)valor[2]);
        cim.setCep((String)valor[3]);
        
        //Enviar informações para o DAO
       
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void consultarControle(Object... valor) {

    }
    
}
