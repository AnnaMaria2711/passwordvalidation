import java.util.Scanner;

public class Passwordvalidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Passwort ein.");
        String eingabePasswort = sc.nextLine();
        if (checkForWeakPassword(eingabePasswort)) {
            System.out.println("Ihr Passwort ist schwach.");
        } else {
            System.out.println("Passwort ist sicher genug.");
        }
    }

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

    public static boolean checkForUpperAndLowercase(String password) {
        boolean uppercase = checkForUppercase(password);
        boolean lowercase = checkForLowercase(password);
        if (uppercase == true && lowercase == true) {
            return true;
        }
        return false;
    }

    static String password1 = "123456789";
    static String password2 = "Password1";
    static String password3 = "123Hallo";
    static String password4 = "qwerty";
    static String password5 = "Passwort123";
    static String password6 = "asdfgh";
    static String password7 = "password987654321";

    public static boolean checkForWeakPassword(String eingabePasswort) {
        String[] WeakPasswords = {password1, password2, password3, password4, password5, password6, password7};
        for (String weakPassword : WeakPasswords) {
            if (weakPassword.equals(eingabePasswort)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkForSpecialCharacter(String pw) {
        for(int i = 0; i <= pw.length() ; i++){
            boolean containsSpecialChars = pw.matches("(.*[$&+,:;=?@#|'<>.-^*()%!]).*");
                    if(containsSpecialChars){
                        return true;
            }

        }
        return false;
    }

}