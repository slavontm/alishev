package Recursion;

public class Test {
    public static void main(String[] args) {
    fuckTorial(3);

    // FuckTorial 4!=4*3*2*1;
    // 3!=3*2*1;
    // 2!=2*1;
    // 1!=1
        System.out.println(fuckTorial(4));
    }

    // STACK:
    // FuckTorial(4;
    // 4*6=24;
    // 3*2=6;
    // 2*1=2;
    // fuckTorial(1)=return 1;


    private static  int fuckTorial(int n){

        if (n==1)
            return 1;
        return n * fuckTorial(n-1);

    }
}
