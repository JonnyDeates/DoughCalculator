package foundation.deates.doughprojectioncalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.*;
import java.util.ArrayList;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "foundation.deates.doughprojectioncalculator.MESSAGE";
    private ArrayList<DoughDayList> days = new ArrayList<DoughDayList>();

    @BindView(R.id.dough_day)
    ListView doughDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        days.add(new DoughDayList());
        days.add(new DoughDayList());
        //days.add(new DoughDayList());
        //days.add(new DoughDayList());
        DayAdapter adapter = new DayAdapter(this, days);
        doughDay.setAdapter(adapter);
    }


    private int[] CalculateDoughBatches() {
        int[] doughTrays = new int[4];
        ArrayList<String> dailyDough = new ArrayList<String>();
        ArrayList<Integer> doughBalls = new ArrayList<Integer>();
        //Clears the list in-case they need to reload the number of trays
        doughBalls.clear();

        for(DoughDayList x : days) {
            dailyDough.add(x.getSmall());
            dailyDough.add(x.getMedium());
            dailyDough.add(x.getLarge());
            dailyDough.add(x.getXlarge());
            dailyDough.add(x.getBread());
            dailyDough.add(x.getSmall());
            dailyDough.add(x.getMedium());
            dailyDough.add(x.getLarge());
            dailyDough.add(x.getXlarge());
        }
        for (String y : dailyDough) {
            try {
                addDough(doughBalls,y);
                }
            catch (NullPointerException e)
            {
                doughBalls.add(0);
            }
        }

            //Small Dough Trays
            doughTrays[0] = (int) Math.floor(((doughBalls.get(2) + (doughBalls.get(0) * 0.2)) + (doughBalls.get(3) + (doughBalls.get(1) * 0.2))) / 10.0);
            //Medium Dough Trays
            doughTrays[1] = (int) Math.round(((doughBalls.get(4) + (doughBalls.get(0) * 0.8)) + (doughBalls.get(5) + (doughBalls.get(1) * 0.8))) / 9.0);
            //Large Dough Trays
            doughTrays[2] = (int) Math.round((doughBalls.get(6) + doughBalls.get(7)) / 8.0);
            //Large Dough Trays
            doughTrays[3] = (int) Math.round((doughBalls.get(8) + doughBalls.get(9)) / 6.0);

            System.out.println(doughTrays[0] + " Yeet? " + doughTrays[1] + "Yeet 2? "+ doughTrays[2] +" Yeet 3? "+ doughTrays[3] + "     99999999999999999999999999999999999999999999");

            return doughTrays;
    }
    private  void addDough(ArrayList<Integer> arr,String val){
        try{
            arr.add(Integer.parseInt(val));
        }catch (NumberFormatException e){
            arr.add(0);
        }
    }
    public void gotoBatchesPage(View view) {
        Intent intent = new Intent(MainActivity.this, Batches.class);
        intent.putExtra("Batches", CalculateDoughBatches());
        startActivity(intent);
    }
}