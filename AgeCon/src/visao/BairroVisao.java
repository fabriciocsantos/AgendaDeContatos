package visao;


import controle.BairroControle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BairroVisao extends FormPadrao {
    
    JLabel jlCidade;
    JTextField jcbCidade;
    
    //Construtor
    public BairroVisao(){
        setTitle("Cadastro Bairro");
    }

    @Override
    public void inicializarComponentes() {
        jlCidade = new JLabel("Cidade");
        jlCidade.setBounds(9,60,50,25);
        jpnFormulario.add(jlCidade);
        
        jcbCidade = new JTextField();
        jcbCidade.setBounds(9,80,150,25);
        jpnFormulario.add(jcbCidade);
    }
    
    //Instancia de controle
    BairroControle bc = new BairroControle();
    
    @Override
    public void salvarVisao() {
     bc.salvarControle(jtfId.getText(), jtfDescricao.getText(), jcbCidade.getText());
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {60, 450, 200},
                new Object[]{"centro","esquerda","direita"}, 
                new Object[]{"ID", "Descrição","Cidade"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
         
    }

    @Override
    public void atualizarFormulario() {
       
    }

    @Override
    public void excluirVisao() {
        
    }
    }
