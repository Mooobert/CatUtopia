import java.lang.reflect.Array;

public class tester {
    public static void main(String[] args){
        structureInsertion si = new structureInsertion();
        si.populateStations(3,4,5,4,3,2);
        
        System.out.println(si.toString());
    }
}