package foundation.deates.doughprojectioncalculator;

/**
 * Created by Jonny Deates  on 10/18/2016.
 */
public class Batchlist {
    private String mTrays,mNumberOf;

    private int mImageResourceId;

    public Batchlist(int x, String y){
        mNumberOf = x+"";
        mTrays = y;

    }

    public String getmTrays() {
        return mTrays;
    }

    public void setmTrays(String mWord) {
        this.mTrays = mWord;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmNumberOf() {
        return mNumberOf;
    }

    public void setmNumberOf(int x) {
        this.mNumberOf = x+"";
    }
}
