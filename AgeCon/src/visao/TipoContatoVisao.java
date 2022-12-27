package visao;

import controle.TipoContatoControle;


public class TipoContatoVisao extends FormPadrao {
    
    
    //Construtor
    public TipoContatoVisao(){
        setTitle("Tipo de contato");
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
}
