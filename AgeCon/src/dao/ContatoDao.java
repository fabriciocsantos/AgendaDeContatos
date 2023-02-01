package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import modelo.ContatoModelo;


public class ContatoDao implements InterfaceDao {

    @Override
    public void salvarDao(Object... valor) {
        ContatoModelo cm = (ContatoModelo)valor[0];
        
        System.out.println("Toaqui" + cm.getDescricao() + cm.getApelido() + cm.getEmail() + cm.getDdd() + cm.getTelefone());
        
    }

    @Override
    public void excluirDao(int id) {

    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {

    }
    
}
