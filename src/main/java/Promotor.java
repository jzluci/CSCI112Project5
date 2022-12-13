public class Promotor {

    private String name;
    private String hometown;
    private double activityPercentage;

    public Promotor(){
        name = "";
        hometown = "";
        activityPercentage = 0.0;
    }

    public Promotor(String name, String hometown, double activityPercentage){
        this.name = name;
        this.hometown = hometown;
        this.activityPercentage = activityPercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public double getActivityPercentage() {
        return activityPercentage;
    }

    public void setActivityPercentage(double activityPercentage) {
        this.activityPercentage = activityPercentage;
    }

    @Override
    public String toString() {
        return "Promotor{" +
                "name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", activityPercentage=" + activityPercentage +
                '}';
    }
}
