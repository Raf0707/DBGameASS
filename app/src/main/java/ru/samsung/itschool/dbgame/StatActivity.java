package ru.samsung.itschool.dbgame;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StatActivity extends Activity {
    DBManager dbManager;
    TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);

        dbManager = DBManager.getInstance(this);
        info = findViewById(R.id.info);
        info.setText(String.format("%d", dbManager.gamesCount()));
    }
}
