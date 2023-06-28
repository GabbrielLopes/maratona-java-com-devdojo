package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {


    public static void main(String[] args) {
        double valorTotal = 50000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
                // enquanto valor da parcela < 1000, ignorará o código abaixo e voltará ao inicio do loop
            }
            System.out.println("Valor da parcela R$ " + valorParcela + " em " + parcela + " vezes ");

        }


    }
}
