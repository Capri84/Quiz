package com.example.android.newyearquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EmojiActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

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
    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;
    //Тут мы создаем переменную для хранения ответов
    ImageView answer_image;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoji);

        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radio_group1);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.radio_group2);
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.radio_group3);
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.radio_group4);
        RadioGroup rg5 = (RadioGroup) findViewById(R.id.radio_group5);
        RadioGroup rg6 = (RadioGroup) findViewById(R.id.radio_group6);
        RadioGroup rg7 = (RadioGroup) findViewById(R.id.radio_group7);
        RadioGroup rg8 = (RadioGroup) findViewById(R.id.radio_group8);
        RadioGroup rg9 = (RadioGroup) findViewById(R.id.radio_group9);
        RadioGroup rg10 = (RadioGroup) findViewById(R.id.radio_group10);
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
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image1);
        question_image.setImageResource(R.drawable.forrest_gump);
        answer1 = findViewById(R.id.answer1_1);
        answer1.setText(R.string.em_q1_var_1);
        answer2 = findViewById(R.id.answer1_2);
        answer2.setText(R.string.em_q1_var_2);
        answer3 = findViewById(R.id.answer1_3);
        answer3.setText(R.string.em_q1_var_3);
        answer4 = findViewById(R.id.answer1_4);
        answer4.setText(R.string.em_q1_var_4);
        answer_image = findViewById(R.id.answer1);
        answer_image.setImageResource(R.drawable.forrest_gump_answer1);
        answer_image.setVisibility(View.INVISIBLE);

    }

    public void Question2() {
        question_number = findViewById(R.id.question2_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image2);
        question_image.setImageResource(R.drawable.mib);
        answer1 = findViewById(R.id.answer2_1);
        answer1.setText(R.string.em_q2_var_1);
        answer2 = findViewById(R.id.answer2_2);
        answer2.setText(R.string.em_q2_var_2);
        answer3 = findViewById(R.id.answer2_3);
        answer3.setText(R.string.em_q2_var_3);
        answer4 = findViewById(R.id.answer2_4);
        answer4.setText(R.string.em_q2_var_4);
        answer_image = findViewById(R.id.answer2);
        answer_image.setImageResource(R.drawable.mib_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question3() {
        question_number = findViewById(R.id.question3_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image3);
        question_image.setImageResource(R.drawable.breakfast_at_tiffany);
        answer1 = findViewById(R.id.answer3_1);
        answer1.setText(R.string.em_q3_var_1);
        answer2 = findViewById(R.id.answer3_2);
        answer2.setText(R.string.em_q3_var_2);
        answer3 = findViewById(R.id.answer3_3);
        answer3.setText(R.string.em_q3_var_3);
        answer4 = findViewById(R.id.answer3_4);
        answer4.setText(R.string.em_q3_var_4);
        answer_image = findViewById(R.id.answer3);
        answer_image.setImageResource(R.drawable.breakfast_tiffany_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question4() {
        question_number = findViewById(R.id.question4_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image4);
        question_image.setImageResource(R.drawable.mask);
        answer1 = findViewById(R.id.answer4_1);
        answer1.setText(R.string.em_q4_var_1);
        answer2 = findViewById(R.id.answer4_2);
        answer2.setText(R.string.em_q4_var_2);
        answer3 = findViewById(R.id.answer4_3);
        answer3.setText(R.string.em_q4_var_3);
        answer4 = findViewById(R.id.answer4_4);
        answer4.setText(R.string.em_q4_var_4);
        answer_image = findViewById(R.id.answer4);
        answer_image.setImageResource(R.drawable.mask_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question5() {
        question_number = findViewById(R.id.question5_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image5);
        question_image.setImageResource(R.drawable.lamb_silence);
        answer1 = findViewById(R.id.answer5_1);
        answer1.setText(R.string.em_q5_var_1);
        answer2 = findViewById(R.id.answer5_2);
        answer2.setText(R.string.em_q5_var_2);
        answer3 = findViewById(R.id.answer5_3);
        answer3.setText(R.string.em_q5_var_3);
        answer4 = findViewById(R.id.answer5_4);
        answer4.setText(R.string.em_q5_var_4);
        answer_image = findViewById(R.id.answer5);
        answer_image.setImageResource(R.drawable.lambs_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question6() {
        question_number = findViewById(R.id.question6_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image6);
        question_image.setImageResource(R.drawable.devil_prada);
        answer1 = findViewById(R.id.answer6_1);
        answer1.setText(R.string.em_q6_var_1);
        answer2 = findViewById(R.id.answer6_2);
        answer2.setText(R.string.em_q6_var_2);
        answer3 = findViewById(R.id.answer6_3);
        answer3.setText(R.string.em_q6_var_3);
        answer4 = findViewById(R.id.answer6_4);
        answer4.setText(R.string.em_q6_var_4);
        answer_image = findViewById(R.id.answer6);
        answer_image.setImageResource(R.drawable.prada_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question7() {
        question_number = findViewById(R.id.question7_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image7);
        question_image.setImageResource(R.drawable.signs);
        answer1 = findViewById(R.id.answer7_1);
        answer1.setText(R.string.em_q7_var_1);
        answer2 = findViewById(R.id.answer7_2);
        answer2.setText(R.string.em_q7_var_2);
        answer3 = findViewById(R.id.answer7_3);
        answer3.setText(R.string.em_q7_var_3);
        answer4 = findViewById(R.id.answer7_4);
        answer4.setText(R.string.em_q7_var_4);
        answer_image = findViewById(R.id.answer7);
        answer_image.setImageResource(R.drawable.signs_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question8() {
        question_number = findViewById(R.id.question8_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image8);
        question_image.setImageResource(R.drawable.matrix);
        answer1 = findViewById(R.id.answer8_1);
        answer1.setText(R.string.em_q8_var_1);
        answer2 = findViewById(R.id.answer8_2);
        answer2.setText(R.string.em_q8_var_2);
        answer3 = findViewById(R.id.answer8_3);
        answer3.setText(R.string.em_q8_var_3);
        answer4 = findViewById(R.id.answer8_4);
        answer4.setText(R.string.em_q8_var_4);
        answer_image = findViewById(R.id.answer8);
        answer_image.setImageResource(R.drawable.matrix_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question9() {
        question_number = findViewById(R.id.question9_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image9);
        question_image.setImageResource(R.drawable.ted);
        answer1 = findViewById(R.id.answer9_1);
        answer1.setText(R.string.em_q9_var_1);
        answer2 = findViewById(R.id.answer9_2);
        answer2.setText(R.string.em_q9_var_2);
        answer3 = findViewById(R.id.answer9_3);
        answer3.setText(R.string.em_q9_var_3);
        answer4 = findViewById(R.id.answer9_4);
        answer4.setText(R.string.em_q9_var_4);
        answer_image = findViewById(R.id.answer9);
        answer_image.setImageResource(R.drawable.ted_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void Question10() {
        question_number = findViewById(R.id.question10_number);
        question_number.setText(R.string.questionNumber1 + String.valueOf(currentQuestion) + R.string.questionNumber2 + String.valueOf(totalNumberOfQuestions));
        question_image = findViewById(R.id.question_image10);
        question_image.setImageResource(R.drawable.american_beauty);
        answer1 = findViewById(R.id.answer10_1);
        answer1.setText(R.string.em_q10_var_1);
        answer2 = findViewById(R.id.answer10_2);
        answer2.setText(R.string.em_q10_var_2);
        answer3 = findViewById(R.id.answer10_3);
        answer3.setText(R.string.em_q10_var_3);
        answer4 = findViewById(R.id.answer10_4);
        answer4.setText(R.string.em_q10_var_4);
        answer_image = findViewById(R.id.answer10);
        answer_image.setImageResource(R.drawable.beauty_answer);
        answer_image.setVisibility(View.INVISIBLE);
    }

    public void onCheckedChanged(RadioGroup radioGroup, int CheckedRadioButtonId) {
     if (radioGroup == rg1) {
        switch (rg1.getCheckedRadioButtonId()) {
            case R.id.answer1_1:
                answer1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image.setVisibility(View.VISIBLE);
                incorrect_score++;
                Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                break;
            case R.id.answer1_2:
                answer2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image.setVisibility(View.VISIBLE);
                incorrect_score++;
                Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                break;
            case R.id.answer1_3:
                answer3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                answer_image.setVisibility(View.VISIBLE);
                correct_score++;
                Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                break;
            case R.id.answer1_4:
                answer1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                answer_image.setVisibility(View.VISIBLE);
                incorrect_score++;
                Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                break;
     }
    }
    }}
