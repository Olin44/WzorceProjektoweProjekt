import java.util.ArrayList;
import java.util.Random;

class RandomAnimal {
    //Factory Method
    static ArrayList<Animal> getRandomAnimList() {
        Random random = new Random();
        ArrayList<Animal> animals = new ArrayList<Animal>();
        AnimalCreator animalCreator = AnimalCreator.getInstance();
        String[] animalsName = {"dog", "cat", "alien"};

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(animalsName.length);
            if (animalsName[index].equals("dog")) {
                DogBuilder dogBuilder = new DogBuilder();
                animalCreator.setAnimalBuilder(dogBuilder);
            }
            if (animalsName[index].equals("alien")) {
                AlienToAnimalAdapter alienToAnimalAdapter = new AlienToAnimalAdapter(new Alien());
                animalCreator.setAnimalBuilder(alienToAnimalAdapter);
            }
            if(animalsName[index].equals("cat")){
                CatBuilder catBuilder = new CatBuilder();
                animalCreator.setAnimalBuilder(catBuilder);
            }

            animalCreator.constructAnimal();
            animals.add(animalCreator.getAnimal());
        }
        return animals;
    }
}
