package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import modelo.BairroModelo;


public class BairroDao implements InterfaceDao {

    @Override
    public void salvarDao(Object... valor) {
         BairroModelo bm =  (BairroModelo)valor[0];
    }

    @Override
    public void excluirDao(int id) {

    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {

    }
    
}