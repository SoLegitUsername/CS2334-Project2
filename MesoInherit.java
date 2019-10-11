public class MesoInherit extends MesoAbstract {
    private static final int avgArraySize = 3;
    private static final double numberOfElements = 4.0;
    private String str;


    public MesoInherit(MesoStation mesoStation) {
        str = mesoStation.getStID();
    }

    int[] calAverage() {
        int[] avgArray = new int[avgArraySize];

        int num1 = (int) str.charAt(0);
        int num2 = (int) str.charAt(1);
        int num3 = (int) str.charAt(2);
        int num4 = (int) str.charAt(3);
        double charAvg = (num1 + num2 + num3 + num4) / numberOfElements; //Calculates average

        avgArray[0] = (int) Math.ceil(charAvg); //First index holds ceil
        avgArray[1] = (int) Math.floor(charAvg); //Second index holds floor
        avgArray[2] = (int) Math.round(charAvg); //Third index holds rounded avg

        return avgArray;
    }


    @Override
    char letterAverage() {
        return (char) calAverage()[2];
    }
}