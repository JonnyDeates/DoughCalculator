package foundation.deates.doughprojectioncalculator;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jonny Deates on 10/18/2016.
 */
public class BatchAdapter extends ArrayAdapter<Batchlist> {

    public BatchAdapter(Activity context, ArrayList<Batchlist> words) {
        super(context,0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if and existing view is existing
        View listItemView = convertView;
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_dough_list,parent,false);
        Batchlist currentWord = getItem(position);
        //Number View
        TextView numberTextView = (TextView)listItemView.findViewById(R.id.number_text_view);
        numberTextView.setText(currentWord.getmNumberOf());
        //Word View
        TextView wordTextView = (TextView)listItemView.findViewById(R.id.tray_text_view);
        wordTextView.setText(currentWord.getmTrays());
        //returning the whole list view
        return listItemView;

    }
}
