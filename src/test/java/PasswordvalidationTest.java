
import org.junit.jupiter.api.Test;

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

        String password = "2Java0Boot2Camp3";

        // WHEN

        boolean checkForUpperAndLowercase = Passwordvalidation.checkForUpperAndLowercase(password);

        // THEN
         assertTrue(checkForUpperAndLowercase);

    }

    }
