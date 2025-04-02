public class Carro extends Veiculo {
    
    int numeroPortas;

    public Carro(String modelo, String cor, int velocidade, int numeroPortas) {
        super(modelo, cor, velocidade);
        this.numeroPortas = numeroPortas;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + this.modelo + " Cor: " + this.cor + " Velocidade atual: " + this.velocidade + " Número de portas: " + this.numeroPortas);
    }
}
