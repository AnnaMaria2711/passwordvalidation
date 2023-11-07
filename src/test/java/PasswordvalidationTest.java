
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordvalidationTest {


    @Test
    void PasswordvalidationTest_whenpasswordAtLeast8Characters_returnTrue() {

        // GIVEN

        String password = "2Java0Boot2Camp3";

        // WHEN

        boolean checkForLength = Passwordvalidation.checkForLength(password);

        // THEN
        assertTrue(checkForLength);
    }

    @Test
    void PasswordvalidationTest_ifPasswordIncludesNumbers_returnTrue() {
        // GIVEN

        String password = "2Java0Boot2Camp3";

        // WHEN

        boolean checkForNumbers = Passwordvalidation.checkForNumbers(password);

        // THEN

        assertTrue(checkForNumbers);

    }

    @Test
    void PasswordvalidationTest_ifPasswordIncludesUpperandLowercase_returnTrue() {
        //GIVEN

        String password ="2Java0Boot2Camp3";

        // WHEN

        boolean checkForUpperAndLowercase = Passwordvalidation.checkForUpperAndLowercase(password);

        // THEN
         assertTrue(checkForUpperAndLowercase);

    }

    @Test
    void PasswordvalidationTest_ifPasswordIsWeak_returnStringBadPassword(){
        // GIVEN


        String eingabePasswort = "Password1";


        // WHEN

        boolean checkForWeakPassword = Passwordvalidation.checkForWeakPassword(eingabePasswort);

        // THEN

        assertTrue(checkForWeakPassword);
        assertTrue(checkForWeakPassword);
        assertTrue(checkForWeakPassword);
        assertTrue(checkForWeakPassword);
        assertTrue(checkForWeakPassword);
        assertTrue(checkForWeakPassword);
        assertTrue(checkForWeakPassword);

    }

    @Test
    void PasswordvalidationTest_ifPasswordContainsSpecialCharacters_returnTrue(){
        // GIVEN

        String pw = "3@anssNJw-asda";

        // WHEN

        boolean checkForSpecialCharacters = Passwordvalidation.checkForSpecialCharacter(pw);

        // THEN

        assertTrue(checkForSpecialCharacters);


    }

    @Test
    void PasswordvalidationTest_createRandomPassword(){
        // GIVEN

        int length = 10;

        // WHEN

        String generatedPassword = Passwordvalidation.makePassword(length);

        // THEN

        assertTrue(generatedPassword.matches("[a-zA-Z0-9]+"));
    }
    }
