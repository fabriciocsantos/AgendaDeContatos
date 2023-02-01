package dao;

import interfaces.InterfaceDao;
import java.sql.SQLException;
import modelo.CidadeModelo;


public class CidadeDao implements InterfaceDao {

    @Override
    public void salvarDao(Object... valor) {
        CidadeModelo cim = (CidadeModelo)valor[0];
    }

    @Override
    public void excluirDao(int id) {

    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {

    }
    
}
