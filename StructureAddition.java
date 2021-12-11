import java.util.ArrayList;

public class StructureAddition {

    public static ArrayList<ArrayList<Integer>> populateStations(int a, int b1, int b2, int b3, int b4, int b5, int b6,
            int b7, int b8, int b9, int b10, int b11, int b12, int c, int d, int e, int f) {
        ArrayList<Integer> cookStations = new ArrayList<>(a);
        ArrayList<Integer> carrotStations = new ArrayList<>(b1);
        ArrayList<Integer> cabbageStations = new ArrayList<>(b2);
        ArrayList<Integer> cornStations = new ArrayList<>(b3);
        ArrayList<Integer> acornStations = new ArrayList<>(b4);
        ArrayList<Integer> broccoliStations = new ArrayList<>(b5);
        ArrayList<Integer> lemonStations = new ArrayList<>(b6);
        ArrayList<Integer> honeyStations = new ArrayList<>(b7);
        ArrayList<Integer> wheatStations = new ArrayList<>(b8);
        ArrayList<Integer> radishStations = new ArrayList<>(b9);
        ArrayList<Integer> pumpkinStations = new ArrayList<>(b10);
        ArrayList<Integer> mushroomStations = new ArrayList<>(b11);
        ArrayList<Integer> celeryStations = new ArrayList<>(b12);
        ArrayList<Integer> restStations = new ArrayList<>(c);
        ArrayList<Integer> functionStations = new ArrayList<>(d);
        ArrayList<Integer> specialStations = new ArrayList<>(e);
        ArrayList<Integer> emptySpots = new ArrayList<>(f);

        for (int i = 0; i < a; i++) {
            cookStations.add(100);
        }
        for (int i = 0; i < b1; i++) {
            carrotStations.add(201);
        }
        for (int i = 0; i < b2; i++) {
            cabbageStations.add(202);
        }
        for (int i = 0; i < b3; i++) {
            cornStations.add(203);
        }
        for (int i = 0; i < b4; i++) {
            acornStations.add(204);
        }
        for (int i = 0; i < b5; i++) {
            broccoliStations.add(205);
        }
        for (int i = 0; i < b6; i++) {
            lemonStations.add(206);
        }
        for (int i = 0; i < b7; i++) {
            honeyStations.add(207);
        }
        for (int i = 0; i < b8; i++) {
            wheatStations.add(208);
        }
        for (int i = 0; i < b9; i++) {
            radishStations.add(209);
        }
        for (int i = 0; i < b10; i++) {
            pumpkinStations.add(210);
        }
        for (int i = 0; i < b11; i++) {
            mushroomStations.add(211);
        }
        for (int i = 0; i < b12; i++) {
            celeryStations.add(212);
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

        ArrayList<ArrayList<Integer>> stationList = new ArrayList<>(17);

        stationList.add(cookStations);
        stationList.add(emptySpots);
        stationList.add(restStations);
        stationList.add(functionStations);
        stationList.add(specialStations);
        stationList.add(carrotStations);
        stationList.add(cabbageStations);
        stationList.add(cornStations);
        stationList.add(acornStations);
        stationList.add(broccoliStations);
        stationList.add(lemonStations);
        stationList.add(honeyStations);
        stationList.add(wheatStations);
        stationList.add(radishStations);
        stationList.add(pumpkinStations);
        stationList.add(mushroomStations);
        stationList.add(celeryStations);

        return stationList;
    }
}