public class Main {

    // 1. parenthesesCheck
public static boolean parenthesesCheck(String str) {
if (str.charAt(0)!=')' && str.charAt(str.length()-1)!='(') {
    int first = 0;
    int second = 0;
    for (int i=0; i<str.length(); i++) {
        if (str.charAt(i)==')') {
            first++;
        }
        if (str.charAt(i)=='(') {
            second++;
        }
    }
    return second==first;
}
return false;
}

    // 2. reverseInteger
public static String reverseInteger(int digits) {
    String str = digits+"";
    String result = "";
    for (int i=str.length()-1; i>=0; i--) result+=str.charAt(i);
return result;
}

    // 3. encryptThis
    public static String encryptThis(String str) {
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");

        for (String word : words) {
            StringBuilder currentWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (i == 0) {
                    currentWord.append((int) word.charAt(i));
                } else if (i == 1) {
                    currentWord.append(word.charAt(word.length()-1));
                } else if (i == word.length() - 1) {
                    currentWord.append(word.charAt(1));
                } else {
                    currentWord.append(word.charAt(i));
                }
            }
            result.append(currentWord).append(" ");
        }
        return result.toString().trim();
    }
    // 4. decipherThis
public static String decipherThis(String str) {
    StringBuilder result = new StringBuilder();
    String[] words = str.split(" ");
    for (String word : words) {
        StringBuilder currentWord = new StringBuilder();
        int count=0;
        for (int i=0; i<word.length(); i++) {
            if (!Character.isAlphabetic(word.charAt(i))) {
                count++;
            }
        }
        currentWord.append((char) (Integer.parseInt(word.substring(0, count))));
        for (int i = count; i < word.length(); i++) {
            if (i == count) {
                currentWord.append(word.charAt(word.length()-1));
            } else if (i == word.length() - 1) {
                currentWord.append(word.charAt(count));
            } else {
                currentWord.append(word.charAt(i));
            }
        }
        result.append(currentWord).append(" ");
    }
    return result.toString().trim();
}
}