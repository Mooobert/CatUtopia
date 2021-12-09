import java.lang.reflect.Array;

public class tester {
    public static void main(String[] args){
        structureAddition si = new structureAddition();
        si.populateStations(3,4,5,4,3,2);        
        System.out.println(si.toString());
    }
}