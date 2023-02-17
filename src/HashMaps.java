import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> examScore = new HashMap<String, Integer>();
        examScore.put("Math",56);
        examScore.put("English",89);
        examScore.put("Hindi",45);


        System.out.println(examScore.get("English"));

        examScore.putIfAbsent("English",20);
        examScore.replace("English",20);


        System.out.println(examScore.toString());

        examScore.remove("English");
        System.out.println(examScore.toString());
    }
}
