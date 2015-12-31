package JRunner;


import java.util.regex.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTutor extends Tutor {

    /**
     * Replace all null in assertEquals to true or false
     */
    @Test
    public void testStringEquals() {
        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        log("object address s1: "+System.identityHashCode(s1));
        log("object address s2: "+System.identityHashCode(s2));
        assertEquals(s1==s2, true);
        assertEquals(s1.equals(s2), true);
        log("object address s3: "+System.identityHashCode(s3));
        assertEquals(s1==s3, false);
        // method intern() allows to get a string from the string pool
        String s4 = s3.intern();
        log("object address s4: "+System.identityHashCode(s4));
        assertEquals(s1==s4, true);
        // test recreation of the object on
        // every change
        s3 = s3+"bbb";
        log("address of the changed object s3: "+System.identityHashCode(s3));
        s3 = s3.substring(0, 3); // s3 is again "aaa"
        assertEquals(s3==s1, false);
        assertEquals(s3.equals(s1), true);
        assertEquals(s3.intern()==s1, true);
    }

    /**
     * Make sure that the welcome greeting of the form
     * Hi, Ivan Ivanov!
     * or
     * Hi, James Johnes!
     * I.e. it begins on Hi and ends with '!'
     * And contains 2 words (name and surname)
     * which are not shorter than 3 letters
     * And begin with a capital letter
     */
    public static boolean checkGreeting(String greeting) {
        boolean answer = false;
        if (greeting.lastIndexOf("!") == (greeting.length() - 1)) {
            String[] splited = greeting.split(" ");
            if (splited.length == 2  )  {
                if (splited[0].substring(0,3).equals("Hi,")  && (splited[1].charAt(splited[1].length()-1)) != '!') {
                    if (splited[1].length() > 2){
                        if (Character.isUpperCase(splited[1].charAt(0)) ){
                            answer= true;
                        }
                    }
                }
            } else {
                if (splited[0].equals("Hi,")&& splited[1].length() > 2 && splited[2].length() > 3) {
                    if (Character.isUpperCase(splited[1].charAt(0))&& Character.isUpperCase(splited[2].charAt(0))){
                        answer= true;
                    }
                }
            }
        }
        return answer;
    }



    @Test
    public void testCheckGreeting() {
        assertTrue(checkGreeting("Hi, John Smith!"));
        assertTrue(checkGreeting("Hi, James Jones!"));
        assertTrue(checkGreeting("Hi, James Smith!"));
        assertTrue(checkGreeting("Hi, James Smith !"));

        assertFalse("In the beginning should be Hi and comma",
                checkGreeting("Hello, James Smith!"));
        assertFalse("Exclamation mark should be in the end",
                checkGreeting("Hi, James Smith"));
        assertFalse("The name is too short",
                checkGreeting("Hi, Li Soun!"));
        assertFalse("Surname is too short",
                checkGreeting("Hi, Dju Li!"));
        assertFalse("Name should include both name and surname",
                checkGreeting("Hi, Peter!"));
        assertFalse("The first letter of the name must be capital",
                checkGreeting("Hi, peter Gabriel!"));
        assertFalse("The first letter of the name must be capital",
                checkGreeting("Hi, Peter gabriel!"));
    }
}
