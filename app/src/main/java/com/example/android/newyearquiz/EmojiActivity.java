package com.example.android.newyearquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EmojiActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    // Number of the current question
    int currentQuestion = 1;
    // Total number of questions
    int totalNumberOfQuestions = 10;
    // Correct answers counter
    int correct_score = 0;
    // Incorrect answers counter
    int incorrect_score = 0;
    // Here we declare a variable to store the question number
    TextView question_number;
    // Here we declare variables for correct answer variants
    RadioButton answer1_3, answer2_4, answer3_2, answer4_1, answer5_3,
            answer6_4, answer7_1, answer8_2, answer9_4, answer10_1;
    // Here we declare variables for answer's images
    ImageView answer_image1, answer_image2, answer_image3, answer_image4, answer_image5,
            answer_image6, answer_image7, answer_image8, answer_image9, answer_image10;
    // Here we declare RadioGroups
    RadioGroup rg1, rg2, rg3, rg4, rg5, rg6, rg7, rg8, rg9, rg10;
    // Here we declare Buttons
    Button buttonToMain, submitButton, shareButton;
    // Here we declare a variable to store player's name
    String name;
    // Here we declare a variable for the quiz results toast
    String resultMessage;
    // Here we declare a variable to store a string "Question (current question number) out of (total number of questions)"
    String qnum;
    // This is an array of id's of question numbers
    int[] question_numbers = {R.id.question1_number, R.id.question2_number, R.id.question3_number, R.id.question4_number, R.id.question5_number,
            R.id.question6_number, R.id.question7_number, R.id.question8_number, R.id.question9_number, R.id.question10_number};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoji);
        // Here we initialize RadioGroups
        rg1 = findViewById(R.id.radio_group1);
        rg2 = findViewById(R.id.radio_group2);
        rg3 = findViewById(R.id.radio_group3);
        rg4 = findViewById(R.id.radio_group4);
        rg5 = findViewById(R.id.radio_group5);
        rg6 = findViewById(R.id.radio_group6);
        rg7 = findViewById(R.id.radio_group7);
        rg8 = findViewById(R.id.radio_group8);
        rg9 = findViewById(R.id.radio_group9);
        rg10 = findViewById(R.id.radio_group10);
        // Here we set the listener to the RadioGroups
        rg1.setOnCheckedChangeListener(this);
        rg2.setOnCheckedChangeListener(this);
        rg3.setOnCheckedChangeListener(this);
        rg4.setOnCheckedChangeListener(this);
        rg5.setOnCheckedChangeListener(this);
        rg6.setOnCheckedChangeListener(this);
        rg7.setOnCheckedChangeListener(this);
        rg8.setOnCheckedChangeListener(this);
        rg9.setOnCheckedChangeListener(this);
        rg10.setOnCheckedChangeListener(this);
        // Here we initialize correct answers
        answer1_3 = (RadioButton) findViewById(R.id.answer1_3);
        answer2_4 = (RadioButton) findViewById(R.id.answer2_4);
        answer3_2 = (RadioButton) findViewById(R.id.answer3_2);
        answer4_1 = (RadioButton) findViewById(R.id.answer4_1);
        answer5_3 = (RadioButton) findViewById(R.id.answer5_3);
        answer6_4 = (RadioButton) findViewById(R.id.answer6_4);
        answer7_1 = (RadioButton) findViewById(R.id.answer7_1);
        answer8_2 = (RadioButton) findViewById(R.id.answer8_2);
        answer9_4 = (RadioButton) findViewById(R.id.answer9_4);
        answer10_1 = (RadioButton) findViewById(R.id.answer10_1);
        // Here we initialize correct answer's images
        answer_image1 = (ImageView) findViewById(R.id.answer1);
        answer_image2 = (ImageView) findViewById(R.id.answer2);
        answer_image3 = (ImageView) findViewById(R.id.answer3);
        answer_image4 = (ImageView) findViewById(R.id.answer4);
        answer_image5 = (ImageView) findViewById(R.id.answer5);
        answer_image6 = (ImageView) findViewById(R.id.answer6);
        answer_image7 = (ImageView) findViewById(R.id.answer7);
        answer_image8 = (ImageView) findViewById(R.id.answer8);
        answer_image9 = (ImageView) findViewById(R.id.answer9);
        answer_image10 = (ImageView) findViewById(R.id.answer10);
        // Here we initialize Buttons
        buttonToMain = (Button) findViewById(R.id.button_to_main);
        submitButton = (Button) findViewById(R.id.submit_button);
        shareButton = (Button) findViewById(R.id.share_button);
        // Here we set the listener to the Buttons
        buttonToMain.setOnClickListener(this);
        submitButton.setOnClickListener(this);
        shareButton.setOnClickListener(this);
        // Here we set numbers of the questions
        setQuestion_numbers();
    }

    // This method set numbers to the questions
    public void setQuestion_numbers() {
        for (int j = 0; j < question_numbers.length; j++) {
            question_number = findViewById(question_numbers[j]);
            qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
            question_number.setText(qnum);
            currentQuestion++;
        }
    }

    /**
     * This method checks the answers, shows whether the wrong or the right one was chosen by the player,
     * shows correct answer, counts correct and incorrect scores, disables RadioButtons of the RadioGroup
     * when the answer in it is chosen.
     */
    public void onCheckedChanged(RadioGroup radioGroup, int CheckedRadioButtonId) {
        // Checking RadioGroup 1
        if (radioGroup == rg1) {
            RadioButton checked_answer1 = (RadioButton) findViewById(rg1.getCheckedRadioButtonId());
            if (answer1_3.isChecked()) {
                answer1_3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image1.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image1.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg1.getChildCount(); i++) {
                (rg1.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 2
        if (radioGroup == rg2) {
            RadioButton checked_answer2 = (RadioButton) findViewById(rg2.getCheckedRadioButtonId());
            if (answer2_4.isChecked()) {
                answer2_4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image2.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image2.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg2
            for (int i = 0; i < rg2.getChildCount(); i++) {
                (rg2.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 3
        if (radioGroup == rg3) {
            RadioButton checked_answer3 = (RadioButton) findViewById(rg3.getCheckedRadioButtonId());
            if (answer3_2.isChecked()) {
                answer3_2.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image3.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image3.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg3
            for (int i = 0; i < rg3.getChildCount(); i++) {
                (rg3.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 4
        if (radioGroup == rg4) {
            RadioButton checked_answer4 = (RadioButton) findViewById(rg4.getCheckedRadioButtonId());
            if (answer4_1.isChecked()) {
                answer4_1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image4.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image4.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg4
            for (int i = 0; i < rg4.getChildCount(); i++) {
                (rg4.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 5
        if (radioGroup == rg5) {
            RadioButton checked_answer5 = (RadioButton) findViewById(rg5.getCheckedRadioButtonId());
            if (answer5_3.isChecked()) {
                answer5_3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image5.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer5.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image5.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg5
            for (int i = 0; i < rg5.getChildCount(); i++) {
                (rg5.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 6
        if (radioGroup == rg6) {
            RadioButton checked_answer6 = (RadioButton) findViewById(rg6.getCheckedRadioButtonId());
            if (answer6_4.isChecked()) {
                answer6_4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image6.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer6.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image6.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg6
            for (int i = 0; i < rg6.getChildCount(); i++) {
                (rg6.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 7
        if (radioGroup == rg7) {
            RadioButton checked_answer7 = (RadioButton) findViewById(rg7.getCheckedRadioButtonId());
            if (answer7_1.isChecked()) {
                answer7_1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image7.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer7.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image7.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg7
            for (int i = 0; i < rg7.getChildCount(); i++) {
                (rg7.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 8
        if (radioGroup == rg8) {
            RadioButton checked_answer8 = (RadioButton) findViewById(rg8.getCheckedRadioButtonId());
            if (answer8_2.isChecked()) {
                answer8_2.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image8.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer8.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image8.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg8
            for (int i = 0; i < rg8.getChildCount(); i++) {
                (rg8.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 9
        if (radioGroup == rg9) {
            RadioButton checked_answer9 = (RadioButton) findViewById(rg9.getCheckedRadioButtonId());
            if (answer9_4.isChecked()) {
                answer9_4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image9.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer9.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image9.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg9
            for (int i = 0; i < rg9.getChildCount(); i++) {
                (rg9.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 10
        if (radioGroup == rg10) {
            RadioButton checked_answer10 = (RadioButton) findViewById(rg10.getCheckedRadioButtonId());
            if (answer10_1.isChecked()) {
                answer10_1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image10.setVisibility(View.VISIBLE);
                correct_score++;
            } else {
                checked_answer10.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image10.setVisibility(View.VISIBLE);
                incorrect_score++;
            }
            // Disable RadioButtons of rg10
            for (int i = 0; i < rg10.getChildCount(); i++) {
                (rg10.getChildAt(i)).setEnabled(false);
            }
        }
    }

    /**
     * This method is called by clicking on Submit button. It checks if at least one answer
     * has been selected in the quiz, and if not, asks to choose, and if so, creates and displays
     * a toast with the results of the game.
     */
    public void submit() {
        if ((rg1.getCheckedRadioButtonId() == -1) && (rg2.getCheckedRadioButtonId() == -1) && (rg3.getCheckedRadioButtonId() == -1) &&
                (rg4.getCheckedRadioButtonId() == -1) && (rg5.getCheckedRadioButtonId() == -1) && (rg6.getCheckedRadioButtonId() == -1) &&
                (rg7.getCheckedRadioButtonId() == -1) && (rg8.getCheckedRadioButtonId() == -1) && (rg9.getCheckedRadioButtonId() == -1) &&
                (rg10.getCheckedRadioButtonId() == -1)) {
            Toast.makeText(this, R.string.not_chosen1, Toast.LENGTH_SHORT).show();
            return;
        } else {
            Intent openEmojiQuiz = getIntent();
            name = openEmojiQuiz.getStringExtra(MainActivity.EXTRA_MESSAGE);
            String resultMessage = createQuizSummary(name, correct_score, incorrect_score, totalNumberOfQuestions);
            Toast.makeText(getApplicationContext(), resultMessage, Toast.LENGTH_LONG).show();
        }
    }

    // This method creates Quiz summary.
    private String createQuizSummary(String name, int correct_score, int incorrect_score, int totalNumberOfQuestions) {
        resultMessage = getString(R.string.nameSummary, name);
        resultMessage += "\n" + getString(R.string.well_done);
        resultMessage += "\n" + getString(R.string.results);
        resultMessage += "\n" + getString(R.string.total_correct, correct_score, totalNumberOfQuestions);
        resultMessage += "\n" + getString(R.string.total_incorrect, incorrect_score, totalNumberOfQuestions);
        resultMessage += "\n" + getString(R.string.tryAnother);
        return resultMessage;
    }

    // This method is called by clicking on Main screen button. It returns the user to the Main screen.
    public void mainActivity() {
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
        this.finish();
    }

    // This method is called by clicking on Share button. It allows to share your game results via e-mail, social apps, etc.
    public void share() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, resultMessage);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quiz results");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_to_main:
                mainActivity();
                this.finish();
                break;
            case R.id.submit_button:
                submit();
                break;
            case R.id.share_button:
                share();
                break;
        }
    }

    // This method is called by clicking on Back button. It returns the user to the Main screen and kills this activity.
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }
}
