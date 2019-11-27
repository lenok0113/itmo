package com.ifmo.lesson2;

public class LuckyTickets {
    /*
    В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
    неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
    000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
    номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
    567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
    и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
    сколько счастливых билетов в одном рулоне?
     */
    public static void main(String[] args) {
        System.out.println(luckyTickets());
    }

    public static int luckyTickets() {
        // TODO implement
        int sum = 0;
        for (int i = 1; i <= 999999; i++)
            sum += isLucky(i);
        return sum;
    }

    public static int isLucky(int n) {
        int a = n % 1000;
        int b = n / 1000;
        int sum_a = 0;
        int sum_b = 0;
        for (int i = 0; i < 3; i++) {
            sum_a += a % 10;
            sum_b += b % 10;
            a /= 10;
            b /= 10;
        }
        if (sum_a == sum_b)
        return 1;
        return 0;
    }
}
