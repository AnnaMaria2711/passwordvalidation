public class Passwordvalidation {

    static String password;


    public static boolean checkForLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkForNumbers(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }

        }
        return false;
    }
}

