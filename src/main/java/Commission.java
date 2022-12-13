import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeMap;

public class Commission {

    private int currentYear;
    private ArrayList<Nonprofits> nonprofits = new ArrayList<Nonprofits>();
    private int totalNumberNonprofits;
    FileWriter file = new FileWriter("data.txt", true);
    PrintWriter pw = new PrintWriter(file);

    public Commission() throws IOException {
        currentYear = 0;
    }

    public Commission(int currentYear) throws IOException {
        this.currentYear = currentYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public ArrayList<Nonprofits> getNonprofits() {
        return nonprofits;
    }

    public int getTotalNumberNonprofits() {
        totalNumberNonprofits = nonprofits.size();
        return totalNumberNonprofits;
    }

    public void addNonProfit(String name, String acronym) throws IOException {
        nonprofits.add(new Nonprofits(name,acronym));
    }

    public void printNonprofit(){
        for (int i = 0; i<nonprofits.size(); i++){
            nonprofits.get(i).getOverallActivityPercentage();
            System.out.println(nonprofits.get(i).toString());
            pw.println(nonprofits.get(i).toString());



        }


    }

    public void close(){
        pw.close();
    }

    public Nonprofits getNonprofit(String str){
        for (int i = 0; i<nonprofits.size(); i++){
            if (str.equals(nonprofits.get(i).getAcronym())){
                return nonprofits.get(i);
            }
        }
        return null;
    }

    public Nonprofits getNonprofit(int index){
        return nonprofits.get(index);
    }

    public void sort(){
        for (int i = 0; i<nonprofits.size();i++){
            nonprofits.get(i).sort(nonprofits.get(i).getPromotors(),0,nonprofits.get(i).getPromotors().size()-1);
        }
    }

    public void awards(){
        for (int i = 0; i < nonprofits.size(); i++){
            if (nonprofits.get(i).getOverallActivityPercentage() > 3){
                System.out.println(nonprofits.get(i).getName() + " receives award 1. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());
                pw.println(nonprofits.get(i).getName() + " receives award 1. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());

            }
            else if (nonprofits.get(i).getOverallActivityPercentage() > 2){
                System.out.println(nonprofits.get(i).getName() + " receives award 2. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());
                pw.println(nonprofits.get(i).getName() + " receives award 2. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());


            }
            else if (nonprofits.get(i).getOverallActivityPercentage() > 1){
                System.out.println(nonprofits.get(i).getName() + " receives award 3. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());
                pw.println(nonprofits.get(i).getName() + " receives award 3. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());


            }
            else {
                System.out.println(nonprofits.get(i).getName() + " receives award 4. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());
                pw.println(nonprofits.get(i).getName() + " receives award 4. With an overall activity percentage of: " + nonprofits.get(i).getOverallActivityPercentage());


            }
        }

    }


    @Override
    public String toString() {
        return "Commission{" +
                "currentYear=" + currentYear +
                ", nonprofits=" + nonprofits +
                ", totalNumberNonprofits=" + totalNumberNonprofits +
                '}';
    }
}
