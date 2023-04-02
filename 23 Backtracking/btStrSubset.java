public class btStrSubset {

    public static void printSs(String str,String ans,int i){
        if (i == str.length()){
            if (ans.length()==0) {
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            }
            return;
        }

        printSs(str, ans+str.charAt(i),i+1);
        printSs(str, ans,i+1);
    }
    public static void main(String[] args) {
        printSs("abc", "", 0);
    }
}
