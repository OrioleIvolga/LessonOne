package zoo;

public class Dog extends Animal {

    public Dog (String name, String color, int age, int lengthRun, int lengthSwim, double heightJump) {
        super(name, color, age, lengthRun, lengthSwim, heightJump);
    }

    @Override
    public void moveRun(int lengthRun) {
        System.out.println("Собачка " + name + " пробежала!");
    }

    public final void moveSwim(int lengthSwim) {
        System.out.println("Собачка " + name + " проплыла!");
    }

    @Override
    public void moveJump(double heightJump) {
        System.out.println("Собачка " + name + " прыгнула!");
    }

}
