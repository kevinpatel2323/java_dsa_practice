//O(N)
class XpowN{

    public static int power(int n,int p) {
        if(p==0){
            return 1;
        }
        return n * power(n,p-1);
    }

    public static void main(String[] args) {
        int x = power(2,10);

        System.out.println(x);
    }
}