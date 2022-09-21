import java.util.*;

public class CharOcc {
    
    public static HashMap<Character, Integer> findOccurences(char[] chars) {
        
        ArrayList<Character> charsUniq = new ArrayList<Character>();
        ArrayList<Integer> occ = new ArrayList<Integer>();
        HashMap<Character, Integer> charsOcc = new HashMap<Character, Integer>();
    
        if(chars.length == 0) {
          System.out.println("Empty array");
        }
    
        for(int i = 0; i < chars.length; i++) {
          if(charsUniq.contains(chars[i])) {
            continue;
          } else {
            charsUniq.add(chars[i]);
          }
        }
    
        for(int i = 0; i < charsUniq.size(); i++) {
          int counter = 0;
    
          for(int x = 0; x < chars.length; x++) {
            if(charsUniq.get(i).equals(chars[x])) {
              counter++;
            }
          }
    
          occ.add(counter);
        }
    
        for(int i = 0; i < charsUniq.size(); i++) {
          charsOcc.put(charsUniq.get(i), occ.get(i));
        }
        
        return charsOcc;
    }
    
    public static void main(String[] args) {
        
        char[] test1 = new char[]{'a', 'a', 'b', 'b', 'e'};
        char[] test2 = new char[]{'a'};
        char[] test3 = new char[]{'x', 'y'};
        char[] test4 = new char[]{};
        
        System.out.println(Arrays.toString(test1) + "\n");
        System.out.println(findOccurences(test1).toString());
        System.out.println(Arrays.toString(test2) + "\n");
        System.out.println(findOccurences(test2).toString());
        System.out.println(Arrays.toString(test3) + "\n");
        System.out.println(findOccurences(test3).toString());
        System.out.println(Arrays.toString(test4) + "\n");
        System.out.println(findOccurences(test4).toString());
    
    }
}
