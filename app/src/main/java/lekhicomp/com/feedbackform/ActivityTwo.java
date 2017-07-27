package lekhicomp.com.feedbackform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener,CompoundButton.OnCheckedChangeListener{

    //References
    CheckBox cbJava, cbAndroid, cbSwift;
    RadioButton rbContentCY, rbContentCN, rbContentVY, rbContentVN, rbAudio1, rbAudio2, rbSeat1, rbSeat2;
    Button btnNext;

    void initViews() {
        cbJava = (CheckBox) findViewById(R.id.checkBoxJava);
        cbAndroid = (CheckBox) findViewById(R.id.checkBoxAndroid);
        cbSwift = (CheckBox) findViewById(R.id.checkBoxSwift);
        rbContentCY=(RadioButton)findViewById(R.id.radioContentCY);
        rbContentCN=(RadioButton)findViewById(R.id.radioContentCN);
        rbContentVY=(RadioButton)findViewById(R.id.radioContentVY);
        rbContentVN=(RadioButton)findViewById(R.id.radioContentVN);
        rbAudio1=(RadioButton)findViewById(R.id.radioAudioY);
        rbAudio2=(RadioButton)findViewById(R.id.radioAudioN);
        rbSeat1=(RadioButton)findViewById(R.id.radioSeatingY);
        rbSeat2=(RadioButton)findViewById(R.id.radioSeatingN);

        btnNext=(Button)findViewById(R.id.buttonNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    Intent intent=new Intent(ActivityTwo.this,ActivityFinish.class);
                startActivity(intent);
            }
        });

        cbJava.setOnCheckedChangeListener(this);
        cbAndroid.setOnCheckedChangeListener(this);
        cbSwift.setOnCheckedChangeListener(this);
        rbContentCY.setOnCheckedChangeListener(this);
        rbContentCN.setOnCheckedChangeListener(this);
        rbContentVY.setOnCheckedChangeListener(this);
        rbContentVN.setOnCheckedChangeListener(this);
        rbSeat1.setOnCheckedChangeListener(this);
        rbSeat2.setOnCheckedChangeListener(this);
        rbAudio1.setOnCheckedChangeListener(this);
        rbAudio2.setOnCheckedChangeListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        initViews();

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
    int id=compoundButton.getId();
        switch (id){
            case R.id.checkBoxJava:
                if(b)
                Toast.makeText(this,"Your Course is Java",Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBoxAndroid:
                if(b)
                Toast.makeText(this,"Your Course is Android",Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBoxSwift:
                if(b)
                Toast.makeText(this,"Your Course is Swift",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioContentCY:
                Toast.makeText(this,"Happy with Content Clarity :)",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioContentCN:
                Toast.makeText(this,"UnHappy with Content Clarity :(",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioContentVY:
                Toast.makeText(this,"Happy with Content Visibility :)",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioContentVN:
                Toast.makeText(this,"UnHappy with Content Visibility :(",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioAudioY:
                Toast.makeText(this,"Happy with Audio Quality :)",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioAudioN:
                Toast.makeText(this,"UnHappy with Audio Quality :(",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioSeatingY:
                Toast.makeText(this,"Adequate Seating Arrangement",Toast.LENGTH_LONG).show();
                break;
            case R.id.radioSeatingN:
                Toast.makeText(this,"Inadequate Seating Arrangement",Toast.LENGTH_LONG).show();
                break;


        }
    }
}
