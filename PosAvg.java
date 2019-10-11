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

}
