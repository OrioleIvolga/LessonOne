package zoo;

public class Cat extends Animal {

    public Cat (String name, String color, int age, int lengthRun, double heightJump) {
        super(name, color, age, lengthRun, heightJump);
    }

    @Override
    public void moveRun(int lengthRun) {
        System.out.println("Котик " + name + " пробежал!");
    }

    @Override
    public void moveJump(double heightJump) {
        System.out.println("Котик " + name + " прыгнул!");
    }
}
