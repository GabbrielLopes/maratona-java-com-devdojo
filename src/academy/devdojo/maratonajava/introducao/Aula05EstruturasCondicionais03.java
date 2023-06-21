package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 6000.0;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

//    OPERADOR TERNÁRIO
//    variavel = (condicao) ? verdadeiro : falso;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(mensagemDoar);


//    IF
//        if(salario > 5000){
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensagemNaoDoar;
//        }
//        System.out.println(resultado);


    }
}
