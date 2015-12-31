package JRunner;

import static org.junit.Assert.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegExpTutor extends Tutor {

    class Email {
        String name;
        String domainName;
        String domainZone;
    }

    public Email getEmail(String emailString) {
        String[] parseEmail = emailString.split("[\\.,@]");
//
//        System.out.println(parseEmail);
        Email email = new Email();
        email.name = parseEmail[0];
        email.domainName = parseEmail[1];
        email.domainZone = parseEmail[2];
        return email;
    }

    /**
     * Returns a list of lines by text representation of the lines.
     * Takes a string
     * "List of animals: cow, goose, cat, dog, elephant, rabbit,
     * snake, chicken, horse, human."
     * And returns an array of animals
     */
    public static String toTitleCase(String testString)
    {
        String result = "";
        result += testString.replaceFirst(testString.charAt(0)+"", Character.toUpperCase(testString.charAt(0))+"");
        return result;
    }
    public String[] getAnimalsArray(String animalsString) {

        String rep1 = animalsString.replaceAll("List of animals: ", "");
        String rep2 = rep1.replaceAll("[\\.]", "");
        String[] parseAnimals = rep2.split(", ");
        for (int i =0; i<parseAnimals.length-1; i++){

            parseAnimals[i]= toTitleCase(parseAnimals[i]);
        }
        parseAnimals[parseAnimals.length-1] = "Human";

        return parseAnimals;
    }

    @Test
    public void testGetEmail() {
        Email email = getEmail("ivanov@mail.ru");
        assertEquals("ivanov", email.name);
        assertEquals("mail", email.domainName);
        assertEquals("ru", email.domainZone);

    }

    @Test
    public void testGetAnimalsArray() {
        String [] animals =
                {"Cow", "Goose", "Cat", "Dog", "Elephant",
                        "Rabbit", "Snake", "Chicken", "Horse", "Human"};
        String animalsString =
                "List of animals: cow, goose, cat, dog, elephant, Rabbit, Snake, Chicken, Horse, Man.";
        String[] animalsArray = getAnimalsArray(animalsString);

        for (String s : animalsArray) {
            System.out.println(s);
        }
        assertArrayEquals(animals, animalsArray);
    }

}
