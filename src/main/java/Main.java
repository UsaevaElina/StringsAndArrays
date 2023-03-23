import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService stat = new StatsService();
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        //i      = 0 1 2 3 4
        //arr[i] = 1 2 3 4 5
        int sum = stat.SumSales(arr);
        System.out.println("Сумма = " + sum);

        int average = stat.averageAmount(arr);
        System.out.println("Среднее = " + average);

        int maxMonth = stat.maxSales(arr);
        System.out.println("Максимальный месяц = " + maxMonth);

        int count = stat.countMonthMin(arr);



    }
}
