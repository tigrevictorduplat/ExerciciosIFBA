package ListaII.ExercicioI;
import javax.swing.JOptionPane;
public class Lutador {
    //Atributos
    private String
        nomeLutador,
        nacionalidadeLutador;
    private int
        idadeLutador,
        numeroVitorias,
        numeroDerrotas,
        numeroEmpates;
    private Double
        alturaLutador,
        pesoLutador;
     //Construtores
     Lutador(){}
     Lutador(String nomeLutador, String nacionalidadeLutador,int idadeLutador, Double alturaLutador, Double pesoLutador){
        setNomeLutador(nomeLutador);
        setNacionalidadeLutador(nacionalidadeLutador);
        setIdadeLutador(idadeLutador);
        setAlturaLutador(alturaLutador);
        setPesoLutador(pesoLutador);
        setNumeroDerrotas(0);
        setNumeroEmpates(0);
        setNumeroVitorias(0);
     }  
     Lutador(String nomeLutador, String nacionalidadeLutador,int idadeLutador, Double alturaLutador, Double pesoLutador, int numeroDerrotas, int numeroEmpates, int numeroVitorias){
        setNomeLutador(nomeLutador);
        setNacionalidadeLutador(nacionalidadeLutador);
        setIdadeLutador(idadeLutador);
        setAlturaLutador(alturaLutador);
        setPesoLutador(pesoLutador);
        setNumeroDerrotas(numeroDerrotas);
        setNumeroEmpates(numeroEmpates);
        setNumeroVitorias(numeroVitorias);
     }  
    //Métodos Getters e Setters
    public String getNomeLutador() {
        return nomeLutador;
    }
    public void setNomeLutador(String nomeLutador) {
        this.nomeLutador = nomeLutador;
    }
    public String getNacionalidadeLutador() {
        return nacionalidadeLutador;
    }
    public void setNacionalidadeLutador(String nacionalidadeLutador) {
        this.nacionalidadeLutador = nacionalidadeLutador;
    }
    public int getIdadeLutador() {
        return idadeLutador;
    }
    public void setIdadeLutador(int idadeLutador) {
        this.idadeLutador = idadeLutador;
    }
    public int getNumeroVitorias() {
        return numeroVitorias;
    }
    public void setNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }
    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }
    public void setNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas;
    }
    public int getNumeroEmpates() {
        return numeroEmpates;
    }
    public void setNumeroEmpates(int numeroEmpates) {
        this.numeroEmpates = numeroEmpates;
    }
    public Double getAlturaLutador() {
        return alturaLutador;
    }
    public void setAlturaLutador(Double alturaLutador) {
        this.alturaLutador = alturaLutador;
    }
    public Double getPesoLutador() {
        return pesoLutador;
    }
    public void setPesoLutador(Double pesoLutador) {
        this.pesoLutador = pesoLutador;
    }
    //Métodos Especiais
    public void apresentarLutador(){
        JOptionPane.showMessageDialog(null,"Senhoras e Senhores vem aí o lutador " + nomeLutador +" pesando " +pesoLutador+"kg e com seus impressionantes " + alturaLutador + "m de altura, na flor de seus " + idadeLutador + " anos de idade.\nEste "+nacionalidadeLutador + " já teve um saldo de "+ numeroDerrotas+" Derrotas/"+ numeroEmpates + " Empates/"+numeroVitorias+" Vitórias.", "Apresentação Lutadores", 1);
    }
    public void ganharLuta(){
        int incremento = getNumeroVitorias()+1;
        setNumeroVitorias(incremento);
    }
    public void empatarLuta(){
        int incremento = getNumeroEmpates()+1;
        setNumeroEmpates(incremento);
    }
    public void perderLuta(){
        int incremento = getNumeroDerrotas()+1;
        setNumeroDerrotas(incremento);
    }
    public void mostrarSaldoTotal(){
        JOptionPane.showMessageDialog(null, "V:"+getNumeroVitorias()+"\n E:"+getNumeroEmpates()+"\n D:"+getNumeroDerrotas(),"Saldo do Lutador - "+ getNomeLutador(), 1);
    }

}