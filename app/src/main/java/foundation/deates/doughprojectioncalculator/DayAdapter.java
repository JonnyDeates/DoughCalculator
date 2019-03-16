package foundation.deates.doughprojectioncalculator;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jonny Deates  on 7/20/2017.
 */

public class DayAdapter extends ArrayAdapter<DoughDayList> {
    public DayAdapter(Activity context, ArrayList<DoughDayList> words) {
        super(context,0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if and existing view is existing
        View listItemView = convertView;
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_dough_day,parent,false);
        //FIX THIS
        DoughDayList currentDay = getItem(position);
        //Number View
        EditText smallDoughEditText = (EditText)listItemView.findViewById(R.id.day_small);
        currentDay.setSmall(smallDoughEditText.getText().toString());
        EditText mediumDoughEditText = (EditText)listItemView.findViewById(R.id.day_medium);
        currentDay.setSmall(mediumDoughEditText.getText().toString());
        EditText largeDoughEditText = (EditText)listItemView.findViewById(R.id.day_large);
        currentDay.setSmall(largeDoughEditText.getText().toString());
        EditText xlargeDoughEditText = (EditText)listItemView.findViewById(R.id.day_extra_large);
        currentDay.setSmall(xlargeDoughEditText.getText().toString());
        EditText breadDoughEditText = (EditText)listItemView.findViewById(R.id.day_bread);
        currentDay.setSmall(breadDoughEditText.getText().toString());
        //Word View
        TextView dayIndicator = (TextView)listItemView.findViewById(R.id.day);
        TextView dayIndicatorBar = (TextView)listItemView.findViewById(R.id.day_bar);
        dayIndicator.setText(("Day " + (position + 1)));
       dayIndicator.setBackgroundColor(getColor(position));
        dayIndicatorBar.setBackgroundColor(getBarColor(position));
        //returning the whole list view
        return listItemView;

    }
    private int getColor(int key){
        switch (key) {
            case 0:
                return 0xFF991111;
            case 1:
                return 0xFF119911;
            case 2:
                return 0xff111199;
            case 3:
                return 0xff991199;
            default:
                return 0xff999999;
        }
    }
    private int getBarColor(int key){
        switch (key) {
            case 0:
                return 0xFF660000;
            case 1:
                return 0xFF006600;
            case 2:
                return 0xff000066;
            case 3:
                return 0xff660066;
            default:
                return 0xff999999;
        }
    }
}
