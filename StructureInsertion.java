import java.util.ArrayList;
import java.util.Random;

public class StructureInsertion {

    private String[][] utopiaLayout;
    private ArrayList<ArrayList<String>> stationList;
    private Random r = new Random();

    public StructureInsertion(String[][] utopiaLayout, ArrayList<ArrayList<String>> stationList) {
        this.utopiaLayout = utopiaLayout;
        this.stationList = stationList;
    }

    public String[][] insert() throws GenerationException {
        int levelSpots = numLevelSpots(utopiaLayout);
        int stationSpots = numStationSpots(stationList);

        if (levelSpots != stationSpots) {
            throw new GenerationException();
        }

        for (int i = 0; i < utopiaLayout.length; i++) {
            for (int j = 0; j < utopiaLayout[i].length; j++) {
                int category = r.nextInt(17);
                while (stationList.get(category).isEmpty()) {
                    category = r.nextInt(17);
                }
                utopiaLayout[i][j] = stationList.get(category).remove(0);
            }
        }
        return utopiaLayout;
    }

    private int numLevelSpots(String[][] station2dArr) {
        int numLevelSpots = 0;
        for (int i = 0; i < station2dArr.length; i++) {
            for (int j = 0; j < station2dArr[i].length; j++) {
                numLevelSpots++;
            }
        }
        return numLevelSpots;
    }

    private int numStationSpots(ArrayList<ArrayList<String>> station2dArrList) {
        int numStationSpots = 0;
        for (int i = 0; i < station2dArrList.size(); i++) {
            for (int j = 0; j < station2dArrList.get(i).size(); j++) {
                numStationSpots++;
            }
        }
        return numStationSpots;
    }

    @Override
    public String toString() {
        String finalStr = "";
        for (int i = 0; i < utopiaLayout.length; i++) {
            finalStr += "[ ";
            for (int j = 0; j < utopiaLayout[i].length; j++) {
                finalStr += utopiaLayout[i][j] + " ";
            }
            finalStr += "]\n";
        }
        return finalStr;
    }
}