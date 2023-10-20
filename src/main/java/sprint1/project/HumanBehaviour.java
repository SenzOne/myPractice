package sprint1.project;

public interface HumanBehaviour {

    void setMakeOrder(boolean marketOrder);
    void setTakeOrder(boolean marketOrder);

    boolean isMakeOrder(); // сделать заказ
    boolean isTakeOrder(); // получить заказ

}
