public class XpowNlogn {

    public static int power(int n,int p) {
        if (p==0) {
            return 1;
        }

        int hp = power(n,p/2);
        int fp = hp * hp;
        if (p%2==1) {
            fp = n * fp;
        }

        return fp;
    }
    public static void main(String[] args){
        System.out.println(power(2, 10));
    }   
}