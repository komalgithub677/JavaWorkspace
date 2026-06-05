package practice;

public class Demo implements Interface1 {

    @Override
    public void add() {
        System.out.println("Addition Method");
    }

    public static void main(String[] args) {

        Demo d = new Demo();
        d.add();
    }
}