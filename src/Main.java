public class Main {
    public static void main(String[] args) {
        // Стоимость билета
        int ticketPrice = 13676;

        // Количество рублей, необходимых для начисления одной мили
        int rublesPerMile = 20;

        // Расчёт количества бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Вывод результата на экран
        System.out.println("Количество начисленных бонусных миль: " + bonusMiles);
    }
}
