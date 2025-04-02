public class Main {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Ferrari PuroSangue", "Vermelho", 250, 4);
        carro1.exibirInformacoes();
        carro1.acelerar(50);
        carro1.frear(13);
        carro1.exibirInformacoes();
    }
}
