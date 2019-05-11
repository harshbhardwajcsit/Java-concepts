public class Bikes extends Vechiles {

    int a = 4;

    public void op(){
        super.op();
        System.out.println("i am child");
    }

    public static void main(String[] args) {
        Bikes b = new Bikes();
        b.op();
    }
}
