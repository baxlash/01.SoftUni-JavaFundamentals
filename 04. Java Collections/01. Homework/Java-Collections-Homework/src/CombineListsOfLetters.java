import com.sun.xml.internal.ws.binding.FeatureListUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Baxlash on 3/26/2016.
 */
public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstLine = console.nextLine().replaceAll(" ","");
        String secondLine = console.nextLine().replaceAll(" ","");

        List<Character> firstList = new ArrayList<>();
        List<Character> secondList = new ArrayList<>();

        for (int i = 0; i < firstLine.length(); i++) {
            firstList.add(firstLine.charAt(i));
        }
        for (int i = 0; i < secondLine.length(); i++) {
            secondList.add(secondLine.charAt(i));
        }
        List<Character> union = new ArrayList<>(firstList);

        for (int i = firstList.size()-1; i >=0 ; i--) {
            for (int j = 0; j < secondList.size(); j++) {
                if(firstList.get(i)==secondList.get(j)){
                    union.remove(i);
                }
                break;
            }
            //continue;
        }
        union.addAll(secondList);

        System.out.println(union);

    }
}
