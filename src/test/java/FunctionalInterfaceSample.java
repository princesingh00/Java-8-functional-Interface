import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceSample {

    @Test
    public void printCities() {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Goa");
        cities.add("Pune");

        Consumer<String> printConsumer = System.out::println;
        cities.forEach(printConsumer);
    }

    @Test
    public void filterCities() {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Goa");
        cities.add("Pune");

        Predicate<String> filterCity = city -> city.equals("Mumbai");
        cities.stream().filter(filterCity).forEach(System.out::println);
    }

    @Test
    public void mapCities() {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Goa");
        cities.add("Pune");

        Function<String, Character> getFirstCharFunction = city -> city.charAt(0);
        cities.stream().map(getFirstCharFunction)
                .forEach(System.out::println);
    }

    @Test
    public void supplyCities() {
        Supplier<String[]> citySupplier = () -> new String[]{"Mumbai", "Delhi", "Goa", "Pune"};
        Arrays.asList(citySupplier.get()).forEach(System.out::println);
    }
}
