package com.example.jirka.listview5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public static final String [] verze = new String[] {
            "Android 1.5",
            "Android 1.6"
    };

    public static final String [] api = new String[] {
            "Cupcake, API 3",
            "Donut API 4",

    };

    public static final Integer [] images = new Integer[] {
        R.drawable.i_cupcake,
        R.drawable.i_donut
    };

    ListView lvListView;
    List<Polozka> polozkySeznamu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // vytvoření a naplnění seznamu
        polozkySeznamu = new ArrayList<Polozka>();
        for (int i = 0; i < verze.length;i++ )
        {
            Polozka item = new Polozka(images[i], verze[i],api[i] );
            polozkySeznamu.add(item);
        }

        lvListView = (ListView) findViewById(R.id.lvListView);

        MujBaseAdapter adapter  = new MujBaseAdapter(this, polozkySeznamu);
        lvListView.setAdapter(adapter);
       // lvListView.setOnItemClickListener(this);


    }

    private void testUpload () {
        int i =  1 +1 ;
    }
}
