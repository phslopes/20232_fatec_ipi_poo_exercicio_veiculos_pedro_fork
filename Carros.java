public class Carros{
   private String corDoVeiculo;
        public String getVeiculoCor(){
        return corDoVeiculo;
        }
         public String setVeiculoCor(String corDoVeiculo){
            this.corDoVeiculo = corDoVeiculo;
         }
        public void exibirMensagem(){
        System.out.printf("A cor do carro e: ", corDoVeiculo);
        }
        Carros(String corDoVeiculo){
        this.corDoVeiculo = corDoVeiculo;
        }
}
