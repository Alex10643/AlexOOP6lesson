public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 50);
        Plate plate = new Plate(60);
        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println(cat.getAppetite());
    }
}
