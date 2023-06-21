package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }

        double dinheiro = 15.0;
        boolean podeComprarCafe = dinheiro >= 7.5;
        if (!podeComprarCafe){
            System.out.println("Não pode comprar café");
        } else {
            System.out.println("Pode comprar café");
        }

    }
}
