package com.example.nekit.testofintegrity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by NEKIT on 28.01.2017.
 */

public class EndActivity extends AppCompatActivity {
    public static final String EXTRA_FROM_TEST_ACTIVITY = "extra";
    TextView txtEnd;

    int getExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        txtEnd = (TextView) findViewById(R.id.txt_end);

        getExtra = getIntent().getIntExtra(EXTRA_FROM_TEST_ACTIVITY, 0);
        switch (getExtra) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                txtEnd.setText(getExtra + "/34 Очень низкий показатель по шкале \"Честность\". Свидетельствует о ярко выраженной склонности ко лжи, приукрашиванию себя. Также может свидетельствовать о низких показателях социального интеллекта.");
                TestActivity.count = 0;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                txtEnd.setText(getExtra + "/34 Низкий показатель по шкале \"Честность\". Свидетельствует о значительной склонности ко лжи. Любит приукрашивать себя, своё поведение.");
                TestActivity.count = 0;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                txtEnd.setText(getExtra + "/34 Нормальный результат. Склонность ко лжи не выявлена. Может быть, изредка склонен приукрашивать себя, своё поведение, но в пределах нормы.");
                TestActivity.count = 0;
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                txtEnd.setText(getExtra + "/34 Высокий результат по шкале \"Честность\". Такой высокий результат может быть связан не только с высокой личностной честностью, но и следствием других причин: преднамеренного искажения ответов, очень неверной самооценки.");
                TestActivity.count = 0;
                break;
            default:
                txtEnd.setText(R.string.resultDef);
                TestActivity.count = 0;
                break;
        }
    }
}
