public class Main {
    public static void main(String[] args) {


        int ticket_value = 2500; /* цена билета */
        int one_mile = 20; /* стоимость одной мили */
        int bonus = (ticket_value / one_mile); /* расчёт суммы бонусных миль в зависимости от стоимости билета */

        System.out.println("Цена билета (руб.):");
        System.out.println(ticket_value);
        System.out.println("Количество бонусных миль:");
        System.out.println(bonus);

    }
}
