package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        //  operadores simples  +  - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // dividir int por int, resultará em um int, porém se dividir int por double, o resultado será
        // o correto

//        divisao
        double numero03 = 20.0;
        double resultado2 = numero01 / numero03;
        System.out.println(resultado2);

//        multiplicacao
        double resultado03 = numero01 * numero02;
        System.out.println(resultado03);

//      se somarmos string + alguma coisa, será concatenado, porém se for feito a soma primeiramente com
//        numeros na frente, ai será feito a soma, e só depois se tiver string, será concatenado
        System.out.println("exemplo concatenando" + numero03 + numero02);
        System.out.println(numero03 + numero02 + " teste " + numero01 + numero02);


//        operador resto  %
        int resto = 20 % 2;
        System.out.println("imprimindo o resto de 20/2 =");
        System.out.println(resto);


//        operadores  <  >  <= >=  ==  !=
//      sempre retornarao valores booleanos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

//        erro de compilação ao comparar algo incomparável, tipo, numero com string

//        operadores lógicos  && (AND)  || (OU)  !(NOT) negação
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);


//        =  +=  -=  *=  /=  %=
        double bonus = 1800; // 1800
        bonus += 1000;  // 2800
        bonus -= 1000;  // 1800
        bonus *= 2;  // 3600
        bonus /= 2;  // 1800
        bonus %= 2;  // 0
        System.out.println("bonus = " + bonus);

//      ++  --
        int contador = 0;
        contador += 1;  // contador = contador + 1;
        contador++; // 2
        contador--; // 1
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); // ++ a direita incrementa depois
        System.out.println(contador2);
        System.out.println(++contador2); // ++ a esquerda incrementa antes



    }
}
