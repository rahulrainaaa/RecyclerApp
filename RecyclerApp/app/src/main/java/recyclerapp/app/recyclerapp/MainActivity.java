package recyclerapp.app.recyclerapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<Person> list = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        //LinearLayoutManager lm = new LinearLayoutManager(this);
        StaggeredGridLayoutManager lm = new StaggeredGridLayoutManager(2, 1);

        rv.setLayoutManager(lm);

        list = new ArrayList<Person>();
        for(int i = 0; i < 20; i++)
        {
            if(i % 4 == 0)
            {
                list.add(new Person("Name-\n-\n-\nName-" + i, "Desc-\n-\n-\nDesc-" + i, R.mipmap.ic_launcher));
            }
            else if(i % 3 == 0)
            {
                list.add(new Person("Name-\n-Name-" + i, "Desc-" + i, R.mipmap.ic_launcher));
            }
            else
            {
                list.add(new Person("Name-" + i, "Desc-\n-\n" + i, R.mipmap.ic_launcher));
            }
        }

        RVAdapter adapter = new RVAdapter(list);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}