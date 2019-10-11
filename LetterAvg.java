import java.util.ArrayList;

public class LetterAvg {
    private char input;
    private ArrayList<String> matchStationList = new ArrayList<>();


    public LetterAvg(){
    }


    public LetterAvg(char input) {
        this.input = input;
        PosAvg pos = new PosAvg();

        try { pos.fileRead(); }

        catch (Exception e) { System.out.println("error in letteravg"); }

    }


}