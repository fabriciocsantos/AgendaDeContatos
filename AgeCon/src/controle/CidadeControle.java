package controle;

import dao.CidadeDao;
import interfaces.InterfaceControle;
import modelo.CidadeModelo;


public class CidadeControle implements InterfaceControle{
    
    CidadeModelo cim = new CidadeModelo();  
    CidadeDao cid = new CidadeDao();
    
    @Override
    public void salvarControle(Object... valor) {
        cim.setId((int)valor[0]);
        cim.setDescricao((String)valor[1]);
        cim.setUf((String)valor[2]);
        cim.setCep((String)valor[3]);
        
        //Enviar informações para o DAO
        
        cid.salvarDao(cim);
        
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void consultarControle(Object... valor) {

    }
    
}
