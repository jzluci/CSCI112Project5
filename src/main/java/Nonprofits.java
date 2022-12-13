import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Nonprofits {

    private String name;
    private String acronym;
    private ArrayList<Promotor> promotors = new ArrayList<Promotor>();
    private double overallActivityPercentage = 0.0;
    private int totalNumberPromoters = 0;
    FileWriter file = new FileWriter("data.txt", true);
    PrintWriter pw = new PrintWriter(file);

    public Nonprofits() throws IOException {
        name = "";
        acronym = "";
    }

    public Nonprofits(String name, String acronym) throws IOException {
        this.name = name;
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public ArrayList<Promotor> getPromotors() {
        return promotors;
    }


    public double getOverallActivityPercentage() {
        double totalActivity = 0.0;
        for (int i = 0; i <promotors.size(); i++){
            totalActivity += promotors.get(i).getActivityPercentage();
        }
        overallActivityPercentage = totalActivity/totalNumberPromoters;
        return overallActivityPercentage;
    }

    public void setOverallActivityPercentage(double overallActivityPercentage) {
        this.overallActivityPercentage = overallActivityPercentage;
    }

    public int getTotalNumberPromoters() {
        totalNumberPromoters = promotors.size();
        return totalNumberPromoters;
    }

    public void addPromotor(String name, String hometown, double activityPercentage){
        promotors.add(new Promotor(name,hometown,activityPercentage));
        totalNumberPromoters++;
    }



    public void printPromotors(){
        System.out.println(name);
        pw.println(name);
        for (int i = 0; i < promotors.size(); i++){
            System.out.println(promotors.get(i).toString());
            pw.println(promotors.get(i).toString());

        }


    }

    public void close(){
        pw.close();
    }







    @Override
    public String toString() {
        return "Nonprofits{" +
                "name='" + name + '\'' +
                ", acronym='" + acronym + '\'' +
                ", number of promotors= " + totalNumberPromoters +
                ", promotors=" + promotors +
                ", overallActivityPercentage=" + overallActivityPercentage +
                '}';
    }

    public void sort(ArrayList<Promotor> arrayList, int min, int max){
        quickSort(arrayList,min,max);
    }

    public static void quickSort(ArrayList<Promotor> array, int min, int max){
        int pivot;
        if(min < max){
            pivot = partition(array, min, max);
            quickSort(array, min, (pivot-1));
            quickSort(array, (pivot + 1), max);
        }
    }

    public static int partition(ArrayList<Promotor> array, int min, int max){

        Promotor pivot = array.get(min);
        int left = min;
        int right = max;
        while(left < right){
            while(array.get(left).getActivityPercentage() <= pivot.getActivityPercentage() && left < right){
                left++;
            }
            while(array.get(right).getActivityPercentage() > pivot.getActivityPercentage()){
                right--;
            }
            if(left < right){
                swap(array, left, right);
            }
        }
        swap(array, min, right);

        return right;
    }

    public static void swap(ArrayList<Promotor> array, int left, int right){
        Promotor temp = array.get(left);
        array.set(left, array.get(right));
        array.set(right,temp);
    }



}
