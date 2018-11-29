package com.lambdaschool.sprint1;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Context context;
    private TextView listView = findViewById(R.id.list_view);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        listView = findViewById(R.id.list_view);

        //recieving data
        Bundle bundle = getIntent().getExtras();
        //passing data to string variable
        String enteredText = bundle.getString("enteredText");

        //assign xml objects for textviews into variables
        listView = findViewById(R.id.list_view);
        listView.setText(enteredText);



        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                startActivity(intent);

            }
        });
    }
}
