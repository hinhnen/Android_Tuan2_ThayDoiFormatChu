package bcvt.edu.vn;

import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbbackground, cbtextcolor, cbcenter;
    RadioButton rbOdd, rbEven, rbBoth;
    Button btnResult;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContol();
        setEvent();
    }

    private void setContol(){
        cbbackground = findViewById(R.id.background);
        cbcenter = findViewById(R.id.center);
        cbtextcolor = findViewById(R.id.textcolor);
        rbOdd = findViewById(R.id.odd);
        rbEven = findViewById(R.id.even);
        rbBoth = findViewById(R.id.both);
        cbcenter = findViewById(R.id.center);
        btnResult = findViewById(R.id.showResult);
        tvResult = findViewById(R.id.result);
    }

    private void setEvent(){
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbbackground.isChecked()){
                    tvResult.setBackgroundColor(getResources().getColor(R.color.backgroundresult));
                } else {
                    tvResult.setBackgroundColor(getResources().getColor(R.color.background));
                }
                if(cbtextcolor.isChecked()){
                    tvResult.setTextColor(getResources().getColor(R.color.textcolorresult));
                } else {
                    tvResult.setTextColor(getResources().getColor(R.color.color));
                }
                if(cbcenter.isChecked()){
                    tvResult.setGravity(Gravity.CENTER);
                } else {
                    tvResult.setGravity(Gravity.NO_GRAVITY);
                }
                if(rbOdd.isChecked()){
                    tvResult.setText("101");
                }
                if(rbEven.isChecked()){
                    tvResult.setText("100");
                }
                if(rbBoth.isChecked()){
                    tvResult.setText("Không có số nào");
                }
            }
        });
    }
}
