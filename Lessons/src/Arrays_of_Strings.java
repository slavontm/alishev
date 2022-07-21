public class Arrays_of_Strings {
    public static void main(String[] args) {
      //  int numbers[]=new int[5];
        //numbers[0]=10;
        String[] strings= new String[3];
        strings[0]="first";
        strings[1]="second";
        strings[2]="three";
        for (String string:strings
             ) {
            System.out.println(string);
        }
        
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        int numbers[]={1,2,3,4,5};
        int sum=0;
        for (int x:numbers) {
            sum=sum+x;
        }
        System.out.println(sum);

    }

}
