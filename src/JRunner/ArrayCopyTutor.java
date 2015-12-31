package JRunner;

import org.junit.*;

/**
 * This class does the same, which makes the standard ArrayList:
   * Increases the size of the array when the array is full.
   *
   * Implement method deleteAnimal (int position)
   *
 */
public class ArrayCopyTutor {
    int animals_capacity = 5;
    int animals_expand_by = 5;
    int animals_size = 0;
    String[] animals = new String[animals_capacity];

    public void addAnimal(String animal) {
        if (animals_size>=animals_capacity) {
            expandAnimalsArray();
        }
        animals[animals_size] = animal;
        animals_size++;
    }


    private void expandAnimalsArray() {
        int old_animals_size = animals_capacity;
        animals_capacity += animals_expand_by;
        String[] animals_new = new String[animals_capacity];
        System.arraycopy(animals, 0, animals_new, 0, old_animals_size);
        animals = animals_new;
    }

    public void insertAnimal(int position, String animal) {
        if (position<0 || position>animals_size-1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (position==animals_size-1) {
            addAnimal(animal);
        } else {
            if (animals_size>=animals_capacity) {
                expandAnimalsArray();
            }
            System.arraycopy(animals, position, animals, position+1, animals_size-position);
            animals[position] = animal;
            animals_size++;
        }
    }

    public void deleteAnimal(int position) {
        if (position < 0 || position > animals_size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        String animal = null;
        animals[position] = animal;
        System.arraycopy(animals, position+1, animals, position, animals_size-position);
        animals_size--;
    }


    public void showAnimals() {
        for (int i=0;i<animals_size; i++) {
            System.out.println(i+") "+animals[i]);
        }

    }

    @Test
    public void testAnimals() {
        addAnimal ("Horse");
        addAnimal ("Rhino");
        addAnimal ("Dog");
        addAnimal ("Snake");
        addAnimal ("Monkey");
        addAnimal ("turkey");
        addAnimal ("Roe");
        addAnimal ("Lion");
        addAnimal ("Tiger");
        addAnimal ("Cat");
        addAnimal ("Turtle");
        insertAnimal (1, "Man");
        showAnimals();
        deleteAnimal(2);
        showAnimals();
    }
}
