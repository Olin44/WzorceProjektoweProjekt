import lombok.Getter;

abstract public class AnimalBuilder {
    @Getter
    protected Animal animal;

    public void createNewAnimal(){
        animal = new Animal();
    }

    public abstract void setAge();
    public abstract void setName();
    public abstract void setSpecies();
}
