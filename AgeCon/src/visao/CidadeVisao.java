package visao;

import controle.CidadeControle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CidadeVisao extends FormPadrao {

    JLabel jlUf;
    JLabel jlCep;

    JTextField jcbUf;
    JTextField jtfCep;

    //Construtor
    public CidadeVisao() {
        setTitle("Cadastro de Cidade");
        consultaVisao();

    }

    @Override
    public void inicializarComponentes() {

        //UF
        jlUf = new JLabel("UF");
        jlUf.setBounds(9, 60, 50, 25);
        jpnFormulario.add(jlUf);

        jcbUf = new JTextField();
        jcbUf.setBounds(9, 80, 70, 25);
        jpnFormulario.add(jcbUf);

        //CEP
        jlCep = new JLabel("CEP");
        jlCep.setBounds(110, 60, 100, 25);
        jpnFormulario.add(jlCep);

        jtfCep = new JTextField();
        jtfCep.setBounds(110, 80, 200, 25);
        jpnFormulario.add(jtfCep);
    }

    //Instancia de Controle
    CidadeControle cic = new CidadeControle();

    @Override
    public void salvarVisao() {
        cic.salvarControle(jtfId.getText(), jtfDescricao.getText(), jcbUf.getText(), jtfCep.getText());
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta,
                new Object[]{60, 500, 60, 150},
                new Object[]{"centro", "esquerda", "esquerda", "esquerda"},
                new Object[]{"ID", "Descrição", "UF", "CEP"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
        modelo.setNumRows(0);
        cic.consultarControle(jtfConsulta.getText(), modelo);
    }

    @Override
    public void atualizarFormulario() {
        jtfId.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        jtfDescricao.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        jcbUf.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        jtfCep.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
    }

    @Override
    public void excluirVisao() {
        cic.excluirControle(Integer.parseInt(jtfId.getText()));
    }
}
