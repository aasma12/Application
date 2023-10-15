public final class terrestrial extends Animal{

    private int nbLegs;

    public Terrestrial(){

    }

    public Terrestrial(String family, String name, int age, boolean isMammal,int nbLegs){
        super(family,name,age,isMammal);
        this.nbLegs = nbLegs;
    }

    public int getNbLegs(){
        return nbLegs;
    }
}
