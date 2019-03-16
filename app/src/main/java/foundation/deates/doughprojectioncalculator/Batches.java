package foundation.deates.doughprojectioncalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.widget.ListView;

import java.io.Console;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jonny Deates  on 10/17/2016.
 */
public class Batches extends AppCompatActivity {
    @BindView(R.id.batchview) ListView batchList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batches);
        ButterKnife.bind(this);

        Bundle extras = getIntent().getExtras();
        int[] doughTrays = extras.getIntArray("Batches");

        ArrayList<Batchlist> batches = new ArrayList<Batchlist>();

        batches.add(new Batchlist(doughTrays[0],"Small Trays: "));
        batches.add(new Batchlist(doughTrays[1],"Medium Trays: "));
        batches.add(new Batchlist(doughTrays[2],"Large Trays: "));
        batches.add(new Batchlist(doughTrays[3],"Extra Large Trays: "));


        BatchAdapter adapter = new BatchAdapter(this, batches);

        batchList.setAdapter(adapter);
    }
}
