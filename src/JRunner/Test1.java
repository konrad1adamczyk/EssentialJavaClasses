package JRunner;

/**
 * Created by Konrad on 2015-12-15.
 */
public class Test1 {

    public static void main(String[] args) {

        String[] animals =
                {"Cow", "Goose", "Cat", "Dog", "Elephant",
                        "Rabbit", "Snake", "Chicken", "Horse", "Human"};

        /**
         * Method must return a string:
        * "Animal list: Cow, Goose, ..., Human."
                * For implementation use StringBuilder
                */
        System.out.println(getAnimalsString(animals));

}
    public static String getAnimalsString(String[] wyrazy) {
        StringBuilder stringAnimals = new StringBuilder();
        stringAnimals.append("Animal list: ");
        for (int i = 0; i < wyrazy.length-1; i++) {
            stringAnimals.append(wyrazy[i]).append(", ");
        }
        stringAnimals.append(wyrazy[wyrazy.length-1]).append(".");
        return stringAnimals.toString();
    }













//        String str = "Hi, John Smith!";
//        String str1 = "Hi, James Jones!";
//        String str2 = "Hi,James Smith!";
//        String str3 = "Hi, James Smith !";
//
//        System.out.println(str.lastIndexOf("!"));
//        System.out.println(str.length()-1);
//        System.out.println("--------------------");
//        System.out.println(checkGreeting(str));
//        System.out.println("--------------------");
//        System.out.println(checkGreeting(str1));
//        System.out.println("--------------------");
//        System.out.println(checkGreeting(str2));
//        System.out.println("--------------------");
//        System.out.println(checkGreeting(str3));
//        System.out.println("--------------------");
//
//
//        assertTrue(checkGreeting("Hi, John Smith!"));
//        assertTrue(checkGreeting("Hi, James Jones!"));
//        assertTrue(checkGreeting("Hi,James Smith!"));
//        assertTrue(checkGreeting("Hi, James Smith !"));
//
//                checkGreeting("Hello, James Smith!"));
//                checkGreeting("Hi, James Smith"));
//                checkGreeting("Hi, Li Soun!"));
//                checkGreeting("Hi, Dju Li!"));
//
//                checkGreeting("Hi, Peter!"));
//                checkGreeting("Hi, peter Gabriel!"));
//                checkGreeting("Hi, Peter gabriel!"));
//
//
//        str.indexOf(str.length());
//        String[] splited = str.split(" ");
//        for (int i=0; i<splited.length; i++){
//            System.out.println(splited[i]);
//        }
//    }

//    public static boolean checkGreeting(String greeting) {
//        boolean answer = false;
//        if (greeting.lastIndexOf("!") == (greeting.length() - 1)) {
//            String[] splited = greeting.split(" ");
//            if (splited.length == 2  )  {
//                String[] pierwszyWyraz = greeting.split(",");
//                if(pierwszyWyraz.length>1){
//                    if (splited[0].equals("Hi,")&& splited[1].length() > 2 && splited[2].length() > 3) {
//                        System.out.println(splited[1].length());
//                        System.out.println(splited[2].length());
//                        if (Character.isUpperCase(splited[1].charAt(0))&& Character.isUpperCase(splited[2].charAt(0))){
//                            answer= true;
//                        }
//                    }
//                    System.out.println("+++++++++++++++++++++" +pierwszyWyraz[0]);
//                    System.out.println(splited[1].charAt(splited[1].length()-1));
//                    if (pierwszyWyraz[0].equals("Hi")  && (splited[1].charAt(splited[1].length()-1)) != '!') {
//                        System.out.println(splited[1].length());
//                        if (splited[1].length() > 2){
//                            System.out.println(splited[1].charAt(0));
//                            if (Character.isUpperCase(splited[1].charAt(0)) ){
//                                answer= true;
//                            }
//                        }
//                    }
//                }
//                else {
//                    System.out.println(splited[0].charAt(0));
//                    if (splited[0].substring(0,3).equals("Hi,")  && (splited[1].charAt(splited[1].length()-1)) != '!') {
//                        System.out.println(splited[1].length());
//                        if (splited[1].length() > 2){
//                            System.out.println(splited[1].charAt(0));
//                            if (Character.isUpperCase(splited[1].charAt(0)) ){
//                                answer= true;
//                            }
//                        }
//                    }
//                }
//            } else {
//                if (splited[0].equals("Hi,")&& splited[1].length() > 2 && splited[2].length() > 3) {
//                    System.out.println(splited[1].length());
//                    System.out.println(splited[2].length());
//                    if (Character.isUpperCase(splited[1].charAt(0))&& Character.isUpperCase(splited[2].charAt(0))){
//                        answer= true;
//                    }
//                }
//            }
//        }
//        return answer;
//    }


}
