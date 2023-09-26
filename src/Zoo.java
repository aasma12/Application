public class Zoo {
    int nbrCages;
    Animal[] animals;
    String name;
    String city;
public Zoo(){}
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
void displayZoo(){
    System.out.println(nbrCages + name + city);

}

boolean addAnimal(Animal animal){
    int i;
    for (i=1;i<=nbrCages;i++){
        if(animals[i].name==animal.name)
        return false;
        else
        animals[i]= animal;
        return true;
    }
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
}