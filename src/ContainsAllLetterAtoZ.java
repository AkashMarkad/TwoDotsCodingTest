import java.util.Scanner;

public class ContainsAllLetterAtoZ {


    public static boolean checkContainsAllLetters(String str){

        boolean[] arr = new boolean[26];

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch))  arr[ch-'a'] = true;
        }

        for(boolean b : arr){
            if(!b)    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        boolean res = checkContainsAllLetters(str);

        System.out.println(res);
    }
}
