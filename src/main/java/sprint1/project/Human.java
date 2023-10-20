package sprint1.project;

public class Human implements HumanBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected Product product;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void setMakeOrder(boolean marketOrder) {

    }

    @Override
    public void setTakeOrder(boolean marketOrder) {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
