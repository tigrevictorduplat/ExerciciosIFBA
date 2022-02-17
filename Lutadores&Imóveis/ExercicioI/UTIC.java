package ListaII.ExercicioI;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UTIC {
    public static void main(String[] args) {
        AreaCadastro controlaUTIC = new AreaCadastro();
        Luta lutaUTIC = new Luta();
        JOptionPane.showMessageDialog(null, "Bem vindo ao Ultra T.I Combat.\n Os maiores duelos computacionais, você só vê aqui!", "Ultra T.I Combat",1);
        
        boolean fimCadastro = false;
        int indexLutador = 0;
        ArrayList<Lutador> cadastroLutador = new ArrayList<>();

        while (fimCadastro != true) {
              
        Lutador novoLutador = controlaUTIC.cadastrarLutador(AreaCadastro.factoryLutador());
        cadastroLutador.add(indexLutador, novoLutador);
          indexLutador ++;
         int  opcaoFimCadastro =Integer.parseInt(JOptionPane.showInputDialog("Continuar cadastro?\n1: Sim\n2: Não"));
         fimCadastro = (opcaoFimCadastro==1)? false:true;
        }
        lutaUTIC.setLutadorDesafiado(cadastroLutador.get(1));
        lutaUTIC.setLutadorDesafiante(cadastroLutador.get(0));
        lutaUTIC.marcarLuta();
        lutaUTIC.Lutar(lutaUTIC.getLutadorDesafiado(), lutaUTIC.getLutadorDesafiante());
        cadastroLutador.get(1).mostrarSaldoTotal();
    }
    
}
