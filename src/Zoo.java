public class Zoo {
    static final int NUMBER_OF_CAGES = 25;
    Animal[] animals;
    String name;
    String city;
    private int nbrAnimals;
public Zoo(){}
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
     public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

void displayZoo(){
    System.out.println(nbrCages + name + city);

}

boolean addAnimal(Animal animal){
    if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    

return  true;
}
int searchAnimal(Animal animal) {
    int i;
    int index = -1;
    for (i = 1; i <= nbrCages; i++) {

        if (animals[i].name == animal.name)
            return i;
    }
        return index;

}
boolean removeAnimal(Animal animal)
{
    int indexAnimal = searchAnimal(animal);
    if (indexAnimal == -1)
        return false;
    for (int i = indexAnimal; i < nbrCages; i++) {
        animals[i] = animals[i + 1];
        animals[nbrCages] = null;
        this.nbrCages--;
    }
    return true;
}
    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }
}
