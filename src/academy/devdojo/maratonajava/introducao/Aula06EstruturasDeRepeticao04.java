package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorTotal = 17500;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Valor da parcela R$ " + valorParcela + " em " + parcela + " vezes ");
        }

    }

}
