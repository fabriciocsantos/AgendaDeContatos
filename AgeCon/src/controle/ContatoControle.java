package controle;

import dao.ContatoDao;
import interfaces.InterfaceControle;
import modelo.ContatoModelo;

public class ContatoControle implements InterfaceControle {

    ContatoModelo cm = new ContatoModelo();
    ContatoDao cd = new ContatoDao();
    
    @Override
    public void salvarControle(Object... valor) {
        cm.setId((int) valor[0]);
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

    }

}
