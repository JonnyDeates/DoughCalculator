package foundation.deates.doughprojectioncalculator;

/**
 * Created by Jonny Deates  on 7/20/2017.
 */

public class DoughDayList {
    private int day;



    private String bread, small, medium, large, xlarge;

    public DoughDayList(){
        bread = "";
        small = "";
        medium = "";
        large = "";
        xlarge = "";
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public String getBread() {
        if (bread != null)
            return bread;
        else
            return "0";
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    public String getSmall() {
        if (small != null && !small.equals(""))
            return small;
        else
            return "0";
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        if (medium != null && !medium.equals(""))
            return medium;
        else
            return "0";
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        if (large != null && !large.equals(""))
            return large;
        else
            return "0";
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getXlarge() {
        if (xlarge != null && !xlarge.equals(""))
            return xlarge;
        else
            return "0";
    }

    public void setXlarge(String xlarge) {
        this.xlarge = xlarge;
    }
}
