package ListaII.ExercicioII;
import javax.swing.JOptionPane;

public class ImovelVelho extends Imovel {
    //Atributos
    private int porcetagemDesconto;
    //Médotos Getters e Setters
    public void setPorcentagemDesconto(int porcetagemDesconto) {
        this.porcetagemDesconto = porcetagemDesconto;
        Double novoPreco = getPrecoImovel() - getPrecoImovel()*porcetagemDesconto/100;
        this.setPrecoImovel(novoPreco);
    }
    public int getPorcentagemDesconto() {
        return this.porcetagemDesconto;        
    }
    public void getPrecoFinalDesconto(){
        JOptionPane.showMessageDialog
        (null, "O Preço Final após o desconto é "+
        Double.toString(getPrecoImovel()) ,"Preço Final", 1);
    }
}

