package metodologie;

import java.util.List;

class Inverter<T> implements Invert<T> {
    @Override
    public List<T> invert(List<T> list) {
        return list;
    }
}

class Maximizer<T extends Comparable<T>> implements Max<T> {
    @Override
    public T max(List<T> list) {
        return null;
    }
}

public class App {
    public static void main(String[] args) {
    }

    public static <T> Invert<T> inverter() {
        return new Inverter<T>();
    }

    public static <T extends Comparable<T>> Max<T> maximizer() {
        return new Maximizer<T>();
    }
}
