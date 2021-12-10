import java.lang.reflect.Array;

public class tester {
    public static void main(String[] args){
        structureAddition sa = new structureAddition();
        sa.populateStations(3,4,5,4,3,2);        
        System.out.println(sa.toString());

        structureInsertion si = new structureInsertion();
        si.insertRows(4);
        System.out.println(si.toString());
    }
}