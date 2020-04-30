import java.util.Random;

public class DogBuilder extends AnimalBuilder {
    Random random = new Random();

    public void setAge() {
        animal.setAge(random.nextInt(20));
    }

    public void setName() {
        String[] animalsName = {"Pies1", "Kot", "Azor"};
        int index = random.nextInt(animalsName.length);
        animal.setName(animalsName[index]);
    }

    public void setSpecies() {
        animal.setSpecies("dog");
    }
}
