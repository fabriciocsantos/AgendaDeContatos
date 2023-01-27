package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class CidadeVisao extends FormPadrao{
    JLabel jlUf;
    JLabel jlCep;
    
    JComboBox jcbUf;
    JTextField jtfCep;
    
    //Construtor
    public CidadeVisao(){
        setTitle("Cadastro de Cidade");
    }

    @Override
    public void inicializarComponentes() {
        
        //UF
        jlUf = new JLabel("UF");
        jlUf.setBounds(9,60,50,25);
        jpnFormulario.add(jlUf);
        
        jcbUf = new JComboBox();
        jcbUf.setBounds(9,80,70,25);
        jpnFormulario.add(jcbUf);
        
        //CEP
        jlCep = new JLabel("CEP");
        jlCep.setBounds(110,60,100,25);
        jpnFormulario.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(110,80,200,25);
        jpnFormulario.add(jtfCep);
    }

    @Override
    public void salvarVisao() {

    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {60, 500,60,150},
                new Object[]{"centro","esquerda","esquerda","esquerda"}, 
                new Object[]{"ID", "Descrição", "UF", "CEP"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {

    }

    @Override
    public void atualizarFormulario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
