public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;
        int addedAmount = 1500;
        int bonus = 0;

        if (addedAmount >= 1000) {
            bonus = addedAmount / 100;
            currentBalance = addedAmount + bonus;
        } else {
            currentBalance = currentBalance + addedAmount;
        }
        System.out.println("Итоговый счет: " + currentBalance);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
