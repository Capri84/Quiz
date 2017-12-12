package com.example.android.newyearquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EmojiActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    // Номер текущего вопроса
    int currentQuestion = 1;
    // Общее количество вопросов
    int totalNumberOfQuestions = 10;
    // Счетчик правильных ответов игрока
    int correct_score = 0;
    // Счетчик неправильных ответов игрока
    int incorrect_score = 0;
    //Тут мы создаем переменную для хранения номера вопроса
    TextView question_number;
    //Тут мы создаем переменную для хранения задания
    ImageView question_image;
    //Тут мы создаем переменные для хранения вариантов ответов
    RadioButton answer1_1;
    RadioButton answer1_2;
    RadioButton answer1_3;
    RadioButton answer1_4;
    RadioButton answer2_1;
    RadioButton answer2_2;
    RadioButton answer2_3;
    RadioButton answer2_4;
    RadioButton answer3_1;
    RadioButton answer3_2;
    RadioButton answer3_3;
    RadioButton answer3_4;
    RadioButton answer4_1;
    RadioButton answer4_2;
    RadioButton answer4_3;
    RadioButton answer4_4;
    RadioButton answer5_1;
    RadioButton answer5_2;
    RadioButton answer5_3;
    RadioButton answer5_4;
    RadioButton answer6_1;
    RadioButton answer6_2;
    RadioButton answer6_3;
    RadioButton answer6_4;
    RadioButton answer7_1;
    RadioButton answer7_2;
    RadioButton answer7_3;
    RadioButton answer7_4;
    RadioButton answer8_1;
    RadioButton answer8_2;
    RadioButton answer8_3;
    RadioButton answer8_4;
    RadioButton answer9_1;
    RadioButton answer9_2;
    RadioButton answer9_3;
    RadioButton answer9_4;
    RadioButton answer10_1;
    RadioButton answer10_2;
    RadioButton answer10_3;
    RadioButton answer10_4;
    //Тут мы создаем переменную для хранения ответов
    ImageView answer_image1;
    ImageView answer_image2;
    ImageView answer_image3;
    ImageView answer_image4;
    ImageView answer_image5;
    ImageView answer_image6;
    ImageView answer_image7;
    ImageView answer_image8;
    ImageView answer_image9;
    ImageView answer_image10;

    //RadioGroups
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;
    RadioGroup rg6;
    RadioGroup rg7;
    RadioGroup rg8;
    RadioGroup rg9;
    RadioGroup rg10;

    String name;
    String resultMessage;
    String qnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoji);

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

    public void Question1() {
        question_number = findViewById(R.id.question1_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image1);
        question_image.setImageResource(R.drawable.forrest_gump);
        answer1_1 = findViewById(R.id.answer1_1);
        answer1_1.setText(R.string.em_q1_var_1);
        answer1_2 = findViewById(R.id.answer1_2);
        answer1_2.setText(R.string.em_q1_var_2);
        answer1_3 = findViewById(R.id.answer1_3);
        answer1_3.setText(R.string.em_q1_var_3);
        answer1_4 = findViewById(R.id.answer1_4);
        answer1_4.setText(R.string.em_q1_var_4);
        answer_image1 = findViewById(R.id.answer1);
        answer_image1.setImageResource(R.drawable.forrest_gump_answer1);
        answer_image1.setVisibility(View.INVISIBLE);
    }

    public void Question2() {
        currentQuestion++;
        question_number = findViewById(R.id.question2_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image2);
        question_image.setImageResource(R.drawable.mib);
        answer2_1 = findViewById(R.id.answer2_1);
        answer2_1.setText(R.string.em_q2_var_1);
        answer2_2 = findViewById(R.id.answer2_2);
        answer2_2.setText(R.string.em_q2_var_2);
        answer2_3 = findViewById(R.id.answer2_3);
        answer2_3.setText(R.string.em_q2_var_3);
        answer2_4 = findViewById(R.id.answer2_4);
        answer2_4.setText(R.string.em_q2_var_4);
        answer_image2 = findViewById(R.id.answer2);
        answer_image2.setImageResource(R.drawable.mib_answer);
        answer_image2.setVisibility(View.INVISIBLE);
    }

    public void Question3() {
        currentQuestion++;
        question_number = findViewById(R.id.question3_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image3);
        question_image.setImageResource(R.drawable.breakfast_at_tiffany);
        answer3_1 = findViewById(R.id.answer3_1);
        answer3_1.setText(R.string.em_q3_var_1);
        answer3_2 = findViewById(R.id.answer3_2);
        answer3_2.setText(R.string.em_q3_var_2);
        answer3_3 = findViewById(R.id.answer3_3);
        answer3_3.setText(R.string.em_q3_var_3);
        answer3_4 = findViewById(R.id.answer3_4);
        answer3_4.setText(R.string.em_q3_var_4);
        answer_image3 = findViewById(R.id.answer3);
        answer_image3.setImageResource(R.drawable.breakfast_tiffany_answer);
        answer_image3.setVisibility(View.INVISIBLE);
    }

    public void Question4() {
        currentQuestion++;
        question_number = findViewById(R.id.question4_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image4);
        question_image.setImageResource(R.drawable.mask);
        answer4_1 = findViewById(R.id.answer4_1);
        answer4_1.setText(R.string.em_q4_var_1);
        answer4_2 = findViewById(R.id.answer4_2);
        answer4_2.setText(R.string.em_q4_var_2);
        answer4_3 = findViewById(R.id.answer4_3);
        answer4_3.setText(R.string.em_q4_var_3);
        answer4_4 = findViewById(R.id.answer4_4);
        answer4_4.setText(R.string.em_q4_var_4);
        answer_image4 = findViewById(R.id.answer4);
        answer_image4.setImageResource(R.drawable.mask_answer);
        answer_image4.setVisibility(View.INVISIBLE);
    }

    public void Question5() {
        currentQuestion++;
        question_number = findViewById(R.id.question5_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image5);
        question_image.setImageResource(R.drawable.lamb_silence);
        answer5_1 = findViewById(R.id.answer5_1);
        answer5_1.setText(R.string.em_q5_var_1);
        answer5_2 = findViewById(R.id.answer5_2);
        answer5_2.setText(R.string.em_q5_var_2);
        answer5_3 = findViewById(R.id.answer5_3);
        answer5_3.setText(R.string.em_q5_var_3);
        answer5_4 = findViewById(R.id.answer5_4);
        answer5_4.setText(R.string.em_q5_var_4);
        answer_image5 = findViewById(R.id.answer5);
        answer_image5.setImageResource(R.drawable.lambs_answer);
        answer_image5.setVisibility(View.INVISIBLE);
    }

    public void Question6() {
        currentQuestion++;
        question_number = findViewById(R.id.question6_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image6);
        question_image.setImageResource(R.drawable.devil_prada);
        answer6_1 = findViewById(R.id.answer6_1);
        answer6_1.setText(R.string.em_q6_var_1);
        answer6_2 = findViewById(R.id.answer6_2);
        answer6_2.setText(R.string.em_q6_var_2);
        answer6_3 = findViewById(R.id.answer6_3);
        answer6_3.setText(R.string.em_q6_var_3);
        answer6_4 = findViewById(R.id.answer6_4);
        answer6_4.setText(R.string.em_q6_var_4);
        answer_image6 = findViewById(R.id.answer6);
        answer_image6.setImageResource(R.drawable.prada_answer);
        answer_image6.setVisibility(View.INVISIBLE);
    }

    public void Question7() {
        currentQuestion++;
        question_number = findViewById(R.id.question7_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image7);
        question_image.setImageResource(R.drawable.signs);
        answer7_1 = findViewById(R.id.answer7_1);
        answer7_1.setText(R.string.em_q7_var_1);
        answer7_2 = findViewById(R.id.answer7_2);
        answer7_2.setText(R.string.em_q7_var_2);
        answer7_3 = findViewById(R.id.answer7_3);
        answer7_3.setText(R.string.em_q7_var_3);
        answer7_4 = findViewById(R.id.answer7_4);
        answer7_4.setText(R.string.em_q7_var_4);
        answer_image7 = findViewById(R.id.answer7);
        answer_image7.setImageResource(R.drawable.signs_answer);
        answer_image7.setVisibility(View.INVISIBLE);
    }

    public void Question8() {
        currentQuestion++;
        question_number = findViewById(R.id.question8_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image8);
        question_image.setImageResource(R.drawable.matrix);
        answer8_1 = findViewById(R.id.answer8_1);
        answer8_1.setText(R.string.em_q8_var_1);
        answer8_2 = findViewById(R.id.answer8_2);
        answer8_2.setText(R.string.em_q8_var_2);
        answer8_3 = findViewById(R.id.answer8_3);
        answer8_3.setText(R.string.em_q8_var_3);
        answer8_4 = findViewById(R.id.answer8_4);
        answer8_4.setText(R.string.em_q8_var_4);
        answer_image8 = findViewById(R.id.answer8);
        answer_image8.setImageResource(R.drawable.matrix_answer);
        answer_image8.setVisibility(View.INVISIBLE);
    }

    public void Question9() {
        currentQuestion++;
        question_number = findViewById(R.id.question9_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image9);
        question_image.setImageResource(R.drawable.ted);
        answer9_1 = findViewById(R.id.answer9_1);
        answer9_1.setText(R.string.em_q9_var_1);
        answer9_2 = findViewById(R.id.answer9_2);
        answer9_2.setText(R.string.em_q9_var_2);
        answer9_3 = findViewById(R.id.answer9_3);
        answer9_3.setText(R.string.em_q9_var_3);
        answer9_4 = findViewById(R.id.answer9_4);
        answer9_4.setText(R.string.em_q9_var_4);
        answer_image9 = findViewById(R.id.answer9);
        answer_image9.setImageResource(R.drawable.ted_answer);
        answer_image9.setVisibility(View.INVISIBLE);
    }

    public void Question10() {
        currentQuestion++;
        question_number = findViewById(R.id.question10_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image10);
        question_image.setImageResource(R.drawable.american_beauty);
        answer10_1 = findViewById(R.id.answer10_1);
        answer10_1.setText(R.string.em_q10_var_1);
        answer10_2 = findViewById(R.id.answer10_2);
        answer10_2.setText(R.string.em_q10_var_2);
        answer10_3 = findViewById(R.id.answer10_3);
        answer10_3.setText(R.string.em_q10_var_3);
        answer10_4 = findViewById(R.id.answer10_4);
        answer10_4.setText(R.string.em_q10_var_4);
        answer_image10 = findViewById(R.id.answer10);
        answer_image10.setImageResource(R.drawable.beauty_answer);
        answer_image10.setVisibility(View.INVISIBLE);
    }

    public void onCheckedChanged(RadioGroup radioGroup, int CheckedRadioButtonId) {
        if (radioGroup == rg1) {
            switch (CheckedRadioButtonId) {
                case R.id.answer1_1:
                    answer1_1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image1.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer1_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_2.setEnabled(false);
                    answer1_3.setEnabled(false);
                    answer1_4.setEnabled(false);
                    break;
                case R.id.answer1_2:
                    answer1_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image1.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer1_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_1.setEnabled(false);
                    answer1_3.setEnabled(false);
                    answer1_4.setEnabled(false);
                    break;
                case R.id.answer1_3:
                    answer1_3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image1.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer1_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_1.setEnabled(false);
                    answer1_2.setEnabled(false);
                    answer1_4.setEnabled(false);
                    break;
                case R.id.answer1_4:
                    answer1_4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image1.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer1_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer1_1.setEnabled(false);
                    answer1_2.setEnabled(false);
                    answer1_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg2) {
            switch (CheckedRadioButtonId) {
                case R.id.answer2_1:
                    answer2_1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image2.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer2_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_2.setEnabled(false);
                    answer2_3.setEnabled(false);
                    answer2_4.setEnabled(false);
                    break;
                case R.id.answer2_2:
                    answer2_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image2.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer2_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_1.setEnabled(false);
                    answer2_3.setEnabled(false);
                    answer2_4.setEnabled(false);
                    break;
                case R.id.answer2_3:
                    answer2_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image2.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer2_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_1.setEnabled(false);
                    answer2_2.setEnabled(false);
                    answer2_4.setEnabled(false);
                    break;
                case R.id.answer2_4:
                    answer2_4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image2.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer2_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer2_1.setEnabled(false);
                    answer2_2.setEnabled(false);
                    answer2_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg3) {
            switch (CheckedRadioButtonId) {
                case R.id.answer3_1:
                    answer3_1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image3.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer3_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_2.setEnabled(false);
                    answer3_3.setEnabled(false);
                    answer3_4.setEnabled(false);
                    break;
                case R.id.answer3_2:
                    answer3_2.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image3.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer3_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_1.setEnabled(false);
                    answer3_3.setEnabled(false);
                    answer3_4.setEnabled(false);
                    break;
                case R.id.answer3_3:
                    answer3_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image3.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer3_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_1.setEnabled(false);
                    answer3_2.setEnabled(false);
                    answer3_4.setEnabled(false);
                    break;
                case R.id.answer3_4:
                    answer3_4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image3.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer3_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer3_1.setEnabled(false);
                    answer3_2.setEnabled(false);
                    answer3_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg4) {
            switch (CheckedRadioButtonId) {
                case R.id.answer4_1:
                    answer4_1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image4.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer4_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_2.setEnabled(false);
                    answer4_3.setEnabled(false);
                    answer4_4.setEnabled(false);
                    break;
                case R.id.answer4_2:
                    answer4_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image4.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer4_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_1.setEnabled(false);
                    answer4_3.setEnabled(false);
                    answer4_4.setEnabled(false);
                    break;
                case R.id.answer4_3:
                    answer4_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image4.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer4_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_1.setEnabled(false);
                    answer4_2.setEnabled(false);
                    answer4_4.setEnabled(false);
                    break;
                case R.id.answer4_4:
                    answer4_4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image4.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer4_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer4_1.setEnabled(false);
                    answer4_2.setEnabled(false);
                    answer4_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg5) {
            switch (CheckedRadioButtonId) {
                case R.id.answer5_1:
                    answer5_1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image5.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer5_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_2.setEnabled(false);
                    answer5_3.setEnabled(false);
                    answer5_4.setEnabled(false);
                    break;
                case R.id.answer5_2:
                    answer5_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image5.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer5_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_1.setEnabled(false);
                    answer5_3.setEnabled(false);
                    answer5_4.setEnabled(false);
                    break;
                case R.id.answer5_3:
                    answer5_3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image5.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer5_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_1.setEnabled(false);
                    answer5_2.setEnabled(false);
                    answer5_4.setEnabled(false);
                    break;
                case R.id.answer5_4:
                    answer5_4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image5.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer5_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer5_1.setEnabled(false);
                    answer5_2.setEnabled(false);
                    answer5_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg6) {
            switch (CheckedRadioButtonId) {
                case R.id.answer6_1:
                    answer6_1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image6.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer6_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_2.setEnabled(false);
                    answer6_3.setEnabled(false);
                    answer6_4.setEnabled(false);
                    break;
                case R.id.answer6_2:
                    answer6_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image6.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer6_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_1.setEnabled(false);
                    answer6_3.setEnabled(false);
                    answer6_4.setEnabled(false);
                    break;
                case R.id.answer6_3:
                    answer6_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image6.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer6_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_1.setEnabled(false);
                    answer6_2.setEnabled(false);
                    answer6_4.setEnabled(false);
                    break;
                case R.id.answer6_4:
                    answer6_4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image6.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer6_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer6_1.setEnabled(false);
                    answer6_2.setEnabled(false);
                    answer6_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg7) {
            switch (CheckedRadioButtonId) {
                case R.id.answer7_1:
                    answer7_1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image7.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer7_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_2.setEnabled(false);
                    answer7_3.setEnabled(false);
                    answer7_4.setEnabled(false);
                    break;
                case R.id.answer7_2:
                    answer7_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image7.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer7_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_1.setEnabled(false);
                    answer7_3.setEnabled(false);
                    answer7_4.setEnabled(false);
                    break;
                case R.id.answer7_3:
                    answer7_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image7.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer7_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_1.setEnabled(false);
                    answer7_2.setEnabled(false);
                    answer7_4.setEnabled(false);
                    break;
                case R.id.answer7_4:
                    answer7_4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image7.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer7_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer7_1.setEnabled(false);
                    answer7_2.setEnabled(false);
                    answer7_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg8) {
            switch (CheckedRadioButtonId) {
                case R.id.answer8_1:
                    answer8_1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image8.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer8_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_2.setEnabled(false);
                    answer8_3.setEnabled(false);
                    answer8_4.setEnabled(false);
                    break;
                case R.id.answer8_2:
                    answer8_2.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image8.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer8_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_1.setEnabled(false);
                    answer8_3.setEnabled(false);
                    answer8_4.setEnabled(false);
                    break;
                case R.id.answer8_3:
                    answer8_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image8.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer8_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_1.setEnabled(false);
                    answer8_2.setEnabled(false);
                    answer8_4.setEnabled(false);
                    break;
                case R.id.answer8_4:
                    answer8_4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image8.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer8_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer8_1.setEnabled(false);
                    answer8_2.setEnabled(false);
                    answer8_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg9) {
            switch (CheckedRadioButtonId) {
                case R.id.answer9_1:
                    answer9_1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image9.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer9_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_2.setEnabled(false);
                    answer9_3.setEnabled(false);
                    answer9_4.setEnabled(false);
                    break;
                case R.id.answer9_2:
                    answer9_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image9.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer9_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_1.setEnabled(false);
                    answer9_3.setEnabled(false);
                    answer9_4.setEnabled(false);
                    break;
                case R.id.answer9_3:
                    answer9_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image9.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer9_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_1.setEnabled(false);
                    answer9_2.setEnabled(false);
                    answer9_4.setEnabled(false);
                    break;
                case R.id.answer9_4:
                    answer9_4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image9.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer9_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer9_1.setEnabled(false);
                    answer9_2.setEnabled(false);
                    answer9_3.setEnabled(false);
                    break;
            }
        }
        if (radioGroup == rg10) {
            switch (CheckedRadioButtonId) {
                case R.id.answer10_1:
                    answer10_1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    answer_image10.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                    answer10_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_2.setEnabled(false);
                    answer10_3.setEnabled(false);
                    answer10_4.setEnabled(false);
                    break;
                case R.id.answer10_2:
                    answer10_2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image10.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer10_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_1.setEnabled(false);
                    answer10_3.setEnabled(false);
                    answer10_4.setEnabled(false);
                    break;
                case R.id.answer10_3:
                    answer10_3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image10.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer10_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_4.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_1.setEnabled(false);
                    answer10_2.setEnabled(false);
                    answer10_4.setEnabled(false);
                    break;
                case R.id.answer10_4:
                    answer10_4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    answer_image10.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                    answer10_1.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_2.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_3.setTextColor(getResources().getColor(R.color.questions_color));
                    answer10_1.setEnabled(false);
                    answer10_2.setEnabled(false);
                    answer10_3.setEnabled(false);
                    break;
            }
        }
    }

    public void submit(View view) {
        if (!answer1_1.isChecked() && !answer1_2.isChecked() && !answer1_3.isChecked() && !answer1_4.isChecked() &&
                !answer2_1.isChecked() && !answer2_2.isChecked() && !answer2_3.isChecked() && !answer2_4.isChecked() &&
                !answer3_1.isChecked() && !answer3_2.isChecked() && !answer3_3.isChecked() && !answer3_4.isChecked() &&
                !answer4_1.isChecked() && !answer4_2.isChecked() && !answer4_3.isChecked() && !answer4_4.isChecked() &&
                !answer5_1.isChecked() && !answer5_2.isChecked() && !answer5_3.isChecked() && !answer5_4.isChecked() &&
                !answer6_1.isChecked() && !answer6_2.isChecked() && !answer6_3.isChecked() && !answer6_4.isChecked() &&
                !answer7_1.isChecked() && !answer7_2.isChecked() && !answer7_3.isChecked() && !answer7_4.isChecked() &&
                !answer8_1.isChecked() && !answer8_2.isChecked() && !answer8_3.isChecked() && !answer8_4.isChecked() &&
                !answer9_1.isChecked() && !answer9_2.isChecked() && !answer9_3.isChecked() && !answer9_4.isChecked() &&
                !answer10_1.isChecked() && !answer10_2.isChecked() && !answer10_3.isChecked() && !answer10_4.isChecked()) {
            Toast.makeText(this, R.string.not_chosen1, Toast.LENGTH_SHORT).show();
            return;
        } else {
            Intent openEmojiQuiz = getIntent();
            name = openEmojiQuiz.getStringExtra(MainActivity.EXTRA_MESSAGE);
            String resultMessage = createQuizSummary(name, correct_score, incorrect_score, totalNumberOfQuestions);
            Toast.makeText(getApplicationContext(), resultMessage, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Creates Quiz summary.
     */
    private String createQuizSummary(String name, int correct_score, int incorrect_score, int totalNumberOfQuestions) {
        resultMessage = getString(R.string.nameSummary, name);
        resultMessage += "\n" + getString(R.string.well_done);
        resultMessage += "\n" + getString(R.string.results);
        resultMessage += "\n" + getString(R.string.total_correct, correct_score, totalNumberOfQuestions);
        resultMessage += "\n" + getString(R.string.total_incorrect, incorrect_score, totalNumberOfQuestions);
        resultMessage += "\n" + getString(R.string.tryAnother);
        return resultMessage;
    }

    public void mainActivity(View view) {
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
    }

    public void share(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, resultMessage);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quiz results");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
