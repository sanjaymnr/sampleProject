package com.np.dipendra.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DashBoardItemsActivity extends AppCompatActivity {
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboarditems);
        String dashboarditems = getIntent().getStringExtra("dashboardItems");
        tvName = findViewById(R.id.tv_name);
        tvName.setText(dashboarditems);

    }
}
