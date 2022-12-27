package controle;

import dao.TipoContatoDao;
import interfaces.InterfaceControle;
import modelo.TipoContatoModelo;


public class TipoContatoControle implements InterfaceControle {
    
    TipoContatoModelo tcm = new TipoContatoModelo();
    TipoContatoDao tcd = new TipoContatoDao();

    @Override
    public void salvarControle(Object... valor) {
        tcm.setId((int)valor[0]);
        tcm.setDescricao((String) valor[1]);
        
        //Enviar as informações para o DAO
        tcd.salvarDao(tcm);
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void carregarComboBox() {

    }
    
}
