package ExercicioII;
import javax.swing.JOptionPane;

public class Principal {
        public static void main(String[] args) {
      JOptionPane.showMessageDialog(null, "Bem vindo à Imóveis S.A");
          int  tipoImovel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo do Imóvel - 1. Novo | 2. Velho"));
      switch (tipoImovel) {
          case 1:
              ImovelNovo imovelClienteNovo = new ImovelNovo();
               imovelClienteNovo.setPrecoNovo(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o acréssimo no preço do Imóvel Novo?")));
              imovelClienteNovo.getPrecoFinalAcressimo();          
              break;
          case 2:    
              ImovelVelho imovelClienteVelho = new ImovelVelho();
              imovelClienteVelho.setPorcentagemDesconto(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos % de desconto o Imóvel Velho terá?")));
              imovelClienteVelho.getPrecoFinalDesconto();  
            break;
          default:
          JOptionPane.showMessageDialog(null, "Opção Inválida!");
              break;
        }
    }
}