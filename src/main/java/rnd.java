public  class rnd {

    public static void main(String[] args) {
        Thief thief = new Thief(50);
        thief.processMail(100);
        thief.processMail(10);
        thief.processMail(100);
        System.out.println(thief.getStolenValue());
    }
}


class Thief {
    int minimumCostOfParcel;
    int stolenValue;

    public Thief(int minimumCostOfParcel) {
        this.minimumCostOfParcel = minimumCostOfParcel;
    }

    public int getStolenValue() {
        return stolenValue;
    }


    public void processMail(int price) {

        if (price >= minimumCostOfParcel) {
           stolenValue += price;
        }
    }
}

