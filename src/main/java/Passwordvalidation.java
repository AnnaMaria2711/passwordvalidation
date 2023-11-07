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

    public static boolean checkForUppercase(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                return true;

            }

        }
        return false;
    }
    public static boolean checkForLowercase(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                return true;

            }

        }
        return false;
    }

    public static boolean checkForUpperAndLowercase(String password){
        boolean uppercase = checkForUppercase(password);
        boolean lowercase = checkForLowercase(password);
        if (uppercase == true && lowercase == true){
            return true;
        }
       return false;
    }
}

