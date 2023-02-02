package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.BairroModelo;

public class BairroDao implements InterfaceDao {

    String sql;
    PreparedStatement stm;

    @Override
    public void salvarDao(Object... valor) {

        BairroModelo bm = (BairroModelo) valor[0];

        if(bm.getId() == 0){
            sql = "INSERT INTO bairro (descricao,cidade) VALUES (?,?)";
        }else{
            sql = "UPDATE bairro SET descricao=?,cidade=? WHERE id = ?,?";        
        }       
        
        try{
            
            //Preparando e Manipulando os dados
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);                     
            
            stm.setString(1, bm.getDescricao());
            stm.setString(2, bm.getCidade());
            
            if(bm.getId() > 0 )
                stm.setInt(3, bm.getId());
            
            stm.execute(); 
            stm.close();
            JOptionPane.showMessageDialog(null,"Registro Gravado!");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro. " + e);
        }

    }

    @Override
    public void excluirDao(int id) {

    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {

    }

}
