package com.example.nekit.testofintegrity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by NEKIT on 28.01.2017.
 */

public class TestActivity extends AppCompatActivity {

    TextView txtText;
    Button btnYes, btnNo;

    static int count;
    int nextQuestions;

    public static final String INSTANCE_STATE = "instance state";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        txtText = (TextView) findViewById(R.id.txt_text);

        btnYes = (Button) findViewById(R.id.btn_yes);
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countMethod();
                count++;
            }
        });


        btnNo = (Button) findViewById(R.id.btn_no);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countMethod();
            }
        });

        if (savedInstanceState != null) {
            nextQuestions = savedInstanceState.getInt(INSTANCE_STATE, 0);
        }
        updateTest();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(INSTANCE_STATE, nextQuestions);
    }

    private void countMethod() {
        if (nextQuestions == 33) {
            isExit(true);
        }
        nextQuestions = (nextQuestions + 1) % TestModel.testArray().size();
        updateTest();
    }

    private void updateTest() {
        txtText.setText(TestModel.testArray().get(nextQuestions).getQuestion());
    }

    private void isExit(boolean b) {
        if (b) {
            Intent i = new Intent(TestActivity.this, EndActivity.class);
            i.putExtra(EndActivity.EXTRA_FROM_TEST_ACTIVITY, count);
            startActivity(i);
        }
    }
}
