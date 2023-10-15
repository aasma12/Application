public abstract sealed class Aquatic extends Animal permits Dolphin,Penguin{


    protected String habitat;


    public Aquatic(){
        super();
}
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){

        super(family,name,age,isMammal);
        this.habitat = habitat;
    }
    protected void manger(){
        ///
    }

    public String toString(){
        return super.toString()+" ,Habitat:"+habitat;
    }


    public abstract void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
