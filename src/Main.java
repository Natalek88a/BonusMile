public class Main {
    public static void main(String[] args) {
        int amount = 1000; // стоимость билета
        int bonusMili = 20 ; // стоимость бонусной мили
        int bonus = 1; // бонусная миля

        int result = amount / bonusMili;

        int miles;
        if (amount < 0) {
            System.out.println("Стоимость билета не может быть отрицательной!"); // проверка неверных входных данных
        } else {
            miles = amount / bonusMili; // подсчет кол-ва миль
            System.out.println("Бонусные мили: " + miles); // вывод результата
        }
    }

}
