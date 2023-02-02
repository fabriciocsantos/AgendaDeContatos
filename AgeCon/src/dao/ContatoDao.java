package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ContatoModelo;


public class ContatoDao implements InterfaceDao {
    
    String sql;
    PreparedStatement stm;
    ResultSet resultado;
    
    @Override
    public void salvarDao(Object... valor) {
        
        ContatoModelo cm = (ContatoModelo)valor[0];  
        
        //Alteração ou inclusão
        if(cm.getId() == 0){
             sql = "INSERT INTO contato (descricao,apelido,email,ddd,telefone) VALUES (?,?,?,?,?)";
        }else{
            sql = "UPDATE contato SET descricao=?,apelido=?,email=?,ddd=?,telefone=? WHERE id  = ?,?,?,?,?";
        }
        
        try{
            
            //Preparando e Manipulando os dados
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            stm.setString(1, cm.getDescricao());
            stm.setString(2, cm.getApelido());
            stm.setString(3, cm.getEmail());
            stm.setString(4, cm.getDdd());
            stm.setString(5, cm.getTelefone());
            
            if(cm.getId() > 0 )
                stm.setInt(6, cm.getId());          
            
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
            sql = "SELECT * FROM contato";
        }else{
            sql = "SELECT * FROM contato WHERE descricao LIKE '%" + valor[0] + "%'";
        }
       
        stm = ConexaoBanco.abreConexao().prepareStatement(sql);   
        resultado = stm.executeQuery();
        
        while(resultado.next()){
           tabela.addRow(
                new Object[]{
                    resultado.getInt("Id"),
                    resultado.getString("Descricao"),
                    resultado.getString("Apelido"),
                    resultado.getString("Email"),
                    resultado.getString("Ddd"),
                    resultado.getString("Telefone")
                }
           );
        }
        stm.close();
    }
    
}
