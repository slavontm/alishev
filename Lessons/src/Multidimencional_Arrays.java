public class Multidimencional_Arrays {
    public static void main(String[] args) {
        int [] number = {1,2,3};
        int [][] matrix={{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
            System.out.print(matrix[i][j]+" ");
//            System.out.println(matrix[1][0]);
            }
            System.out.println();
        }

        String [][] strings=new String[2][3];
        strings[1][0]="hello";
        System.out.println(strings[1][0]);

    }
}
