import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {

    String string;
    private static final int stringStart = 1; //No magical numbers this time
    private static final int stringEnd = 5; //For use in the info.subSequence
    ArrayList<String> stationIDs = new ArrayList<>();


    public PosAvg(){
    }


    public PosAvg(String str) {
        this.string = str;
        try{
            fileRead();
        }
        catch(Exception e) {
            System.out.println("error in PosAvg");
        }
    }


    public ArrayList<String> arrayListReturn() {
        return stationIDs;
    }


    public void fileRead() throws IOException {
        String line;

        FileReader filereader = new FileReader("Mesonet.txt");
        BufferedReader br = new BufferedReader(filereader);
        line = br.readLine();
        line = br.readLine();
        line = br.readLine();
        line = br.readLine();

        while (line != null) {
            String parsedInfo = (String) line.subSequence(stringStart, stringEnd);
            stationIDs.add(parsedInfo);
            line = br.readLine();
        }
        br.close();
    }

    public int indexOfStation() {
        String tempString = "";
        int indexNum = 0;

        for (int i = 0; i < stationIDs.size(); ++i) {
            tempString = stationIDs.get(i);

            if (string.equals(tempString)) {
                indexNum = stationIDs.indexOf(tempString);
            }

        }
        return indexNum + 1;
    }

    public String toString () {
        int index = indexOfStation();
        String first = stationIDs.get(index);
        String second = stationIDs.get(index - 2);
        String third = stationIDs.get(index + 1);
        String fourth = stationIDs.get(index - 3);

        String toStr = String.format("This index is average of %s and %s, %s and %s, " +
                "and so on.", second, first, fourth, third);
        return toStr;
    }
}
