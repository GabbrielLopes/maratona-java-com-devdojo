package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {

        // imprima todos os numeros pares de 0 até 1000000

        // while
        int i = 0;

        while (i <= 1000000) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // for
        for (i = 0; i <= 1000000 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
