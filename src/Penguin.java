public non-sealed class Penguin extends Aquatic{

    private float swimmingDepth;

    public Penguin(){

    }

    @Override
    public void swim() {

    }

    public Penguin(String family, String name, int age, boolean isMammal,String habitat, float swimmingDepth){
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }
}
