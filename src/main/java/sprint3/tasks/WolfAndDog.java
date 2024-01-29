package sprint3.tasks;

public class WolfAndDog {
    public static void main(String[] args) {
        Wolf dog = new Dog();
        dog.behaviorIfMeetHuman();
    }
}

class Wolf {
    public static void behaviorIfMeetHuman() {
        System.out.println("Грозно рычать");
    }
}

class Dog extends Wolf {
    public static void behaviorIfMeetHuman() {
        System.out.println("Радостно вилять хвостом");
    }
}
