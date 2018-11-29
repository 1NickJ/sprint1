package com.lambdaschool.sprint1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class Main2Activity extends AppCompatActivity {
    private Context context;
    EditText editText;
    Button deleteButton;
    Switch watchedSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        context = this;
        editText = findViewById(R.id.edit_text);
        watchedSwitch = findViewById(R.id.watched_switch);
        deleteButton = findViewById(R.id.delete_button);

        findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredText = editText.getText().toString();

                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("enteredText", enteredText);
                //intent.putExtra(context.getResources().getString(R.string.save_key), enteredText);
                startActivity(intent);
            }
        });
    }
}
