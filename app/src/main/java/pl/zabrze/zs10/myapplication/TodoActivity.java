package pl.zabrze.zs10.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoActivity extends AppCompatActivity {

    private ArrayList<Todo> todos;
    private ListView listViewTodos;
    private Button btn;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        todos = new ArrayList<>();
        todos.add(new Todo("Nauczyć się do egzaminu aplikacji webowych",new Date(2024,3,1)));
        todos.add(new Todo("Przygotować gazetke", new Date(2023,10,20)));
        listViewTodos = findViewById(R.id.listView);
        ArrayAdapter<Todo> adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,todos);
        listViewTodos.setAdapter(adapter);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(TodoActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                    }
                },
                        2023,10,5
                );
            }
        });
    }
}