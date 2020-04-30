public class AnimalCreator {
    private static volatile AnimalCreator instance;

    private AnimalCreator(){}
    public static AnimalCreator getInstance(){
        if(instance == null){
            synchronized (AnimalCreator.class){
                if(instance == null){
                    instance = new AnimalCreator();
                }
            }
        }
        return instance;
    }

    private AnimalBuilder animalBuilder;

    public void setAnimalBuilder(AnimalBuilder animalBuilder) {
        this.animalBuilder = animalBuilder;
    }

    public Animal getAnimal() {
        return animalBuilder.getAnimal();
    }

    public void constructAnimal() {
        animalBuilder.createNewAnimal();
        animalBuilder.setAge();
        animalBuilder.setName();
        animalBuilder.setSpecies();
    }
}
