package job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 1; index != post.length; index++) {

            // if(word[word.length- index] == post[post.length- index]) {
            // result = true;


            if (word[word.length - index] != post[post.length - index]) {
                result = false;
                break;
            }
        }


        return result;
    }
}
