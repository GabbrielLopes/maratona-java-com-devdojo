package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // diferentes maneiras de inicializar arrays

        int[] numeros = new int[3];

        int[] outrosNumeros = {1,2,3,4,5};

        int[] outraManeiraDeInicializarArray = new int[]{1,2,3};


        for (int i = 0; i < outrosNumeros.length; i++) {
            System.out.println(outrosNumeros[i]);
        }

        for (int num : outraManeiraDeInicializarArray){
            System.out.println(num);
        }

    }
}
