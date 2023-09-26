import java.util.Scanner;
public class ZooManagement {
    int nbrCages=20;
    String zooName="my zoo";
    public static void main(String[] args)
    { //instruction 1
        ZooManagement zm=new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");
        //instruction 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        int nbrCagesSaisie = sc.nextInt();
        System.out.println("Veuillez saisir le nom de zoo:");
        String zooName = sc.next();
//PROSIT2
        Animal lion=new Animal();
        Animal dog=new Animal();
        lion.name="Simba";
        lion.age=25;
        lion.family="cats";
        lion.isMammal= true;
        Zoo myZoo=new Zoo();
        myZoo.nbrCages=25;
        myZoo.animals = new Animal[25];
        myZoo.name="myPark";
        myZoo.city="tunis";
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        Animal.displayAnimals();






    }


}
