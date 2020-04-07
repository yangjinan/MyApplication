package cn.edu.sdwu.android.home.sn170507180218;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Work1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work1);
        //匿名内部类的方法
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = ((EditText)findViewById(R.id.num1)).getText().toString();
                String num2 = ((EditText)findViewById(R.id.num2)).getText().toString();

                int num_1 = Integer.parseInt(num1);
                int num_2 = Integer.parseInt(num2);
                int count = num_1+num_2;

                TextView textView = findViewById(R.id.text);
                textView.setText(count+"");

            }
        });

    }
}
