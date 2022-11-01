package oops;


    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Fox extends Animal {
        public void foxSound() {
            super.animalSound();
            System.out.println("The fox method");
        }
    }
public class SuperKeyword {

    public static void main(String[] args) {
        Fox obj = new Fox();
        obj.foxSound();

    }
}
