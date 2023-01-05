class factorial{
    
    public static int fact(int n) {
        if(n == 0){
            return 1;
        }
        int y = n * fact(n-1);
        return y;
    }

    public static void main(String[] args) {
        int a = fact(3);
        System.out.println(a);
    }
}