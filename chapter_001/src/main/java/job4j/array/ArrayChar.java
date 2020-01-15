package job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;       // h e l l o     h e l
        for (int index = 0; index != pref.length; index++) {

            if (word[index] == pref[index]) {
                result = true;
                continue;
            } else if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
            return result;


    }
}