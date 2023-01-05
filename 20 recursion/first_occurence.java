class first_occurence{

    public static int find_last(int a[],int i,int key){
        if(i == -1){
            return -1;
        }

        if(a[i]==key){
            return i;
        }
        else{
            return find_last(a,i-1,key);
        }
    }

    public static int find_first(int a[],int i,int key){
        if(i == a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        else{
            return find_first(a,i+1,key);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,5};
        System.out.println(find_first(a,0,2));
        System.out.println(find_last(a,a.length-1,2));
    }
}