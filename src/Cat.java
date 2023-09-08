public class Cat {
    private String name;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() > 0) {
            while(this.getAppetite() > 0) {
                if (plate.getFood() > 0) {
                    plate.decreaseFood(1);
                    this.appetite--;
                } else {
                    System.out.println("No food!");
                    break;
                }
            }
        } else{
            System.out.println("No food!");
        }
    }
}