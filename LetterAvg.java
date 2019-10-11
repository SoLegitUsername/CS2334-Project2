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


    public int numberOfStationWithLetterAvg() {
        PosAvg posavg = new PosAvg();
        int numMatches = 0;

        try { posavg.fileRead(); }

        catch (Exception e) { System.out.println("error in letteravg"); }

        ArrayList<String> tempList = posavg.arrayListReturn();
        for (int i = 0; i < tempList.size(); i++) {
            String matches = tempList.get(i);

            if (matches.charAt(0) == input) {
                matchStationList.add(matches);
                numMatches++;
            }

        }
        return numMatches;
    }


    public String toString() {

        String str = String.join("\n", matchStationList);
        return String.format("\nThey are:\n", str);
    }
}