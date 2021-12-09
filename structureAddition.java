import java.util.ArrayList;

public class structureAddition {
    private ArrayList<ArrayList<Integer>> stationList;
    private ArrayList<Integer> cookStations;
    private ArrayList<Integer> foodPrepStations;
    private ArrayList<Integer> restStations;
    private ArrayList<Integer> functionStations;
    private ArrayList<Integer> specialStations;
    private ArrayList<Integer> emptySpots;

    public structureAddition(){
        stationList = new ArrayList<ArrayList<Integer>>(6);
    }

    public structureAddition(ArrayList<ArrayList<Integer>> stationList){
        this.stationList = stationList;
    }

    public ArrayList<ArrayList<Integer>> populateStations(int a, int b, int c, int d, int e, int f){
        cookStations = new ArrayList<Integer>(a);
        foodPrepStations = new ArrayList<Integer>(b);
        restStations = new ArrayList<Integer>(c);
        functionStations = new ArrayList<Integer>(d);
        specialStations = new ArrayList<Integer>(e);
        emptySpots = new ArrayList<Integer>(f);

        for(int i = 0; i < a; i++){
            cookStations.add(100);
        }
        for(int i = 0; i < b; i++){
            foodPrepStations.add(200);
        }
        for(int i = 0; i < c; i++){
            restStations.add(300);
        }
        for(int i = 0; i < d; i++){
            functionStations.add(400);
        }
        for(int i = 0; i < e; i++){
            specialStations.add(500);
        }
        for(int i = 0; i < f; i++){
            emptySpots.add(0);
        }
        stationList.add(cookStations);
        stationList.add(foodPrepStations);
        stationList.add(restStations);
        stationList.add(functionStations);
        stationList.add(specialStations);
        stationList.add(emptySpots);

        return stationList;
    }

    @Override
    public String toString(){
        String finalStr = "";
        for(int i = 0; i < stationList.size(); i++){
            finalStr += "< ";
            for(int j = 0; j < stationList.get(i).size(); j++){
                finalStr += stationList.get(i).get(j) + " ";
            }
            finalStr += ">\n";
        }
        return finalStr;
    }
}
