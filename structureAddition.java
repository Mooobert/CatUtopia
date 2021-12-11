import java.util.ArrayList;

public class StructureAddition {

    public static ArrayList<ArrayList<Integer>> populateStations(int a, int b, int c, int d, int e, int f) {
        ArrayList<Integer> cookStations = new ArrayList<>(a);
        ArrayList<Integer> foodPrepStations = new ArrayList<>(b);
        ArrayList<Integer> restStations = new ArrayList<>(c);
        ArrayList<Integer> functionStations = new ArrayList<>(d);
        ArrayList<Integer> specialStations = new ArrayList<>(e);
        ArrayList<Integer> emptySpots = new ArrayList<>(f);

        for (int i = 0; i < a; i++) {
            cookStations.add(100);
        }
        for (int i = 0; i < b; i++) {
            foodPrepStations.add(200);
        }
        for (int i = 0; i < c; i++) {
            restStations.add(300);
        }
        for (int i = 0; i < d; i++) {
            functionStations.add(400);
        }
        for (int i = 0; i < e; i++) {
            specialStations.add(500);
        }
        for (int i = 0; i < f; i++) {
            emptySpots.add(-1);
        }

        ArrayList<ArrayList<Integer>> stationList = new ArrayList<>(6);

        stationList.add(cookStations);
        stationList.add(foodPrepStations);
        stationList.add(restStations);
        stationList.add(functionStations);
        stationList.add(specialStations);
        stationList.add(emptySpots);

        return stationList;
    }
}