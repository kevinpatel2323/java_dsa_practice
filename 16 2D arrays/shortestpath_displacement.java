import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class shortestpath_displacement {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String str = sc.nextLine();
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) == 'n') {
                y2++;
            }
            else if (str.charAt(i) == 's') {
                y2--;
            } 
            else if (str.charAt(i) == 'e') {
                x2++;
            } 
            else if(str.charAt(i) == 'w'){
                x2--;
            }
            else{
                System.out.println("Invalid char");
                break;
            }

        }

        float ans = (float)Math.sqrt((float)Math.pow(x2-x1, 2)+(float)Math.pow(y2-y1, 2));
        System.out.println(ans);
    }
}
