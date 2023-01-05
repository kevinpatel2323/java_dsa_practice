class array_sorted_orNot{

    public static int check(int a[],int len){
        if(len == 0){
            return 1;
        }

        if(a[len]>=a[len-1]){
            return check(a,len-1);
        }
        else{
            return -1;
        }

    }
    public static void main(String[] args) {
        int[] a = {1,1,3,4,5};
        System.out.println(check(a,4));
    }
}