package cn.edu.sdwu.android.home.sn170507180218;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Work2Activity extends AppCompatActivity {
    private ArrayList list;
    String content = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main3);

        list = new ArrayList();
        final TextView textView = (TextView) findViewById(R.id.layout_2);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_1);
        int count = linearLayout.getChildCount();
        for (int i = 0; i < count; i++) {
            View view = linearLayout.getChildAt(i);
            if (view instanceof CheckBox) {
                final CheckBox checkBox = (CheckBox) view;
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        //参数b代表是否选中,第一个参数代表事件源
                        if (b) {
                            list.add(compoundButton);//如果b表示当前的checkbox被选中，添加到list里,这个compoundButton是获取当前对象
                        }else{
                            list.remove(compoundButton);//否则从list里移出
                        }
                        content="you select:";
                        //循环输出选择的东西
                        for (int t = 0; t < list.size(); t++) {
                            CheckBox checkBox1 = (CheckBox) list.get(t);//在这里list里的是对象，所以要取出来
                            String sel = checkBox1.getText().toString();

                            content+= sel + ",";


                        }
                        //Toast.makeText(this,content,Toast.LENGTH_LONG).show();
                    }
                });

            }

        }
    }

    public void check(View view){

        Toast.makeText(this,content,Toast.LENGTH_LONG).show();
    }
}

