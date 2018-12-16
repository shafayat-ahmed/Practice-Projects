package HashMap;
import java.util.*;

public class UseHashMap{
    public static void main(String[] args) {

        List<String> cityOfBangladesh = new ArrayList<String>();
        cityOfBangladesh.add("Dhaka");
        cityOfBangladesh.add("Chittagong");


        List<String> cityOfEngland = new ArrayList<String>();
        cityOfEngland.add("London");
        cityOfEngland.add("Manchester");


        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("Atlanta");
        cityOfUSA.add("NY");

        Map<String,List<String>> map=new HashMap<String, List<String>>();
        map.put("Bangladesh", cityOfBangladesh);
        map.put("England", cityOfEngland);
        map.put("USA", cityOfUSA);

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}