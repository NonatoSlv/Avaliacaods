public class Veiculo {

    String modelo;
    String cor;
    int velocidade;

    public Veiculo (String modelo, String cor, int velocidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 230;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("O veículo acelerou para " + velocidade + " km/h");
    }

    public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("O veículo desacelerou para " + velocidade + " km/h");
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + this.modelo + " Cor: " + this.cor + " Velocidade atual: " + this.velocidade);
    }
}