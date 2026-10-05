import java.util.*;

class UndergroundSystem {

    HashMap<Integer, Pair> checkInMap;
    HashMap<String, double[]> routeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new Pair(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        Pair p = checkInMap.get(id);

        String start = p.station;
        int startTime = p.time;

        int travelTime = t - startTime;

        String route = start + "->" + stationName;

        if (!routeMap.containsKey(route)) {
            routeMap.put(route, new double[]{0, 0});
        }

        double[] data = routeMap.get(route);

        data[0] += travelTime;
        data[1] += 1;

        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "->" + endStation;

        double[] data = routeMap.get(route);

        return data[0] / data[1];
    }

    class Pair {
        String station;
        int time;

        Pair(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
}


OUTPUT
Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]
Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
