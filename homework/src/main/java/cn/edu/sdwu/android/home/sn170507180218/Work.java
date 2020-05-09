package cn.edu.sdwu.android.home.sn170507180218;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class Work extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }

    public void homework_1(View view) {
        Intent intent = new Intent(this, Work1Activity.class);
        startActivity(intent);
    }

    public void homework_2(View view) {
        Intent intent = new Intent(this, Work2Activity.class);
        startActivity(intent);
    }

    public void homework_3(View view) {
        Intent intent = new Intent(this, Work3Activity.class);
        startActivity(intent);

    }

    public void homework_4(View view) {
        Intent intent = new Intent(this, Work4Activity.class);
        startActivity(intent);
    }
    public void homework_5(View view) {
        Intent intent = new Intent(this, Work5Activity.class);
        startActivity(intent);
    }
}
