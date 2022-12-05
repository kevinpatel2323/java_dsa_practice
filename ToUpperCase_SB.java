public class ToUpperCase_SB {
    public static String toUpperCase(String str){
        StringBuilder s = new StringBuilder("");

        char c = Character.toUpperCase(str.charAt(0));

        s.append(c);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)==' ') {
                s.append(str.charAt(i));
                i++;
                c = Character.toUpperCase(str.charAt(i));
                s.append(c);
            }
            else{
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str = "hii, i am kery";

        String result  = toUpperCase(str);
        System.out.println(result);

    }
}
