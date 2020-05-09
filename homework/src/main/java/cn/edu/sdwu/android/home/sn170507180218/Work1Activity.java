package cn.edu.sdwu.android.home.sn170507180218;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Work1Activity extends AppCompatActivity  implements View.OnClickListener{
    EditText num_1,num_2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num_1=(EditText) findViewById(R.id.num1);
        num_2=(EditText) findViewById(R.id.num2);
        final TextView result=(TextView) findViewById(R.id.result);
        Button add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String et1=num_1.getText().toString();
                String et2=num_2.getText().toString();
                float num1=Integer.valueOf(et1).floatValue();
                float num2=Integer.valueOf(et2).floatValue();
                num1=num1+num2;
                et1=String.valueOf(num1);
                result.setText(et1);
            }
        });

        Button sub=(Button)findViewById(R.id.sub);
        sub.setOnClickListener(new MyClickListener());

        Button mul=(Button)findViewById(R.id.mul);
        mul.setOnClickListener(this);
    }

    public class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            num_1=(EditText) findViewById(R.id.num1);
            num_2=(EditText) findViewById(R.id.num2);
            final TextView result=(TextView) findViewById(R.id.result);
            String et1=num_1.getText().toString();
            String et2=num_2.getText().toString();
            float num1=Integer.valueOf(et1).floatValue();
            float num2=Integer.valueOf(et2).floatValue();
            num1=num1-num2;
            et1=String.valueOf(num1);
            result.setText(et1);
        }
    }
    public void onClick(View view) {
        num_1=(EditText) findViewById(R.id.num1);
        num_2=(EditText) findViewById(R.id.num2);
        final TextView result=(TextView) findViewById(R.id.result);
        String et1=num_1.getText().toString();
        String et2=num_2.getText().toString();
        float num1=Integer.valueOf(et1).floatValue();
        float num2=Integer.valueOf(et2).floatValue();
        num1=num1*num2;
        et1=String.valueOf(num1);
        result.setText(et1);
    }
    public void chu(View view) {
        num_1=(EditText) findViewById(R.id.num1);
        num_2=(EditText) findViewById(R.id.num2);
        final TextView result=(TextView) findViewById(R.id.result);
        String et1=num_1.getText().toString();
        String et2=num_2.getText().toString();
        float num1=Integer.valueOf(et1).floatValue();
        float num2=Integer.valueOf(et2).floatValue();
        num1=num1/num2;
        et1=String.valueOf(num1);
        result.setText(et1);
    }
}
