import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = RandomAnimal.getRandomAnimList();

        AnimalIterator animalIterator = new AnimalIterator(animals);

        for(Iterator iter =  animalIterator.getIterator(); iter.hasNext();){
            System.out.println(iter.next().toString());
        }

    }
}
