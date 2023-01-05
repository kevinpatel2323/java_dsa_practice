public class print_numbers{

    public static void printRev(int n){
        if(n == 0){
            return;
        }
        
        printRev(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printRev(10);
    }
}