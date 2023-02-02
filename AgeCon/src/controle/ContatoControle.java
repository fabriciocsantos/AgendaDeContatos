package controle;

import dao.ContatoDao;
import interfaces.InterfaceControle;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.util.logging.Level;
import modelo.ContatoModelo;

public class ContatoControle implements InterfaceControle {

    ContatoModelo cm = new ContatoModelo();
    ContatoDao cd = new ContatoDao();
    
    @Override
    public void salvarControle(Object... valor) {
        
        if ("".equals(valor[0])) {
            cm.setId(0);
        }else{
            cm.setId((int) valor[0]);
        }
        
        
        cm.setDescricao((String) valor[1]);
        cm.setApelido((String) valor[2]);
        cm.setEmail((String) valor[3]);
        cm.setDdd((String) valor[4]);
        cm.setTelefone((String) valor[5]);
        
        //Enviar informações para o DAO
        
        cd.salvarDao(cm);
        
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void consultarControle(Object... valor) {
        try {
            cd.consultarDao(valor);
        } catch(SQLException ex) {
            Logger.getLogger(TipoContatoControle.class.getName()).log(Level.SEVERE, null, ex);        
        }
    }

}
