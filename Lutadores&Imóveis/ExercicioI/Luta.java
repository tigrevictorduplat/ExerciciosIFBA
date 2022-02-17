package ListaII.ExercicioI;
import javax.swing.JOptionPane;
//Alunos
//
//
public class Luta {
    //Atributos
    private Lutador lutadorDesafiante;
    private Lutador lutadorDesafiado;
    private String dataLuta;
    //Construtores
    Luta(){}
    Luta(Lutador lutadorDesafiante, Lutador lutadorDesafiado){
        setLutadorDesafiado(lutadorDesafiado);
        setLutadorDesafiante(lutadorDesafiante);
    }
    //Métodos Getters e Setters
    public Lutador getLutadorDesafiante() {
        return lutadorDesafiante;
    }
    public void setLutadorDesafiante(Lutador lutadorDesafiante) {
        this.lutadorDesafiante = lutadorDesafiante;
    }
    public Lutador getLutadorDesafiado() {
        return lutadorDesafiado;
    }
    public void setLutadorDesafiado(Lutador lutadorDesafiado) {
        this.lutadorDesafiado = lutadorDesafiado;
    }
    public String getDataLuta() {
        return dataLuta;
    }
    public void setDataLuta(String dataLuta) {
    this.dataLuta = (this.lutadorDesafiado == this.lutadorDesafiante)? dataLuta :  "Os lutadores são iguais!";   
    }
    //Métodos Especiais
    public void marcarLuta(){
        this.setDataLuta(JOptionPane.showInputDialog(null, "Qual será a data da luta?"));
    }
     public void Lutar(Lutador desafiado, Lutador desafiante){
        JOptionPane.showMessageDialog(null, "É chegada a hora do combateeee, vem chegando nosso desafiante da noite...");
        this.lutadorDesafiante.apresentarLutador();
        JOptionPane.showMessageDialog(null, "É, meus queridos espectadores, parece que "+ this.lutadorDesafiado.getNomeLutador() +" está em maus bocados... mas mesmo assim nosso desafiado vem confiante!!");
        this.lutadorDesafiado.apresentarLutador();
        int indexVencedor = Integer.parseInt(JOptionPane.showInputDialog(null, "Quem foi o vencedor? Desafiante 1/Empate 0/ Desafiado 2", "Ganhador da Luta", 1));
        switch (indexVencedor) {
            case 1:
                this.lutadorDesafiante.ganharLuta();
                this.lutadorDesafiado.perderLuta();
                JOptionPane.showMessageDialog(null, this.lutadorDesafiante.getNomeLutador() + " foi o vitorioso, aumentando seu saldo de vitórias para: " + (this.lutadorDesafiante.getNumeroVitorias()), "Fim do Embate!", 1);
                this.lutadorDesafiante.mostrarSaldoTotal();
                this.lutadorDesafiado.mostrarSaldoTotal();
                break;
            case 0:
                this.lutadorDesafiante.empatarLuta();
                this.lutadorDesafiado.empatarLuta();
                JOptionPane.showMessageDialog(null, "Após uma delicada avaliação os juízes finalmente se decidiram quanto ao resultado\n" + this.lutadorDesafiado.getNomeLutador() + " e " + this.lutadorDesafiante.getNomeLutador() + " tiveram um...\n EMPATE", "Fim do Embate!", 1);
                this.lutadorDesafiante.mostrarSaldoTotal();
                this.lutadorDesafiado.mostrarSaldoTotal();
                break;
            case 2:
                this.lutadorDesafiado.ganharLuta();
                this.lutadorDesafiante.perderLuta();
                JOptionPane.showMessageDialog(null, getLutadorDesafiado() + " foi o vitorioso, aumentando seu saldo de vitórias para: " + (this.lutadorDesafiado.getNumeroVitorias()), "Fim do Embate!", 1);
                this.lutadorDesafiante.mostrarSaldoTotal();
                this.lutadorDesafiado.mostrarSaldoTotal();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }

     }

    
}
