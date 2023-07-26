public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int award = 100;
        int replenishment = 1300;
        int bonus;

        if (replenishment >= 1000) {
            bonus = replenishment / award;
        } else {
            bonus = 0;
        }

        int finalbalance = balance + replenishment + bonus;

        System.out.println("Бонус " + bonus + " руб.");
        System.out.println("Баланс " + finalbalance + " руб.");
    }
}
