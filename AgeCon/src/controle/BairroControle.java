package controle;

import dao.BairroDao;
import interfaces.InterfaceControle;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BairroModelo;

public class BairroControle implements InterfaceControle {
    
    BairroModelo bm = new BairroModelo();
    BairroDao bd = new BairroDao();
    
    @Override
    public void salvarControle(Object... valor) {
        
        if ("".equals(valor[0])) {
            bm.setId(0);
        }else{
            bm.setId((int)valor[0]);
        }
        
        bm.setDescricao((String)valor[1]);
        bm.setCidade((String)valor[2]);
        
        //Enviar informações para o DAO
       
        bd.salvarDao(bm);
        
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void consultarControle(Object... valor) {
        try {
            bd.consultarDao(valor);
        } catch(SQLException ex) {
            Logger.getLogger(TipoContatoControle.class.getName()).log(Level.SEVERE, null, ex);        
        }
    }   
    
}
