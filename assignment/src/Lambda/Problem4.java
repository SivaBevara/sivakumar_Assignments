package Lambda;

import java.util.ArrayList;
import java.util.List;


public class Problem4 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        
        words.add("enough");
        words.add("india");
        words.add("this");
        words.add("closer");
        words.add("hindsight");
        words.add("random");

       
       
        words.stream().filter(word -> word.length() %2==0).forEach(System.out::println);
    }

}