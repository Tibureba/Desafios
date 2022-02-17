import java.util.ArrayList;
import java.util.Scanner;

public class questao_3
{
    public static void main(String[] args) {

        System.out.print("Digite uma palavra: ");
        String word = new String();
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        ArrayList<String> anagrams = new ArrayList<>();

        for(int i = 0; i <word.length(); i++) {
            for(int j = 1; j < word.length(); j++) {
                if(word.charAt(i) == word.charAt(j) && i !=j && i < j) {
                    if(word.charAt(i) == word.charAt(i+1)) {
                        String x = word.substring(i, i + 1);
                        anagrams.add(x);
                    } else {
                        String y = word.substring(i, j);
                        String z = word.substring(i + 1, j + 1);
                        String h = word.substring(i, i + 1);
                        anagrams.add(h);
                        anagrams.add(y);
                        anagrams.add(z);
                    }
                }
            }
        }

        System.out.println(anagrams);
        System.out.println(anagrams.size());

    }
}
