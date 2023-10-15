public sealed class Animal permits Aquatic,terrestrial {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(){}
    public Animal(String family, String name, int age, boolean
            isMammal)
    {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;

    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println(" must  be a positive number");
        else
            this.age = age;
    }
     public boolean isMammal() {
        return isMammal;
    }
    void displayAnimals(){
        System.out.println(family + name + age);

    }
}

