package zoo;

    public abstract class Animal extends Object {
        String name;
        String color;
        int age;
        int lengthRun;
        int lengthSwim;
        double heightJump;

        public Animal(String name, String color, int age, int lengthRun, int lengthSwim, double heightJump) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.lengthRun = lengthRun;
            this.lengthSwim = lengthSwim;
            this.heightJump = heightJump;
        }

        public Animal(String name, String color, int age, int lengthRun, double heightJump) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.lengthRun = lengthRun;
            this.heightJump = heightJump;
        }

        public abstract void moveRun(int lengthRun);

        public abstract void moveJump(double heightJump);

        public int getLengthRun() {
            return lengthRun;
        }

        public int getLengthSwim() {
            return lengthSwim;
        }

        public double getHeightJump() {
            return heightJump;
        }
}
