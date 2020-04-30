public class AlienToAnimalAdapter extends AnimalBuilder{
    private Alien alien;

    AlienToAnimalAdapter(Alien alien){
        this.alien = alien;
    }

    @Override
    public void setAge() {
        animal.setAge(alien.getAlienAge());
    }

    @Override
    public void setName() {
        animal.setName(alien.getAlienName());
    }

    @Override
    public void setSpecies() {
        animal.setSpecies(alien.getAlienSpecies());
    }
}
