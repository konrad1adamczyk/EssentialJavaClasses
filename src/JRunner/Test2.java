package JRunner;

import java.util.Properties;
import java.util.regex.*;

/**
 * Created by KAdamczyk on 2015-12-16.
 */
public class Test2 {





    public static String toTitleCase(String testString)
    {
        String result = "";
        result += testString.replaceFirst(testString.charAt(0)+"", Character.toUpperCase(testString.charAt(0))+"");
        return result;
    }
public static void main (String[] args){

    System.getProperty("java.version");
    String prop = System.getProperty("java.version");
    System.out.print("****"+prop);



//    String email = "konrad.adamczyk@luxoft.com";
//    String animalsString = "List of animals: cow, goose, cat, dog, elephant, Rabbit, Snake, Chicken, Horse, Man.";
////    cow,     goose,   cat,   dog,   elephant,   Rabbit,   Snake,   Chicken,   Horse,   Man."
////    {"Cow", "Goose", "Cat", "Dog", "Elephant", "Rabbit", "Snake", "chicken", "Horse", v}
//
//    String rep1 = animalsString.replaceAll("List of animals: ", "");
//    String rep2 = rep1.replaceAll("[\\.]", "");
//    String[] parseAnimals = rep2.split(", ");
//    for (int i =0; i<parseAnimals.length-1; i++){
//
//            parseAnimals[i]= toTitleCase(parseAnimals[i]);
//    }
//    parseAnimals[parseAnimals.length-1] = "Human";
//
//    for (int i =0; i<parseAnimals.length; i++){
//
//        System.out.println(parseAnimals[i]);
//    }
//    System.out.println("***********************");
//
//
//
//
//    if(email.matches("[A-Za-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")) System.out.println("siedzi");
//    else {
//        System.out.println("dupa");
//    }
//
//    String[] parseEmail = email.split("[\\.,@]");
//
//    System.out.println(parseEmail.length);
//    for (int i =0; i<parseEmail.length; i++){
//        System.out.println(parseEmail[i]);
//    }
//    System.out.println(parseEmail);
//    String name = parseEmail[0];
//    String domainName = parseEmail[1];
//    String domainZone = parseEmail[2];
}

}
