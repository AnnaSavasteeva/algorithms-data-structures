package hw_anna.lesson7;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private final static String MOSCOW = "Москва";
    private final static String VORONEZH = "Воронеж";

    public static void main(String[] args) {
        Map<Node, Node[]> cities = new LinkedHashMap<>(10);
        fillCollectionWithCities(cities);

        Node[] moscowNeighbors = getMoscowNeighbors(cities);
        if (moscowNeighbors != null) {
            for (Node curCity : moscowNeighbors) {
                StringBuilder wayToVoronezh = new StringBuilder();
                wayToVoronezh.append(MOSCOW + " -> ");
                getWayToVoronezh(curCity, cities, wayToVoronezh);
            }
        }
    }

    private static void getWayToVoronezh(Node curCity, Map<Node, Node[]> cities, StringBuilder wayToVoronezh) {
        if (curCity.isVisited()) return;

        String cityName = curCity.getNodeName();
        wayToVoronezh.append(cityName);

        if (cityName.equals(VORONEZH)) {
            System.out.println(wayToVoronezh);
            wayToVoronezh.setLength(0);
            return;
        }

        wayToVoronezh.append(" -> ");
        curCity.setVisited(true);

        if (cities.containsKey(curCity)) {
            Node[] citiesArr = cities.get(curCity);
            if (citiesArr != null) {
                for (Node city : citiesArr) {
                    getWayToVoronezh(city, cities, wayToVoronezh);
                }
            }
        }
    }

    private static Node[] getMoscowNeighbors(Map<Node, Node[]> cities) {
        for (Node keyCity : cities.keySet()) {
            if(keyCity.getNodeName().equals(MOSCOW)) {
                return cities.get(keyCity);
            }
        }
        return null;
    }

    private static void fillCollectionWithCities(Map<Node, Node[]> cities) {
        Node moscow = new Node(MOSCOW);
        Node toula = new Node("Тула");
        Node razian = new Node("Рязань");
        Node kalouga = new Node("Калуга");
        Node lipetsk = new Node("Липецк");
        Node voronezh = new Node(VORONEZH);
        Node tambov = new Node("Тамбов");
        Node saratov = new Node("Саратов");
        Node orel = new Node("Орел");
        Node kursk = new Node("Курск");

        cities.put(moscow, new Node[]{toula, razian, kalouga});
        cities.put(toula, new Node[]{lipetsk});
        cities.put(lipetsk, new Node[]{voronezh});
        cities.put(voronezh, null);
        cities.put(razian, new Node[]{tambov});
        cities.put(tambov, new Node[]{saratov});
        cities.put(saratov, new Node[]{voronezh});
        cities.put(kalouga, new Node[]{orel});
        cities.put(orel, new Node[]{kursk});
        cities.put(kursk, new Node[]{voronezh});
    }
}
