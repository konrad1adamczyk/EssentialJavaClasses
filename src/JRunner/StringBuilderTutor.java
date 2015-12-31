package JRunner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringBuilderTutor extends Tutor {

    String [] animals =
            {"Cow", "Goose", "Cat", "Dog", "Elephant",
                    "Rabbit", "Snake", "Chicken", "Horse", "Human"};

    /**
     * Method must return a string:
     * "Animal list: Cow, Goose, ..., Human."
     * For implementation use StringBuilder
     */
    public static String getAnimalsString(String[] wyrazy) {
        StringBuilder stringAnimals = new StringBuilder();
        stringAnimals.append("Animal list: ");
        for (int i = 0; i < wyrazy.length-1; i++) {
            stringAnimals.append(wyrazy[i]).append(", ");
        }
        stringAnimals.append(wyrazy[wyrazy.length-1]).append(".");
        return stringAnimals.toString();
    }
    @Test
    public void testGetAnimalsString() {
        String animalsString = getAnimalsString(animals);
        assertEquals("Animal list: Cow, Goose, Cat, Dog, Elephant, "+
                "Rabbit, Snake, Chicken, Horse, Human.", animalsString);
    }

}
