public class structureInsertion {
    private int[][] generatedUtopia;
    private int expansionLevel = 4;

    public int[][] insertRows(int level) {
        switch (level) {
            case 0:
                generatedUtopia = new int[5][];
                break;
            case 1:
                generatedUtopia = new int[7][];
                break;
            case 2:
                generatedUtopia = new int[9][];
                break;
            case 3:
                generatedUtopia = new int[13][];
                break;
            case 4:
                generatedUtopia = new int[17][];
                break;
            default:
                generatedUtopia = new int[5][];
                break;
        }
        return generatedUtopia;

    }
    // 0 has 7 spaces
    // 1 has
    // 2 has
    // 3 has
    // 4 has
    //
}