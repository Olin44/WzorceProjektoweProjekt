import java.util.Random;

public class CatBuilder extends AnimalBuilder {
    Random random = new Random();
    public void setAge() {
        animal.setAge(random.nextInt(20));
    }

    public void setName() {
        String[] animalsName = {"Grażyna", "Mruczek", "Bonifacy"};
        int index = random.nextInt(animalsName.length);
        animal.setName(animalsName[index]);
    }

    public void setSpecies() {
        animal.setSpecies("cat");
    }
}
