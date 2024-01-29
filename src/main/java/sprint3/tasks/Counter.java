package sprint3.tasks;

public class Counter {
    int nonStaticVar = 0;
    static int staticVar = 0;

    public void addTen(){
        nonStaticVar +=10;
        staticVar +=10;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.addTen();

        Counter counter2 = new Counter();

        System.out.println(staticVar);
        System.out.println();
    }
}
