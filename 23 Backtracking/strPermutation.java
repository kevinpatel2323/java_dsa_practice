public class strPermutation {
    public static void printPermutations(String str,String ans){

        if (str.length()==0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);

            String s = str.substring(0, i) + str.substring(i+1);

            printPermutations(s, ans+chr);
        }
        
    }
    public static void main(String[] args) {
        printPermutations("abcd", "");
    }
}
