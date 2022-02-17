package ExercicioI;

import javax.swing.JOptionPane;

public class AreaCadastro {
    // Método usado para cadastrar novos lutadores
    public Lutador cadastrarLutador(Lutador novoLutador) {
        
        JOptionPane.showMessageDialog(null, "Vamos começar o Cadastro", "Hora do Cadastro!",1);
        novoLutador.setNomeLutador(JOptionPane.showInputDialog(null, "Digite aqui:", "Nome do Lutador",1));
        novoLutador.setIdadeLutador(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite aqui:", "Idade do Lutador",1)));
        novoLutador.setAlturaLutador(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui:", "Altura do Lutador",1)));
        novoLutador.setPesoLutador(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui:", "Peso do Lutador",1)));
        novoLutador.setNacionalidadeLutador(JOptionPane.showInputDialog(null, "Digite aqui:", "Nacionalidade do Lutador",1));
        int opcaoCadastroSaldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja cadastrar o Saldo de Vitórias, Empates e Derrotas?\n1: Sim\n2: Não", "Atenção!", 1));
        if (opcaoCadastroSaldo == 1){
            novoLutador.setNumeroVitorias(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite aqui:", "Número de Vitórias",1)));
            novoLutador.setNumeroEmpates(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite aqui:", "Número de Empates",1)));
            novoLutador.setNumeroDerrotas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite aqui:", "Número de Derrotas",1)));
        }
        
        return novoLutador;
    }
    //Uma 'factory' feita para instanciar lutadores vazios 
    public static Lutador factoryLutador(){
        Lutador novoLutador = new Lutador();
        return novoLutador;
    }
    
}
