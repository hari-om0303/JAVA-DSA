package Questions;

import java.util.HashMap;

public class itinerary_concept {
    public static String get(HashMap<String , String> tick){
        HashMap<String, String> revmap = new HashMap<>();

        for (String key : tick.keySet() ){
            if (!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai" , "bengluru");
        tickets.put("mumbai" , "delhi");
        tickets.put("goa" , "chennai");
        tickets.put("delhi" , "goa");

        String start = get(tickets);

        while (tickets.containsKey(start)){
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);

    }
}
