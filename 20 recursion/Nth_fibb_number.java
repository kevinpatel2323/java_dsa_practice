class Nth_fibb_number{
    
    public static void fibbo(int s,int e,int n) {
        if(n == 1){
            System.out.println(e);
            return;
        }
        // System.out.println(e);
        fibbo(e,s+e,n-1);
    }

    public static void main(String[] args) {
        // System.out.println(0);
        fibbo(0,1,9);
    }
}