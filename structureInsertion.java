public class structureInsertion {
    private int[][] generatedUtopia;

    public int[][] insertRows(int level) {
        if(level < 0){
            System.out.println("invalid level!");
            return generatedUtopia;
        }
        switch (level) {
            case 0:
                generatedUtopia = new int[5][];
                for(int i = 0; i < generatedUtopia.length; i++){
                    generatedUtopia[i] = i % 2 == 0 ? new int[1] : new int[2];
                }
                break;
            case 1:
                generatedUtopia = new int[7][];
                for(int i = 0; i < generatedUtopia.length; i++){
                    generatedUtopia[i] = i % 2 == 0 ? new int[2] : new int[3];
                }
                break;
            case 2:
                generatedUtopia = new int[9][];
                for(int i = 0; i < generatedUtopia.length; i++){
                    generatedUtopia[i] = i % 2 == 0 ? new int[3] : new int[4];
                }
                break;
            case 3:
                generatedUtopia = new int[13][];
                for(int i = 0; i < generatedUtopia.length; i++){
                    if(i % 2 == 1){
                        generatedUtopia[i] = new int[4];
                    }
                    else if(i % 2 == 0 && i < 3 || i > 9){
                        generatedUtopia[i] = new int[3];
                    }
                    else{
                        generatedUtopia[i] = new int[5];
                    }
                }
                break;
            case 4:
                generatedUtopia = new int[17][];
                for(int i = 0; i < generatedUtopia.length; i++){
                    if(i == 0 || i == generatedUtopia.length-1){
                        generatedUtopia[i] = new int[1];
                    }
                    else if(i % 2 == 0){
                        generatedUtopia[i] = new int[5];
                    }
                    else if(i % 2 == 1 && i < 4 || i > 12){
                        generatedUtopia[i] = new int[4];
                    }
                    else{
                        generatedUtopia[i] = new int[6];
                    }
                }
                break;
            default:
                System.out.println("unable to calculate level dimensions!");
                break;
        }
        return generatedUtopia;
    }
    
    public String toString(){
        String finalStr = "";
        for(int i = 0; i < generatedUtopia.length; i++){
            finalStr += "[ ";
            for(int j = 0; j < generatedUtopia[i].length; j++){
                finalStr += generatedUtopia[i][j] + " ";
            }
            finalStr += "]\n";
        }
        return finalStr;
    }
}