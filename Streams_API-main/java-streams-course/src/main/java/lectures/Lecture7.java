package lectures;

import beans.Car;
import mockdata.MockData;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Lecture7 {

    @Test
    public void count() throws Exception{
        long Count = MockData.getPeople()
                .stream()
                .filter(person -> person.getGender().equalsIgnoreCase("female"))
                .count();
        System.out.println(Count);
    }

    @Test
    public void min() throws Exception
    {
        double minimum = MockData.getCars()
                .stream()
                .filter(c -> c.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(0.0);
        System.out.println(minimum);
    }

    @Test
    public void max() throws Exception
    {
        double maximum = MockData.getCars()
                .stream()
                .filter(c -> c.getColor().equalsIgnoreCase("red"))
                .mapToDouble(Car::getPrice)
                .max()
                .getAsDouble();
        System.out.println(maximum);
    }

    @Test
    public void average() throws Exception
    {
        double average = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0.0);

        System.out.println(average);
    }


    @Test
    public void sum() throws Exception
    {
        double sumOfPrice = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .sum();
        BigDecimal bigDecimalSum = BigDecimal.valueOf(sumOfPrice);
        System.out.println(sumOfPrice);
        System.out.println(bigDecimalSum);
    }

    @Test
    public void statistics() throws Exception
    {
        List<Car> cars = MockData.getCars();
        DoubleSummaryStatistics statistics = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();
        System.out.println(statistics);
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getSum());
    }

}
