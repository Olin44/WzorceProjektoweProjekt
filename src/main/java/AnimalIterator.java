import java.util.ArrayList;

public class AnimalIterator implements Container {
    public ArrayList<Animal> animals;

    public AnimalIterator(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {

            if(index < animals.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return animals.get(index++);
            }
            return null;
        }
    }
}