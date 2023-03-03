package L35AnonymousClasses;

public class AnonymousClasses {
  public static void main(String[] args) {
    AbleToEat ableToEat = new AbleToEat() {
      @Override
      public void eat() {
        System.out.println("eating");
      }
    };
    ableToEat.eat();
  }
}

interface AbleToEat {
  public void eat();
}
