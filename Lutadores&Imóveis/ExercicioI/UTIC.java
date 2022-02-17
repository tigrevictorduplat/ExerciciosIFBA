package ExercicioI;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UTIC {
    public static void main(String[] args) {
        AreaCadastro controlaUTIC = new AreaCadastro();
        Luta lutaUTIC = new Luta();
        boolean fimCadastro = false;
        int indexLutador = 0;
        ArrayList<Lutador> cadastroLutador = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Bem vindo ao Ultra T.I Combat.\n Os maiores duelos computacionais, você só encontra aqui!", "Ultra T.I Combat",1);

        while (fimCadastro != true) {
            Lutador novoLutador = controlaUTIC.cadastrarLutador(AreaCadastro.factoryLutador());
            cadastroLutador.add(indexLutador, novoLutador);
            indexLutador ++;
            int  opcaoFimCadastro =Integer.parseInt(JOptionPane.showInputDialog("Continuar cadastro?\n1: Sim\n2: Não"));
            fimCadastro = (opcaoFimCadastro==1)? false:true;
        }
        //Os comandos abaixo marcarão um luta e colocarão os Lutadores para Lutar
        lutaUTIC.setLutadorDesafiante(cadastroLutador.get(0));
        lutaUTIC.setLutadorDesafiado(cadastroLutador.get(1));
        lutaUTIC.marcarLuta();
        lutaUTIC.Lutar(lutaUTIC.getLutadorDesafiado(), lutaUTIC.getLutadorDesafiante());
    }
    
}
