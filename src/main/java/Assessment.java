import java.util.ArrayList;
import java.util.List;

public class Assessment {
    public static double half (double num) {
        return num / 2;
    }
    public static String shout (String word) {
        return word.toUpperCase() + "!!!";
    }

    public static ArrayList<Animal> removeCats (ArrayList<Animal> animal) {

        for (int i = 0; i < animal.size(); i++) {
            if (animal.get(i).getSpecies().equalsIgnoreCase("Felis catus")) {

                animal.remove(i);

            }
        }



        return animal;
    }

    public static void main(String[] args) {
         System.out.println(shout("this is great"));
         Animal an1 = new Animal("an1", "Felis catus");
         Animal an2 = new Animal("an2", "werwer");
         Animal an3 = new Animal("an3", "Felis catus");
         ArrayList <Animal> animalsList = new ArrayList<>();
         animalsList.add(an1);
         animalsList.add(an2);
         animalsList.add(an3);
        System.out.println(removeCats(animalsList));


    }
}
//        1. Create an `Assessment` class with a public static method named `half`. It should accept a number and return the number divided by two.

//        1. Within your `Assessment` class create a public static method named `shout`. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
//        1. Within your `Assessment` class create a public static method named `removeCats`. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.