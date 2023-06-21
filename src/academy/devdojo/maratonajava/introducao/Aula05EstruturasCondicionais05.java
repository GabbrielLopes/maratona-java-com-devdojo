package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {

    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo

        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        String sexo = "M";  // o switch case deve ser a mesma tipagem

        switch(sexo) {
            case "M":
                System.out.println("Homem");
                break;
            case "F": {  // apenas para mostrar, tem a opção de usar par de chaves e deixando um bloco de código
                System.out.println("Mulher");
                break;
            }
            default:
                System.out.println("Inválido");
                break;
        }


    }

}
