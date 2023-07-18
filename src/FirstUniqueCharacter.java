import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {

    public static char FindFirstNonReapetingCharacter(String str) {

        Map<Character, Integer> hm = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch))  hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1)   return entry.getKey();
        }
        return 'a';
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        char res = FindFirstNonReapetingCharacter(str);
        System.out.println(res);
    }


}
