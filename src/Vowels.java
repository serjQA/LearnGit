import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by User on 15.05.2015.
 */
public class Vowels {
    static Set vowels;
    static int allVowels;
    public static void main(String[] args) {
        Vowels vow = new Vowels();
        vowels = new HashSet();
        Collections.addAll(vowels, "у е ы а о я и ю".split(" "));
        vow.countTextVowels("Шла Саша по шоссе, и сосала сушку. ");


    }

    public String countWordVowels(String word){
        int count=0;
        String[] wordArr = word.split("");
        for(int i =0; i < wordArr.length;i++){
            if(vowels.contains(wordArr[i].toLowerCase())){
                allVowels++;
                count++;
            }
        }
        return word + ": has " + count +" vowels";
    }

    public void countTextVowels(String text){
        String[] arr = text.split(" |\\, ");
        for (int i = 0; i < arr.length;i++){
            System.out.println(countWordVowels(arr[i]));
        }
        System.out.println("Total " + allVowels);
    }
}
