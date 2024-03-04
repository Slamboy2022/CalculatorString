

public class Main {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Thread thread = new Thread(calc);
        thread.start();
    }


}