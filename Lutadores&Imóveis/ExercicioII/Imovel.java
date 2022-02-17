package ListaII.ExercicioII;
import javax.swing.JOptionPane;

public class Imovel {
    //Atributos
    private String enderecoImovel;
    private Double precoImovel;
    // Métodos Getters e Setters
    public String getEnderecoImovel() {
        return this.enderecoImovel;
    }
    public void setEnderecoImovel(String enderecoImovel){
        this.enderecoImovel = enderecoImovel;
    }
    public Double getPrecoImovel(){
        return this.precoImovel;
    }
    public void setPrecoImovel(Double precoImovel) {
        this.precoImovel = precoImovel;
    }
    //Construtores
    public Imovel(){
        cadastrarImovel();
    }
    public Imovel(String enderecoImovel, Double precoImovel){
        setEnderecoImovel(enderecoImovel);
        setPrecoImovel(precoImovel);
    }
    public void cadastrarImovel(){
        this.enderecoImovel = JOptionPane.showInputDialog(null,"Qual o Endereco do Imovel?");
        this.precoImovel = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o preço base do Imovel?"));

    }

        
}
