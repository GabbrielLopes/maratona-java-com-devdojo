package academy.devdojo.maratonajava.introducao;


public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        // while, do while , for
        int sla = 1;

        while(sla < 9){
            System.out.println(sla);
            sla++;
        }

        sla = 1;
        // bem pouco utilizado
        do {
            System.out.println("teste " + sla);
            sla++;
        } while (sla < 9);

        for (int i = 1 ; i < 9 ; i++){
            System.out.println("ola " + i);
        }


    }
}
