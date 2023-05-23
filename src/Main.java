public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int firstSum = 400;
        int secondBalance = balance + firstSum;
        if (firstSum > 1000) {
            int firstBonus = firstSum / 100;
            System.out.println(firstBonus);
            System.out.println(secondBalance + firstBonus);
        } else {
            int secondSum = 1200;
            int finishBalance = balance + firstSum + secondSum;
            if (secondSum > 1000) {
                int secondBonus = secondSum / 100;
                System.out.println(secondBonus);
                System.out.println(finishBalance + secondBonus);
            }
        }
    }
}

