package hw_anna.lesson7;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private final static String MOSCOW = "Москва";
    private final static String VORONEZH = "Воронеж";

    private static Node moscow;
    private static Node toula;
    private static Node razian;
    private static Node kalouga;
    private static Node lipetsk;
    private static Node voronezh;
    private static Node tambov;
    private static Node saratov;
    private static Node orel;
    private static Node kursk;


    public static void main(String[] args) {
        Map<Node, List<Node.Neighbour>> cities = new LinkedHashMap<>(10);
        makeGraph(cities);

        List<Node.Neighbour> moscowNeighbors = getMoscowNeighbors(cities);
        if (moscowNeighbors != null) {
            for (Node.Neighbour currentCity : moscowNeighbors) {
                StringBuilder wayToVoronezh = new StringBuilder();
                wayToVoronezh.append(MOSCOW + " -> ");
                getWayToVoronezh(currentCity.getNeighbour(), cities, wayToVoronezh);
            }
        }
    }

    private static void getWayToVoronezh(Node currentCity, Map<Node, List<Node.Neighbour>> cities, StringBuilder wayToVoronezh) {
        if (currentCity.isVisited()) return;

        String cityName = currentCity.getNodeName();
        wayToVoronezh.append(cityName);

        if (cityName.equals(VORONEZH)) {
            System.out.println(wayToVoronezh);
            wayToVoronezh.setLength(0);
            return;
        }

        wayToVoronezh.append(" -> ");
        currentCity.setVisited(true);

        if (cities.containsKey(currentCity)) {
            List<Node.Neighbour> cityNeighbours = cities.get(currentCity);
            if (cityNeighbours != null) {
                for (Node.Neighbour neighbour : cityNeighbours) {
                    getWayToVoronezh(neighbour.getNeighbour(), cities, wayToVoronezh);
                }
            }
        }
    }

    private static List<Node.Neighbour> getMoscowNeighbors(Map<Node, List<Node.Neighbour>> cities) {
        for (Node keyCity : cities.keySet()) {
            if(keyCity.getNodeName().equals(MOSCOW)) {
                return cities.get(keyCity);
            }
        }
        return null;
    }

    private static void makeGraph(Map<Node, List<Node.Neighbour>> cities) {
        createCities();
        addNeighbours();
        cities.put(moscow, moscow.getNeighbours());
        cities.put(toula, toula.getNeighbours());
        cities.put(lipetsk, lipetsk.getNeighbours());
        cities.put(voronezh, null);
        cities.put(razian, razian.getNeighbours());
        cities.put(tambov, tambov.getNeighbours());
        cities.put(saratov, saratov.getNeighbours());
        cities.put(kalouga, kalouga.getNeighbours());
        cities.put(orel, orel.getNeighbours());
        cities.put(kursk, kursk.getNeighbours());
    }

    private static void addNeighbours() {
        moscow.setNeighbour(toula, 111);
        moscow.setNeighbour(razian, 222);
        moscow.setNeighbour(kalouga, 333);
        toula.setNeighbour(lipetsk, 444);
        lipetsk.setNeighbour(voronezh, 555);
        razian.setNeighbour(tambov, 666);
        tambov.setNeighbour(saratov, 777);
        saratov.setNeighbour(voronezh, 888);
        kalouga.setNeighbour(orel, 999);
        orel.setNeighbour(kursk, 123);
        kursk.setNeighbour(voronezh, 321);
    }

    private static void createCities() {
        moscow = new Node(MOSCOW);
        toula = new Node("Тула");
        razian = new Node("Рязань");
        kalouga = new Node("Калуга");
        lipetsk = new Node("Липецк");
        voronezh = new Node(VORONEZH);
        tambov = new Node("Тамбов");
        saratov = new Node("Саратов");
        orel = new Node("Орел");
        kursk = new Node("Курск");
    }
}
