public class LevelGeneration {
    private static String[][] generatedUtopia;

    public static String[][] insertRows(int level) throws GenerationException {
        if (level < 0) {
            throw new GenerationException(1);
        }
        switch (level) {
            case 0:
                generatedUtopia = new String[5][];
                for (int i = 0; i < generatedUtopia.length; i++) {
                    generatedUtopia[i] = i % 2 == 0 ? new String[1] : new String[2];
                }
                break;
            case 1:
                generatedUtopia = new String[7][];
                for (int i = 0; i < generatedUtopia.length; i++) {
                    generatedUtopia[i] = i % 2 == 0 ? new String[2] : new String[3];
                }
                break;
            case 2:
                generatedUtopia = new String[9][];
                for (int i = 0; i < generatedUtopia.length; i++) {
                    generatedUtopia[i] = i % 2 == 0 ? new String[3] : new String[4];
                }
                break;
            case 3:
                generatedUtopia = new String[13][];
                for (int i = 0; i < generatedUtopia.length; i++) {
                    if (i % 2 == 1) {
                        generatedUtopia[i] = new String[4];
                    } else if (i % 2 == 0 && i < 3 || i > 9) {
                        generatedUtopia[i] = new String[3];
                    } else {
                        generatedUtopia[i] = new String[5];
                    }
                }
                break;
            case 4:
                generatedUtopia = new String[17][];
                for (int i = 0; i < generatedUtopia.length; i++) {
                    if (i == 0 || i == generatedUtopia.length - 1) {
                        generatedUtopia[i] = new String[1];
                    } else if (i % 2 == 0) {
                        generatedUtopia[i] = new String[5];
                    } else if (i % 2 == 1 && i < 4 || i > 12) {
                        generatedUtopia[i] = new String[4];
                    } else {
                        generatedUtopia[i] = new String[6];
                    }
                }
                break;
            default:
                throw new GenerationException(1);
        }
        return generatedUtopia;
    }
}