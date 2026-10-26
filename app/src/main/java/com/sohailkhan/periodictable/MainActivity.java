package com.sohailkhan.periodictable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Periodic Table App\nBy Sohail Khan\nBuild Successful!");
        tv.setTextSize(24);
        tv.setPadding(50,200,50,50);
        setContentView(tv);
    }
}
