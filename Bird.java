package zoo;

public class Bird extends Animal {

    public Bird (String name, String color, int age, int lengthRun, double heightJump) {
        super(name, color, age, lengthRun, heightJump);
    }

    @Override
    public void moveRun(int lengthRun) {
        System.out.println("Птичка " + name + " пробежала!");
    }

    @Override
    public void moveJump(double heightJump) {
        System.out.println("Птичка " + name + " прыгнула!");
    }
}
