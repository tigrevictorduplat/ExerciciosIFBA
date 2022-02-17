package ExercicioII;
import javax.swing.JOptionPane;

public class ImovelNovo extends Imovel {
    //Atributos
    private Double precoNovo;
    //Métodos Getters e Setters
    public Double getPrecoNovo (){
        return this.precoNovo;
    }
    public void setPrecoNovo (Double precoNovo){
        this.precoNovo = precoNovo;
        this.setPrecoImovel(getPrecoImovel() + precoNovo);
    }
    public void getPrecoFinalAcressimo(){
        JOptionPane.showMessageDialog
        (null, "O Preço Final após o acréssimo é "+
        Double.toString(getPrecoImovel()) ,"Preço Final", 1);
    }


}
