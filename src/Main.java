public class Main {
    public static void main(String[] args) {


        int ticketValue = 2500; /* цена билета */
        int oneMile = 20; /* стоимость одной мили */
        int bonus = (ticketValue / oneMile); /* расчёт суммы бонусных миль в зависимости от стоимости билета */

        System.out.println("Цена билета (руб.):");
        System.out.println(ticketValue);
        System.out.println("Количество бонусных миль:");
        System.out.println(bonus);

    }
}
