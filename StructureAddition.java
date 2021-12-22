import java.util.ArrayList;

public class StructureAddition {
    public static ArrayList<String> populateStationsOfType(String type, int count) {
        ArrayList<String> stations = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            stations.add(type);
        }
        return stations;
    }

    public static ArrayList<ArrayList<String>> populateAllStations(int cookCount, int carrotCount, int cabbageCount, int cornCount, int acornCount, int broccoliCount, int lemonCount,
            int honeyCount, int wheatCount, int radishCount, int pumpkinCount, int mushroomCount, int celeryCount, int restCount, int functionCount, int specialCount, int emptyCount) {

        ArrayList<ArrayList<String>> stationList = new ArrayList<>(17);

        stationList.add(populateStationsOfType("cooking", cookCount));
        stationList.add(populateStationsOfType("carrot", carrotCount));
        stationList.add(populateStationsOfType("cabbage", cabbageCount));
        stationList.add(populateStationsOfType("corn", cornCount));
        stationList.add(populateStationsOfType("acorn", acornCount));
        stationList.add(populateStationsOfType("broccoli", broccoliCount));
        stationList.add(populateStationsOfType("lemon", lemonCount));
        stationList.add(populateStationsOfType("honey", honeyCount));
        stationList.add(populateStationsOfType("wheat", wheatCount));
        stationList.add(populateStationsOfType("radish", radishCount));
        stationList.add(populateStationsOfType("pumpkin", pumpkinCount));
        stationList.add(populateStationsOfType("mushroom", mushroomCount));
        stationList.add(populateStationsOfType("celery", celeryCount));
        stationList.add(populateStationsOfType("rest", restCount));
        stationList.add(populateStationsOfType("function", functionCount));
        stationList.add(populateStationsOfType("special", specialCount));
        stationList.add(populateStationsOfType("(empty)", emptyCount));

        return stationList;
    }
}