import java.util.HashMap;

public class itineraryForTickets {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> rev = new HashMap<>();

        for (String x : tickets.keySet()) {
            rev.put(tickets.get(x), x);
        }

        for (String x : tickets.keySet()) {
            if (!rev.containsKey(x)) {
                return x;
            }
        }
        return null;
    }

    public static void main(String args[]){
        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("c","b");
        tickets.put("m","d");
        tickets.put("g","c");
        tickets.put("d","g");

        String start = getStart(tickets);
        System.out.print(start);
        for (String x : tickets.keySet()) {
            System.out.print("->"+tickets.get(start));
            start = tickets.get(start);
        }
    }
}