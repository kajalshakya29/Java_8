package streams.avg.Example5.TemperatureReadings;
import java.util.*;

class AvgExample5 {
    public static void main(String[] args) {
        List<Double> temps = Arrays.asList(33.5, 34.0, 32.8, 35.2);
        double avgTemp = temps.stream().mapToDouble(t -> t).average().getAsDouble();
        System.out.println(avgTemp);
    }
}
