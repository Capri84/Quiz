package com.example.android.newyearquiz;

import android.content.Intent;
import android.graphics.Color;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class NewYearQuizActivity extends AppCompatActivity implements View.OnClickListener/**, RadioGroup.OnCheckedChangeListener*/
{

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
    //Тут мы создаем переменную для хранения картинки
    ImageView question_image;
    //Тут мы создаем переменную для хранения вопросов
    TextView ny_question;
    //Тут мы создаем переменные для хранения вариантов ответов
    /**   RadioButton answer1;
     RadioButton answer2;
     RadioButton answer3;
     RadioButton answer4; */
    //Тут мы создаем переменную для хранения ответов
    TextView ny_answer;
    //  RadioGroup radioGroup1;
    //  RadioGroup radioGroup2;
    //Тут мы создаем переменную для хранения Button
    Button nextQuestion;
    //Другое
    Boolean changeGroup = false;
    String qnum;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ny_edittext);
        /**  radioGroup1 = findViewById(R.id.radio_group1);
         radioGroup1.setOnCheckedChangeListener(this);
         radioGroup2 = findViewById(R.id.radio_group2);
         radioGroup2.setOnCheckedChangeListener(this); */
        question_number = findViewById(R.id.question_number);
        question_image = findViewById(R.id.question_image);
        ny_question = findViewById(R.id.question);
        editText = (EditText) findViewById(R.id.ny_answer1);
        ny_answer = findViewById(R.id.answer);
        Question1();
        nextQuestion = (Button) findViewById(R.id.next_question);
        nextQuestion.setOnClickListener(this);

    }

    public void Question1() {
        question_number = findViewById(R.id.question_number);
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image = findViewById(R.id.question_image);
        question_image.setImageResource(R.drawable.question11img);
        ny_question = findViewById(R.id.question);
        ny_question.setText(R.string.ny_question_1);
        ny_answer = findViewById(R.id.answer);
        ny_answer.setText(R.string.ny_answer_1);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    /**  public void Question2() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question2img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_2);
     editText.setVisibility(View.INVISIBLE);
     radioGroup1.setVisibility(View.VISIBLE);
     radioGroup2.setVisibility(View.VISIBLE);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q2_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q2_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q2_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q2_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_2);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question3() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question31img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_3);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q3_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q3_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q3_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q3_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_3);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question4() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question4img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_4);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q4_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q4_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q4_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q4_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_4);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question5() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question5img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_5);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q5_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q5_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q5_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q5_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_5);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question6() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question6img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_6);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q6_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q6_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q6_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q6_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_6);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question7() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question7img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_7);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q7_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q7_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q7_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q7_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_7);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question8() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question8img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_8);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q8_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q8_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q8_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q8_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_8);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question9() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question9img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_9);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q9_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q9_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q9_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q9_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_9);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void Question10() {
     question_number = findViewById(R.id.question_number);
     qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
     question_number.setText(qnum);
     question_image = findViewById(R.id.question_image);
     question_image.setImageResource(R.drawable.question10img);
     ny_question = findViewById(R.id.question);
     ny_question.setText(R.string.ny_question_10);
     answer1 = findViewById(R.id.answer1);
     answer1.setText(R.string.ny_q10_var_1);
     answer2 = findViewById(R.id.answer2);
     answer2.setText(R.string.ny_q10_var_2);
     answer3 = findViewById(R.id.answer3);
     answer3.setText(R.string.ny_q10_var_3);
     answer4 = findViewById(R.id.answer4);
     answer4.setText(R.string.ny_q10_var_4);
     ny_answer = findViewById(R.id.answer);
     ny_answer.setText(R.string.ny_answer_10);
     ny_answer.setVisibility(View.INVISIBLE);
     }

     public void onCheckedChanged(RadioGroup group, int checkedId) {
     if (group != null && checkedId > -1 && changeGroup == false) {
     if (group == radioGroup1) {
     changeGroup = true;
     radioGroup2.clearCheck();
     changeGroup = false;
     switch (checkedId) {
     case R.id.answer1:
     answer1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
     answer2.setTextColor(getResources().getColor(R.color.questions_color));
     answer3.setTextColor(getResources().getColor(R.color.questions_color));
     answer4.setTextColor(getResources().getColor(R.color.questions_color));
     ny_answer.setVisibility(View.VISIBLE);
     incorrect_score++;
     Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
     break;
     case R.id.answer2:
     answer2.setTextColor(getResources().getColor(R.color.correct_answer_color));
     answer1.setTextColor(getResources().getColor(R.color.questions_color));
     answer3.setTextColor(getResources().getColor(R.color.questions_color));
     answer4.setTextColor(getResources().getColor(R.color.questions_color));
     ny_answer.setVisibility(View.VISIBLE);
     correct_score++;
     Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
     break;
     }
     } else if (group == radioGroup2) {
     changeGroup = true;
     radioGroup1.clearCheck();
     changeGroup = false;
     switch (checkedId) {
     case R.id.answer3:
     answer3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
     answer1.setTextColor(getResources().getColor(R.color.questions_color));
     answer2.setTextColor(getResources().getColor(R.color.questions_color));
     answer4.setTextColor(getResources().getColor(R.color.questions_color));
     ny_answer.setVisibility(View.VISIBLE);
     incorrect_score++;
     Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
     break;
     case R.id.answer4:
     answer4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
     answer1.setTextColor(getResources().getColor(R.color.questions_color));
     answer2.setTextColor(getResources().getColor(R.color.questions_color));
     answer3.setTextColor(getResources().getColor(R.color.questions_color));
     ny_answer.setVisibility(View.VISIBLE);
     incorrect_score++;
     Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
     break;
     }
     }
     }
     }
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next_question:
                // if (currentQuestion == 1) {
                if (editText.getText().toString().trim().equals("")) {
                    Toast.makeText(getApplicationContext(), R.string.not_chosen2, Toast.LENGTH_SHORT).show();
                    return;
                } else if (editText.getText().toString().equals("Russia")) {
                    Toast.makeText(this, R.string.correctAnswer, Toast.LENGTH_SHORT).show();
                    correct_score++;
                    ny_answer.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(this, R.string.wrongAnswer, Toast.LENGTH_SHORT).show();
                    incorrect_score++;
                }
                /**   } else {
                 if (!answer1.isChecked() && !answer2.isChecked() && !answer3.isChecked() && !answer4.isChecked()) {
                 Toast.makeText(this, R.string.not_chosen, Toast.LENGTH_SHORT).show();
                 return;
                 }
                 }
                 ny_question.setText("");
                 ny_answer.setText("");
                 ny_answer.setVisibility(View.INVISIBLE);
                 if (currentQuestion != 1) {
                 answer1.setText("");
                 answer2.setText("");
                 answer3.setText("");
                 answer4.setText("");
                 radioGroup1.clearCheck();
                 radioGroup2.clearCheck();
                 answer1.setTextColor(getResources().getColor(R.color.questions_color));
                 answer2.setTextColor(getResources().getColor(R.color.questions_color));
                 answer3.setTextColor(getResources().getColor(R.color.questions_color));
                 answer4.setTextColor(getResources().getColor(R.color.questions_color));
                 } */
                currentQuestion++;
                switch (currentQuestion) {
                    case 2:
                        startActivity(new Intent(this, RadioButtonsActivity.class));
                        // Question2();
                        break;
                    /**       case 3:
                     Question3();
                     break;
                     case 4:
                     Question4();
                     break;
                     case 5:
                     Question5();
                     break;
                     case 6:
                     Question6();
                     break;
                     case 7:
                     Question7();
                     break;
                     case 8:
                     Question8();
                     break;
                     case 9:
                     Question9();
                     break;
                     case 10:
                     Question10();
                     break;
                     }*/
                }
        }
}
}
