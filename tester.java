public class tester {
    public static void main(String[] args) throws GenerationException {
        // largest possible level generation
        StructureInsertion si = new StructureInsertion(LevelGeneration.insertRows(4),
                StructureAddition.populateStations(3, 36, 13, 7, 2, 16));
        si.insert();
        System.out.println(si.toString());

        // smallest possible level generation
        StructureInsertion si2 = new StructureInsertion(LevelGeneration.insertRows(0),
                StructureAddition.populateStations(1, 2, 0, 1, 1, 2));
        si2.insert();
        System.out.println(si2.toString());

        // invalid level generated (too small)
        StructureInsertion si3 = new StructureInsertion(LevelGeneration.insertRows(-1),
                StructureAddition.populateStations(1, 3, 5, 7, 9, 11));
        si3.insert();
        System.out.println(si3.toString());

        // invalid level generated (too big)
        StructureInsertion si4 = new StructureInsertion(LevelGeneration.insertRows(6),
                StructureAddition.populateStations(1, 3, 5, 7, 9, 11));
        si4.insert();
        System.out.println(si4.toString());

        // non-matching level spots and structure counts
        StructureInsertion si5 = new StructureInsertion(LevelGeneration.insertRows(3),
                StructureAddition.populateStations(5, 11, 4, 1, 4, 20));
        si5.insert();
        System.out.println(si5.toString());
    }
}