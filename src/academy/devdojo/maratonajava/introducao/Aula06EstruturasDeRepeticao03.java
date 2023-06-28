package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {

        // Imprima os primeiros 25 numeros de um dado valor 50.

        int valor = 50;

        for (valor = 1 ;valor <= 50 ; valor++){
            System.out.println(valor);
            if(valor == 25){
                break;
            }
        }

    }
}
