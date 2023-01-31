package visao;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BairroVisao extends FormPadrao {
    
    JLabel jlBairro;
    JTextField jcbBairro;
    
    //Construtor
    public BairroVisao(){
        setTitle("Cadastro Bairro");
    }

    @Override
    public void inicializarComponentes() {
        jlBairro = new JLabel("Cidade");
        jlBairro.setBounds(9,60,50,25);
        jpnFormulario.add(jlBairro);
        
        jcbBairro = new JTextField();
        jcbBairro.setBounds(9,80,250,25);
        jpnFormulario.add(jcbBairro);
    }
    
    //Instancia de controle
    
    
    @Override
    public void salvarVisao() {
     
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
