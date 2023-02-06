package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.CidadeModelo;

public class CidadeDao implements InterfaceDao {

    String sql;
    PreparedStatement stm;
    ResultSet resultado;

    @Override
    public void salvarDao(Object... valor) {

        CidadeModelo cim = (CidadeModelo) valor[0];
        
        if(cim.getId() == 0){
            sql = "INSERT INTO cidade (descricao,uf,cep) VALUES (?,?,?)";
        }else{
            sql = "UPDATE cidade SET descricao=?,uf=?,cep=? WHERE id = ?";
        }
        
        try{
            
            //Preparando e Manipulando os dados
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, cim.getDescricao());
            stm.setString(2, cim.getUf());
            stm.setString(3, cim.getCep());
            
            if(cim.getId() > 0 )
                stm.setInt(4, cim.getId());         
            
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
        DefaultTableModel tabela = (DefaultTableModel) valor[1];
        
        if("".equals((String)valor[0])){
            sql = "SELECT * FROM cidade";
        }else{
            sql = "SELECT * FROM cidade WHERE descricao LIKE '%" + valor[0] + "%'";
        }
       
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);   
        resultado = stm.executeQuery();
        
        while(resultado.next()){
           tabela.addRow(
                new Object[]{
                    resultado.getInt("Id"),
                    resultado.getString("Descricao"),
                    resultado.getString("Uf"),
                    resultado.getString("Cep")
                }
           );
        }
        stm.close();
    }

}
