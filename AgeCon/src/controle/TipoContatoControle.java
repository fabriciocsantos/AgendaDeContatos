package controle;

import interfaces.InterfaceControle;
import modelo.TipoContatoModelo;


public class TipoContatoControle implements InterfaceControle {
    
    TipoContatoModelo tcm = new TipoContatoModelo();

    @Override
    public void salvarControle(Object... valor) {
        tcm.setId((int)valor[0]);
        tcm.setDescricao((String) valor[1]);
        
        //Enviar as informações para o DAO
        
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void carregarComboBox() {

    }
    
}
