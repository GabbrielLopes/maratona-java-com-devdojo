package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilize a estrutura condicional "switch"
        // Dado os valores de 1 a 7, imprima se é dia útil ou é final de semana
        // Considerando 1 como domingo

        int dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                break;
        }

        // Ou podemos fazer da seguinte maneira

        dia = 3;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                break;
        }

    }
}
