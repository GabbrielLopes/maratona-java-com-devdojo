package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{5,4,3,2,1};


//        for (int[] arrayBase : arrayInt){
//            System.out.println("\n-----");
//            for (int num : arrayBase){
//                System.out.print(num);
//            }
//        }

        int[][] arrayInt2 = {{0,1,2},
                            {3,4,5},
                            {6,7,8}};

//        for (int[] arrayBase : arrayInt2){
//            System.out.println("\n-----");
//            for (int num : arrayBase){
//                System.out.print(num + " ");
//            }
//        }

        int[][] arrayInt3 = {{0,1},{3,4,5,6,7},{6,7,8},{9,8,7,6,5,4,3,2,1}};

        for(int[] arrayBase : arrayInt3){
            System.out.println("\n" + "- ".repeat(arrayBase.length));
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
