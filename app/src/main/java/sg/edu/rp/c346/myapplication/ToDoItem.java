package sg.edu.rp.c346.myapplication;

import java.util.Calendar;

/**
 * Created by 16004104 on 7/20/2017.
 */

public class ToDoItem {
    private String title;
    private String des;

    public ToDoItem(String title, String date) {
        this.title = title;
        this.des = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String story() {
        return des;
    }

    public void setDate(String date) {
        this.des = date;
    }

    public String getDateString(){
        String str=des;
        return str;
    }
    @Override
    public String toString(){
        return "ToDoItem{"+
                "Title'"+title+'\''+
                ", date=" + getDateString()+
                '}';
    }
}
