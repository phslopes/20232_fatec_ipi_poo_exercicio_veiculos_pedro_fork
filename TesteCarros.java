public class TesteCarros{
    static public void main(String args []){
        String corDoVeiculo = javax.swing.JOptionPane.showInputDialog("Digite a cor do veiculo");
        var veiculoCor = new Carros(corDoVeiculo);
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        veiculoCor.exibirMensagem();
        System.out.printf("A cor do veiculo e " + veiculoCor.getVeiculoCor());
        String nome = "ABC";
        System.out.println("\nAte logo ");
        veiculoCor.setVeiculoCor("Verde");
    }
}