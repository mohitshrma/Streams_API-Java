package lectures;

import beans.Car;
import beans.Person;
import beans.PersonDTO;
import mockdata.MockData;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;

public class Lecture5 {

    @Test
    public void understandingFilter() throws Exception
    {
        List<Car> cars = MockData.getCars();
        Predicate<Car> carPredicate = car -> car.getPrice() < 20000;
        List<Car> carFiltered = cars.stream()
                .filter(carPredicate)
                .collect(Collectors.toList());
        carFiltered.forEach(System.out::println);
        System.out.println(carFiltered.size());


    }

    @Test
    public void ourFirstMapping() throws Exception
    {
        //transform from one datatype to another
        List<Person> people = MockData.getPeople();
        List<PersonDTO> personDtoList = people.stream()
                .map(PersonDTO::map)
                .collect(Collectors.toList());

        personDtoList.forEach(System.out::println);
        System.out.println(personDtoList.size());

    }

    @Test
    public void averageCarPrice() throws Exception {
        double average = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0.0);
        System.out.println(average);
    }

        @Test
        public void test() throws Exception
        {
            MockData.getCars().forEach(System.out::println);
        }

    }
