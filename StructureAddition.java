import java.util.ArrayList;

public class StructureAddition {

    public static ArrayList<ArrayList<String>> populateStations(int a, int b1, int b2, int b3, int b4, int b5, int b6,
            int b7, int b8, int b9, int b10, int b11, int b12, int c, int d, int e, int f) {
        ArrayList<String> cookStations = new ArrayList<>(a);
        ArrayList<String> carrotStations = new ArrayList<>(b1);
        ArrayList<String> cabbageStations = new ArrayList<>(b2);
        ArrayList<String> cornStations = new ArrayList<>(b3);
        ArrayList<String> acornStations = new ArrayList<>(b4);
        ArrayList<String> broccoliStations = new ArrayList<>(b5);
        ArrayList<String> lemonStations = new ArrayList<>(b6);
        ArrayList<String> honeyStations = new ArrayList<>(b7);
        ArrayList<String> wheatStations = new ArrayList<>(b8);
        ArrayList<String> radishStations = new ArrayList<>(b9);
        ArrayList<String> pumpkinStations = new ArrayList<>(b10);
        ArrayList<String> mushroomStations = new ArrayList<>(b11);
        ArrayList<String> celeryStations = new ArrayList<>(b12);
        ArrayList<String> restStations = new ArrayList<>(c);
        ArrayList<String> functionStations = new ArrayList<>(d);
        ArrayList<String> specialStations = new ArrayList<>(e);
        ArrayList<String> emptySpots = new ArrayList<>(f);

        for (int i = 0; i < a; i++) {
            cookStations.add("cooking");
        }
        for (int i = 0; i < b1; i++) {
            carrotStations.add("carrot");
        }
        for (int i = 0; i < b2; i++) {
            cabbageStations.add("cabbage");
        }
        for (int i = 0; i < b3; i++) {
            cornStations.add("corn");
        }
        for (int i = 0; i < b4; i++) {
            acornStations.add("acorn");
        }
        for (int i = 0; i < b5; i++) {
            broccoliStations.add("broccoli");
        }
        for (int i = 0; i < b6; i++) {
            lemonStations.add("lemon");
        }
        for (int i = 0; i < b7; i++) {
            honeyStations.add("honey");
        }
        for (int i = 0; i < b8; i++) {
            wheatStations.add("wheat");
        }
        for (int i = 0; i < b9; i++) {
            radishStations.add("radish");
        }
        for (int i = 0; i < b10; i++) {
            pumpkinStations.add("pumpkin");
        }
        for (int i = 0; i < b11; i++) {
            mushroomStations.add("mushrooms");
        }
        for (int i = 0; i < b12; i++) {
            celeryStations.add("celery");
        }
        for (int i = 0; i < c; i++) {
            restStations.add("rest");
        }
        for (int i = 0; i < d; i++) {
            functionStations.add("function");
        }
        for (int i = 0; i < e; i++) {
            specialStations.add("special");
        }
        for (int i = 0; i < f; i++) {
            emptySpots.add("[empty]");
        }

        ArrayList<ArrayList<String>> stationList = new ArrayList<>(17);

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