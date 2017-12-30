package com.example.android.newyearquiz;

import android.content.Intent;
import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.newyearquiz.databinding.ActivityInventionsBinding;

import java.io.StringBufferInputStream;

public class InventionsActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    ActivityInventionsBinding activityInventionsBinding;

    // Number of the current question
    int currentQuestion = 1;
    // Total number of questions
    int totalNumberOfQuestions = 10;
    // Correct answers counter
    int correct_score = 0;
    // Incorrect answers counter
    int incorrect_score = 0;
    // Here we declare a variable to store player's name
    String name;
    // Here we declare a variable for the quiz results toast
    String resultMessage;
    // Here we declare a variable to store a string "Question (current question number) out of (total number of questions)"
    String qnum;
    int[] question_ids = {R.id.inv_question1_number, R.id.inv_question2_number, R.id.inv_question3_number, R.id.inv_question4_number,
            R.id.inv_question5_number, R.id.inv_question6_number, R.id.inv_question7_number, R.id.inv_question8_number,
            R.id.inv_question9_number, R.id.inv_question10_number};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityInventionsBinding = DataBindingUtil.setContentView(this, R.layout.activity_inventions);
        activityInventionsBinding.radioGroup1.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup2.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup3.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup4.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup5.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup6.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup7.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup8.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup9.setOnCheckedChangeListener(this);
        activityInventionsBinding.radioGroup10.setOnCheckedChangeListener(this);
        activityInventionsBinding.buttonToMain.setOnClickListener(this);
        activityInventionsBinding.submitButton.setOnClickListener(this);
        activityInventionsBinding.shareButton.setOnClickListener(this);
        //Here we call methods to fill layout with questions and answers
        Question1();
        Question2();
        Question3();
        Question4();
        Question5();
        Question6();
        Question7();
        Question8();
        Question9();
        Question10();
    }

    // Method which fills layout with question 1 and it's answer and answer variants
    public void Question1() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion1Number.setText(qnum);
    }

    // Method which fills layout with question 2 and it's answer and answer variants
    public void Question2() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion2Number.setText(qnum);
    }

    // Method which fills layout with question 3 and it's answer and answer variants
    public void Question3() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion3Number.setText(qnum);
    }

    // Method which fills layout with question 4 and it's answer and answer variants
    public void Question4() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion4Number.setText(qnum);
    }

    // Method which fills layout with question 5 and it's answer and answer variants
    public void Question5() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion5Number.setText(qnum);
    }

    // Method which fills layout with question 6 and it's answer and answer variants
    public void Question6() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion6Number.setText(qnum);
    }

    // Method which fills layout with question 7 and it's answer and answer variants
    public void Question7() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion7Number.setText(qnum);
    }

    // Method which fills layout with question 8 and it's answer and answer variants
    public void Question8() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion8Number.setText(qnum);
    }

    // Method which fills layout with question 9 and it's answer and answer variants
    public void Question9() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion9Number.setText(qnum);
    }

    // Method which fills layout with question 10 and it's answer and answer variants
    public void Question10() {
        currentQuestion++;
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        activityInventionsBinding.invQuestion10Number.setText(qnum);
    }

    // This method checks the answers, shows whether the wrong or the right one was chosen by the player, shows correct answer, counts correct and incorrect scores.
    public void onCheckedChanged(RadioGroup radioGroup, int CheckedRadioButtonId) {
        if (radioGroup == activityInventionsBinding.radioGroup1) {
            switch (CheckedRadioButtonId) {
                case R.id.answer1_1:
                    activityInventionsBinding.answer11.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer12.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer13.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer14.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer12.setEnabled(false);
                    activityInventionsBinding.answer13.setEnabled(false);
                    activityInventionsBinding.answer14.setEnabled(false);
                    break;
                case R.id.answer1_2:
                    activityInventionsBinding.answer12.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer11.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer13.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer14.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer11.setEnabled(false);
                    activityInventionsBinding.answer13.setEnabled(false);
                    activityInventionsBinding.answer14.setEnabled(false);
                    break;
                case R.id.answer1_3:
                    activityInventionsBinding.answer13.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer11.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer12.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer14.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer11.setEnabled(false);
                    activityInventionsBinding.answer12.setEnabled(false);
                    activityInventionsBinding.answer14.setEnabled(false);
                    break;
                case R.id.answer1_4:
                    activityInventionsBinding.answer14.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer11.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer12.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer13.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer11.setEnabled(false);
                    activityInventionsBinding.answer12.setEnabled(false);
                    activityInventionsBinding.answer13.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup2) {
            switch (CheckedRadioButtonId) {
                case R.id.answer2_1:
                    activityInventionsBinding.answer21.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer22.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer23.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer24.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer22.setEnabled(false);
                    activityInventionsBinding.answer23.setEnabled(false);
                    activityInventionsBinding.answer24.setEnabled(false);
                    break;
                case R.id.answer2_2:
                    activityInventionsBinding.answer22.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer21.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer23.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer24.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer21.setEnabled(false);
                    activityInventionsBinding.answer23.setEnabled(false);
                    activityInventionsBinding.answer24.setEnabled(false);
                    break;
                case R.id.answer2_3:
                    activityInventionsBinding.answer23.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer21.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer22.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer24.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer21.setEnabled(false);
                    activityInventionsBinding.answer22.setEnabled(false);
                    activityInventionsBinding.answer24.setEnabled(false);
                    break;
                case R.id.answer2_4:
                    activityInventionsBinding.answer24.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer21.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer22.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer23.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer21.setEnabled(false);
                    activityInventionsBinding.answer22.setEnabled(false);
                    activityInventionsBinding.answer23.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup3) {
            switch (CheckedRadioButtonId) {
                case R.id.answer3_1:
                    activityInventionsBinding.answer31.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer32.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer33.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer34.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer32.setEnabled(false);
                    activityInventionsBinding.answer33.setEnabled(false);
                    activityInventionsBinding.answer34.setEnabled(false);
                    break;
                case R.id.answer3_2:
                    activityInventionsBinding.answer32.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer31.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer33.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer34.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer31.setEnabled(false);
                    activityInventionsBinding.answer33.setEnabled(false);
                    activityInventionsBinding.answer34.setEnabled(false);
                    break;
                case R.id.answer3_3:
                    activityInventionsBinding.answer33.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer31.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer32.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer34.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer31.setEnabled(false);
                    activityInventionsBinding.answer32.setEnabled(false);
                    activityInventionsBinding.answer34.setEnabled(false);
                    break;
                case R.id.answer3_4:
                    activityInventionsBinding.answer34.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer31.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer32.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer33.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer31.setEnabled(false);
                    activityInventionsBinding.answer32.setEnabled(false);
                    activityInventionsBinding.answer33.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup4) {
            switch (CheckedRadioButtonId) {
                case R.id.answer4_1:
                    activityInventionsBinding.answer41.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer42.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer43.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer44.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer42.setEnabled(false);
                    activityInventionsBinding.answer43.setEnabled(false);
                    activityInventionsBinding.answer44.setEnabled(false);
                    break;
                case R.id.answer4_2:
                    activityInventionsBinding.answer42.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer41.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer43.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer44.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer41.setEnabled(false);
                    activityInventionsBinding.answer43.setEnabled(false);
                    activityInventionsBinding.answer44.setEnabled(false);
                    break;
                case R.id.answer4_3:
                    activityInventionsBinding.answer43.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer41.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer42.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer44.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer41.setEnabled(false);
                    activityInventionsBinding.answer42.setEnabled(false);
                    activityInventionsBinding.answer44.setEnabled(false);
                    break;
                case R.id.answer4_4:
                    activityInventionsBinding.answer44.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer41.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer42.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer43.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer41.setEnabled(false);
                    activityInventionsBinding.answer42.setEnabled(false);
                    activityInventionsBinding.answer43.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup5) {
            switch (CheckedRadioButtonId) {
                case R.id.answer5_1:
                    activityInventionsBinding.answer51.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer52.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer53.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer54.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer52.setEnabled(false);
                    activityInventionsBinding.answer53.setEnabled(false);
                    activityInventionsBinding.answer54.setEnabled(false);
                    break;
                case R.id.answer5_2:
                    activityInventionsBinding.answer52.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer51.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer53.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer54.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer51.setEnabled(false);
                    activityInventionsBinding.answer53.setEnabled(false);
                    activityInventionsBinding.answer54.setEnabled(false);
                    break;
                case R.id.answer5_3:
                    activityInventionsBinding.answer53.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer51.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer52.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer54.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer51.setEnabled(false);
                    activityInventionsBinding.answer52.setEnabled(false);
                    activityInventionsBinding.answer54.setEnabled(false);
                    break;
                case R.id.answer5_4:
                    activityInventionsBinding.answer54.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer51.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer52.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer53.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer51.setEnabled(false);
                    activityInventionsBinding.answer52.setEnabled(false);
                    activityInventionsBinding.answer53.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup6) {
            switch (CheckedRadioButtonId) {
                case R.id.answer6_1:
                    activityInventionsBinding.answer61.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer62.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer63.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer64.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer62.setEnabled(false);
                    activityInventionsBinding.answer63.setEnabled(false);
                    activityInventionsBinding.answer64.setEnabled(false);
                    break;
                case R.id.answer6_2:
                    activityInventionsBinding.answer62.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer61.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer63.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer64.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer61.setEnabled(false);
                    activityInventionsBinding.answer63.setEnabled(false);
                    activityInventionsBinding.answer64.setEnabled(false);
                    break;
                case R.id.answer6_3:
                    activityInventionsBinding.answer63.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer61.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer62.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer64.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer61.setEnabled(false);
                    activityInventionsBinding.answer62.setEnabled(false);
                    activityInventionsBinding.answer64.setEnabled(false);
                    break;
                case R.id.answer6_4:
                    activityInventionsBinding.answer64.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer61.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer62.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer63.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer61.setEnabled(false);
                    activityInventionsBinding.answer62.setEnabled(false);
                    activityInventionsBinding.answer63.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup7) {
            switch (CheckedRadioButtonId) {
                case R.id.answer7_1:
                    activityInventionsBinding.answer71.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer72.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer73.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer74.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer72.setEnabled(false);
                    activityInventionsBinding.answer73.setEnabled(false);
                    activityInventionsBinding.answer74.setEnabled(false);
                    break;
                case R.id.answer7_2:
                    activityInventionsBinding.answer72.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer71.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer73.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer74.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer71.setEnabled(false);
                    activityInventionsBinding.answer73.setEnabled(false);
                    activityInventionsBinding.answer74.setEnabled(false);
                    break;
                case R.id.answer7_3:
                    activityInventionsBinding.answer73.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer71.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer72.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer74.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer71.setEnabled(false);
                    activityInventionsBinding.answer72.setEnabled(false);
                    activityInventionsBinding.answer74.setEnabled(false);
                    break;
                case R.id.answer7_4:
                    activityInventionsBinding.answer74.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer71.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer72.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer73.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer71.setEnabled(false);
                    activityInventionsBinding.answer72.setEnabled(false);
                    activityInventionsBinding.answer73.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup8) {
            switch (CheckedRadioButtonId) {
                case R.id.answer8_1:
                    activityInventionsBinding.answer81.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer82.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer83.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer84.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer82.setEnabled(false);
                    activityInventionsBinding.answer83.setEnabled(false);
                    activityInventionsBinding.answer84.setEnabled(false);
                    break;
                case R.id.answer8_2:
                    activityInventionsBinding.answer82.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer81.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer83.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer84.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer81.setEnabled(false);
                    activityInventionsBinding.answer83.setEnabled(false);
                    activityInventionsBinding.answer84.setEnabled(false);
                    break;
                case R.id.answer8_3:
                    activityInventionsBinding.answer83.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer81.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer82.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer84.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer81.setEnabled(false);
                    activityInventionsBinding.answer82.setEnabled(false);
                    activityInventionsBinding.answer84.setEnabled(false);
                    break;
                case R.id.answer8_4:
                    activityInventionsBinding.answer84.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer81.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer82.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer83.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer81.setEnabled(false);
                    activityInventionsBinding.answer82.setEnabled(false);
                    activityInventionsBinding.answer83.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup9) {
            switch (CheckedRadioButtonId) {
                case R.id.answer9_1:
                    activityInventionsBinding.answer91.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer92.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer93.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer94.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer92.setEnabled(false);
                    activityInventionsBinding.answer93.setEnabled(false);
                    activityInventionsBinding.answer94.setEnabled(false);
                    break;
                case R.id.answer9_2:
                    activityInventionsBinding.answer92.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer91.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer93.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer94.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer91.setEnabled(false);
                    activityInventionsBinding.answer93.setEnabled(false);
                    activityInventionsBinding.answer94.setEnabled(false);
                    break;
                case R.id.answer9_3:
                    activityInventionsBinding.answer93.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer91.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer92.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer94.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer91.setEnabled(false);
                    activityInventionsBinding.answer92.setEnabled(false);
                    activityInventionsBinding.answer94.setEnabled(false);
                    break;
                case R.id.answer9_4:
                    activityInventionsBinding.answer94.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer91.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer92.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer93.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer91.setEnabled(false);
                    activityInventionsBinding.answer92.setEnabled(false);
                    activityInventionsBinding.answer93.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == activityInventionsBinding.radioGroup10) {
            switch (CheckedRadioButtonId) {
                case R.id.answer10_1:
                    activityInventionsBinding.answer101.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer102.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer103.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer104.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer102.setEnabled(false);
                    activityInventionsBinding.answer103.setEnabled(false);
                    activityInventionsBinding.answer104.setEnabled(false);
                    break;
                case R.id.answer10_2:
                    activityInventionsBinding.answer102.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer101.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer103.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer104.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer101.setEnabled(false);
                    activityInventionsBinding.answer103.setEnabled(false);
                    activityInventionsBinding.answer104.setEnabled(false);
                    break;
                case R.id.answer10_3:
                    activityInventionsBinding.answer103.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer101.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer102.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer104.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer101.setEnabled(false);
                    activityInventionsBinding.answer102.setEnabled(false);
                    activityInventionsBinding.answer104.setEnabled(false);
                    break;
                case R.id.answer10_4:
                    activityInventionsBinding.answer104.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    activityInventionsBinding.answer101.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer102.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer103.setTextColor(getResources().getColor(R.color.questions_color));
                    activityInventionsBinding.answer101.setEnabled(false);
                    activityInventionsBinding.answer102.setEnabled(false);
                    activityInventionsBinding.answer103.setEnabled(false);
                    break;
            }
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_to_main:
                mainActivity();
                break;
            case R.id.submit_button:
                submit();
                break;
            case R.id.share_button:
                share();
                break;
        }
    }

    // This method is called by clicking on Submit button. It checks if at least one answer has been selected in the quiz, and if not, asks to choose, and if so, creates and displays a toast with the results of the game.
    public void submit() {
        if (!activityInventionsBinding.answer11.isChecked() && !activityInventionsBinding.answer12.isChecked() && !activityInventionsBinding.answer13.isChecked() && !activityInventionsBinding.answer14.isChecked() &&
                !activityInventionsBinding.answer21.isChecked() && !activityInventionsBinding.answer22.isChecked() && !activityInventionsBinding.answer23.isChecked() && !activityInventionsBinding.answer24.isChecked() &&
                !activityInventionsBinding.answer31.isChecked() && !activityInventionsBinding.answer32.isChecked() && !activityInventionsBinding.answer33.isChecked() && !activityInventionsBinding.answer34.isChecked() &&
                !activityInventionsBinding.answer41.isChecked() && !activityInventionsBinding.answer42.isChecked() && !activityInventionsBinding.answer43.isChecked() && !activityInventionsBinding.answer44.isChecked() &&
                !activityInventionsBinding.answer51.isChecked() && !activityInventionsBinding.answer52.isChecked() && !activityInventionsBinding.answer53.isChecked() && !activityInventionsBinding.answer54.isChecked() &&
                !activityInventionsBinding.answer61.isChecked() && !activityInventionsBinding.answer62.isChecked() && !activityInventionsBinding.answer63.isChecked() && !activityInventionsBinding.answer64.isChecked() &&
                !activityInventionsBinding.answer71.isChecked() && !activityInventionsBinding.answer72.isChecked() && !activityInventionsBinding.answer73.isChecked() && !activityInventionsBinding.answer74.isChecked() &&
                !activityInventionsBinding.answer81.isChecked() && !activityInventionsBinding.answer82.isChecked() && !activityInventionsBinding.answer83.isChecked() && !activityInventionsBinding.answer84.isChecked() &&
                !activityInventionsBinding.answer91.isChecked() && !activityInventionsBinding.answer92.isChecked() && !activityInventionsBinding.answer93.isChecked() && !activityInventionsBinding.answer94.isChecked() &&
                !activityInventionsBinding.answer101.isChecked() && !activityInventionsBinding.answer102.isChecked() && !activityInventionsBinding.answer103.isChecked() && !activityInventionsBinding.answer104.isChecked()) {
            Toast.makeText(this, R.string.not_chosen1, Toast.LENGTH_SHORT).show();
            return;
        } else {
            Intent openInventionsQuiz = getIntent();
            name = openInventionsQuiz.getStringExtra(MainActivity.EXTRA_MESSAGE);
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
}