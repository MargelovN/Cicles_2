import org.junit.jupiter.api.Test;
import ru.netology.sales.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(quantity);
        assertEquals(expected, actual);
        System.out.println("Cумма продаж: " + actual);
    }

    @Test
    void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverage(quantity);
        assertEquals(expected, actual);
        System.out.println("Cредняя сумма продаж: " + actual);
    }

    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(quantity);
        assertEquals(expected, actual);
        System.out.println("Месяц пиковых продаж: " + actual);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(quantity);
        assertEquals(expected, actual);
        System.out.println("Месяц минимальных продаж " + actual);
    }

    @Test
    void shouldFindBelowAverageSales() {
        StatsService service = new StatsService();
        int[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(quantity);
        assertEquals(expected, actual);
        System.out.println("Количество месяцев с продажами ниже среднего " + actual);
    }

    @Test
    void shouldFindAboveverageSales() {
        StatsService service = new StatsService();
        int[] quantity = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(quantity);
        assertEquals(expected, actual);
        System.out.println("Количество месяцев с продажами выше среднего " + actual);
    }
}