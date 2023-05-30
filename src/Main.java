public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int summa = 400;
        int secondBalance = balance + summa;
        if (summa > 1000) {
            int Bonus = summa / 100;
            System.out.println(Bonus);
            System.out.println(secondBalance + Bonus);

        } else {
            System.out.println(secondBalance);
            System.out.println("Бонусов нет");
        }
    }
}

