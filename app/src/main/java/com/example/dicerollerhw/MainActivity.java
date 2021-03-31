package com.example.dicerollerhw;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import java.util.Random;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView qtyTV;
    private TextView dicesideTV;
    private TextView consequenceTV;
    private TextView sequenceTV;

    private String currentQtyText;
    private String currentDiceNumber;
    private int diceside;
    private String sequence;
    private int consequence;
    private int token;

    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;

    private Button d4Button;
    private Button d6Button;
    private Button d8Button;
    private Button d10Button;
    private Button d12Button;
    private Button d20Button;

    private Button clsButton;

    private Button rollButton;
    private Button percentileButton;

    //private Button TestButton;
    //private TextView TestScreen;

    //above widget is exist for testing.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.oneButton = this.findViewById(R.id.OneB);
        this.twoButton = this.findViewById(R.id.TwoB);
        this.threeButton = this.findViewById(R.id.ThreeB);
        this.fourButton = this.findViewById(R.id.FourB);
        this.fiveButton = this.findViewById(R.id.FiveB);
        this.sixButton = this.findViewById(R.id.SixB);
        this.sevenButton = this.findViewById(R.id.SevenB);
        this.eightButton = this.findViewById(R.id.EightB);
        this.nineButton = this.findViewById(R.id.NineB);
        this.zeroButton = this.findViewById(R.id.ZeroB);

        this.d4Button = this.findViewById(R.id.D4B);
        this.d6Button = this.findViewById(R.id.D6B);
        this.d8Button = this.findViewById(R.id.D8B);
        this.d10Button = this.findViewById(R.id.D10B);
        this.d12Button = this.findViewById(R.id.D12B);
        this.d20Button = this.findViewById(R.id.D20B);

        this.clsButton = this.findViewById(R.id.ClearB);

        this.rollButton = this.findViewById(R.id.RollB);
        this.percentileButton = this.findViewById(R.id.PercentileB);

        this.qtyTV = this.findViewById(R.id.Scr3);
        this.dicesideTV = this.findViewById(R.id.Scr4);
        this.consequenceTV = this.findViewById(R.id.Src2);
        this.sequenceTV = this.findViewById(R.id.Src1);

        this.token = 0;
        this.qtyTV.setText("");
        this.dicesideTV.setText("");
        this.consequenceTV.setText("");
        this.sequenceTV.setText("");
        this.currentQtyText = "";
        this.diceside = 1;
        this.consequence = 0;

        //this.TestButton = this.findViewById(R.id.TestB);
        //this.TestScreen = this.findViewById(R.id.TestS);

        //this.TestScreen.setText("");



    }

    public void clearpad(View v)
    {
        if(v == this.clsButton)
        {
            this.currentQtyText = "";
            this.currentDiceNumber = "";
            this.qtyTV.setText(this.currentQtyText);
            this.dicesideTV.setText(this.currentDiceNumber);

            this.diceside = 1;

        }
    }

    public void Numberpad(View v)
    {
        if(v == this.oneButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }

            this.currentQtyText+="1";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.twoButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="2";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.threeButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="3";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.fourButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="4";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.fiveButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="5";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.sixButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="6";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.sevenButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="7";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.eightButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="8";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.nineButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="9";
            this.qtyTV.setText(this.currentQtyText);
        }
        if(v == this.zeroButton)
        {
            if(this.token == 1)
            {
                this.currentQtyText = "";
                token = 0;
            }
            this.currentQtyText+="0";
            if(this.currentQtyText.equals("0"))
                currentQtyText = "";
            this.qtyTV.setText(this.currentQtyText);
        }

    }

    public void dicesidepad(View v)
    {
        if(v == this.d4Button)
        {
            this.diceside = 4;
            this.currentDiceNumber = "D4";
            this.dicesideTV.setText(currentDiceNumber);
        }
        if(v == this.d6Button)
        {
            this.diceside = 6;
            this.currentDiceNumber = "D6";
            this.dicesideTV.setText(currentDiceNumber);
        }
        if(v == this.d8Button)
        {
            this.diceside = 8;
            this.currentDiceNumber = "D8";
            this.dicesideTV.setText(currentDiceNumber);
        }
        if(v == this.d10Button)
        {
            this.diceside = 10;
            this.currentDiceNumber = "D10";
            this.dicesideTV.setText(currentDiceNumber);
        }
        if(v == this.d12Button)
        {
            this.diceside = 12;
            this.currentDiceNumber = "D12";
            this.dicesideTV.setText(currentDiceNumber);
        }
        if(v == this.d20Button)
        {
            this.diceside = 20;
            this.currentDiceNumber = "D20";
            this.dicesideTV.setText(currentDiceNumber);
        }
    }
/*
    public void Testpad(View v)
    {
        if(v==this.TestButton)
        {
            this.TestScreen.setText("Test");
        }
    }
*/
    //This code is exist for testing.

    public void rollpad(View v)
    {

        if(v == this.rollButton)
        {

            if((diceside != 1 )&&!(this.currentQtyText.equals("")))
            {
                int tmp = 0;
                this.sequence = "";

                int n = Integer.parseInt(currentQtyText);
                for(int i = 0; i < n; i++)
                {
                    Random ran = new Random();
                    int trial = ran.nextInt(diceside)+1;

                    String trialString = Integer.toString(trial);
                    this.sequence += trialString;
                    if(i != n-1)
                        this.sequence += "+";

                    tmp += trial;
                }

                String tmpS = Integer.toString(tmp);
                this.sequenceTV.setText(this.sequence);
                this.consequenceTV.setText(tmpS);
            }
            if((diceside == 1)||(this.currentQtyText.equals("")))
            {
                this.sequenceTV.setText("Please select Number");
                this.consequenceTV.setText("0");
            }

            this.token = 1;

        }
    }

    public void percentilepad(View v)
    {
        if(v == this.percentileButton)
        {
            if(diceside == 4)
            {
                this.sequenceTV.setText("Each number has following percentage");
                this.consequenceTV.setText("25%");
            }
            if(diceside == 6)
            {
                this.sequenceTV.setText("Each number has following percentage");
                this.consequenceTV.setText("16.7%");
            }
            if(diceside == 8)
            {
                this.sequenceTV.setText("Each number has following percentage");
                this.consequenceTV.setText("12.5%");
            }
            if(diceside == 10)
            {
                this.sequenceTV.setText("Each number has following percentage");
                this.consequenceTV.setText("10%");
            }
            if(diceside == 12)
            {
                this.sequenceTV.setText("Each number has following percentage");
                this.consequenceTV.setText("8.33%");
            }
            if(diceside == 20)
            {
                this.sequenceTV.setText("Each number has following percentage");
                this.consequenceTV.setText("5%");
            }
            if(diceside == 1)
            {
                this.sequenceTV.setText("Please select Number");
                this.consequenceTV.setText("0");
            }
        }
    }

}