package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 80;
        char caractereUnicode = '\u0041';
        String nome = "Saitama";

        System.out.println("A idade é "+ idade+" anos");
        System.out.println(falso);
        System.out.println("char ASCII "+caractere);
        System.out.println("char Unicode "+caractereUnicode);
        System.out.println("Oi meu nome é "+nome);
    }
}
