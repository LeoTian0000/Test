package sg.edu.rp.c346.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<ToDoItem> alMovieList;
    CustomAdapter aaMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie=(ListView)findViewById(R.id.listView);
        alMovieList=new ArrayList<ToDoItem>();
        aaMovie=new CustomAdapter(this, R.layout.todoitem, alMovieList);
        lvMovie.setAdapter(aaMovie);
        alMovieList.add(new ToDoItem("War for the Planet of the Apes", "A 2017 sequel of the Planet of the Apes science fiction franchise by French author Pierre Boulle's"));

        alMovieList.add(new ToDoItem("King Kong", "Movie about a giant ape, created by American filmmaker  Merian C. Cooper that first appear in 1930s."));


    }
}
