package zoo;

public class Horse extends Animal {

    public Horse (String name, String color, int age, int lengthRun, int lengthSwim, double heightJump) {
        super(name, color, age, lengthRun, lengthSwim, heightJump);
    }

    @Override
    public void moveRun(int lengthRun) {
        System.out.println("Лошадка " + name + " пробежала!");
    }

    public final void moveSwim(int lengthSwim) {
        System.out.println("Лошадка " + name + " проплыла!");
    }

    @Override
    public void moveJump(double heightJump) {
        System.out.println("Лошадка " + name + " прыгнула!");
    }


}
