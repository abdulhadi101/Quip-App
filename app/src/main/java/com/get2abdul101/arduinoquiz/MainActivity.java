package com.get2abdul101.arduinoquiz;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.username);
        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        textView.setText(name);


    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;

        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        /**
         * Question One
         * Answer: Option 1: Atmega328p
         */


        RadioButton answer_question1 = findViewById(R.id.question1_option1);
        Boolean answer1;
        answer1 = answer_question1.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }
        /**
         * Question Two
         * Answer: Option 2: Pico-Power
         */
        Boolean answer2;
        RadioButton answer_question2 = findViewById(R.id.question2_option2);
        answer2 = answer_question2.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        /**
         * Question Three
         * Answer: modules
         */


        EditText answer_question3 = findViewById(R.id.question3_answer);
        String answer3;
        answer3 = answer_question3.getText().toString().toLowerCase();
        if (answer3.equals("modules")) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        /**
         *Question Four
         * Answer: Option
         *
         */

        RadioButton answer_question4 = findViewById(R.id.question4_option4);
        Boolean answer4 = answer_question4.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        /**
         * Question Five
         * Answer: sketch
         */


        EditText answer_question5 = findViewById(R.id.question5_answer);

        String answer5 = answer_question5.getText().toString().toLowerCase();
        if (answer5.equals("sketch")) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        /**
         * Question Six
         * Answer: Option1 and 4
         */


        CheckBox option1 = findViewById(R.id.question6_option1);
        CheckBox option2 = findViewById(R.id.question6_option2);
        CheckBox option3 = findViewById(R.id.question6_option3);
        CheckBox option4 = findViewById(R.id.question6_option4);

        Boolean answer6_option1 = option1.isChecked();
        Boolean answer6_option2 = option2.isChecked();
        Boolean answer6_option3 = option3.isChecked();
        Boolean answer6_option4 = option4.isChecked();
        if (!answer6_option1 && answer6_option2 && !answer6_option3 && answer6_option4) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        /**
         * Question Seven
         * Answer: Option
         */


        RadioButton answer_question7 = findViewById(R.id.question7_option2);

        Boolean answer7 = answer_question7.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        /**
         * Question Eight
         * Answer: Option
         */

        EditText answer_question8 = findViewById(R.id.question8_answer);

        String answer8 = answer_question8.getText().toString().toLowerCase();
        if (answer8.equals("shield")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        /**
         * Question Nine
         * Answer: Yes
         */

        ToggleButton answer_question9 = findViewById(R.id.togglebutton);
        Boolean answer9 = answer_question9.isChecked();
        if (answer9) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        /**
         * Question Ten
         * Answer: Massimo Banzi
         */


        RadioButton answer_question10 = findViewById(R.id.question10_option3);
        Boolean answer10 = answer_question10.isChecked();
        if (answer10) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        /**
         * Calculation of the Final score
         *
         */
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void exit(View view) {
        finish();
    }
}
