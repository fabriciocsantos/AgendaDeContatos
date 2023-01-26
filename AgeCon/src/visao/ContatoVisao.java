package visao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ContatoVisao extends FormPadrao {
    
    JLabel jlApelido;
    JTextField jtfApelido;
    
    JLabel jlEmail;
    JTextField jtfEmail;
    
    JLabel jlDdd;
    JTextField jtfDdd;
    
    JLabel jlTelefone;
    JTextField jtfTelefone;
    
    //Construtor
    public ContatoVisao(){
        setTitle("Cadastro de Contatos");
    }

    @Override
    public void inicializarComponentes() {
        //Apelido
        jlApelido = new JLabel("Apelido");
        jlApelido.setBounds(9,60,50,25);
        jpnFormulario.add(jlApelido);
        
        jtfApelido = new JTextField();
        jtfApelido.setBounds(9,80,250,25);
        jpnFormulario.add(jtfApelido);
        
        //Email
        jlEmail = new JLabel("Email");
        jlEmail.setBounds(300,60,50,25);
        jpnFormulario.add(jlEmail);
        
        jtfEmail = new JTextField();
        jtfEmail.setBounds(300,80,350,25);
        jpnFormulario.add(jtfEmail);
        
        //DDD
        jlDdd = new JLabel("DDD");
        jlDdd.setBounds(9,110,50,25);
        jpnFormulario.add(jlDdd);
        
        jtfDdd = new JTextField();
        jtfDdd.setBounds(9,130,50,25);
        jpnFormulario.add(jtfDdd);
        
        //Telefone
        jlTelefone = new JLabel("Telefone");
        jlTelefone.setBounds(100,110,50,25);
        jpnFormulario.add(jlTelefone);
        
        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(100,130,150,25);
        jpnFormulario.add(jtfTelefone);
        
        
    }

    @Override
    public void salvarVisao() {

    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {60, 200, 100, 150, 50, 150},
                new Object[]{"centro","esquerda","esquerda","esquerda","esquerda","esquerda"}, 
                new Object[]{"ID", "Descrição", "Apelido", "Email", "DDD", "Telefone"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
  
    }
}
