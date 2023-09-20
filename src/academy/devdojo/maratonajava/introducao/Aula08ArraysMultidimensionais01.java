package academy.devdojo.maratonajava.introducao;

    public class Aula08ArraysMultidimensionais01 {

    public static void main(String[] args) {

        int[][] dias = new int[3][3];

        dias[0][0] = 0;
        dias[0][1] = 1;
        dias[0][2] = 2;

        dias[1][0] = 3;
        dias[1][1] = 4;
        dias[1][2] = 5;

        dias[2][0] = 6;
        dias[2][1] = 7;
        dias[2][2] = 8;

//        System.out.println(dias[0][0]);
//        System.out.println(dias[0][1]);
//        System.out.println(dias[2][2]);


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);;
            }
        }

        for(int[] arrayBase : dias){
            for (int num : arrayBase){
                System.out.println(num);
            }
        }


    }


}
