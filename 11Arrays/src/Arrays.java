public class Arrays {
    public static void main(String[] args) {
        int number=10; //primitive
  /*      char c='a'; //primitive
        String s="Hello"; //pointer;
        String s1=new String("Hello"); //pointer */
        int [] numbers = new int [5]; // 0 1 2 3 4
        for (int i=0; i<numbers.length; i++) {
            numbers[i]=i*10;
        }
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int numbers1[]={1,2,3,4,5};
        for (int i=0; i<numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }

}
