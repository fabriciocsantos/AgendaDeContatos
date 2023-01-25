package visao;

import controle.TipoContatoControle;
import javax.swing.table.DefaultTableModel;


public class TipoContatoVisao extends FormPadrao {
    
    
    //Construtor
    public TipoContatoVisao(){
        setTitle("Cadastro de Tipo de contato");
    }

    @Override
    public void inicializarComponentes() {

    }
    
    //Instancia de controle
    TipoContatoControle tcc = new TipoContatoControle();

    @Override
    public void salvarVisao() {
         tcc.salvarControle(jtfId.getText(), jtfDescricao.getText());
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {60, 620},
                new Object[]{"centro","esquerda"}, 
                new Object[]{"ID", "Descrição"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }
}
