package com.example.android.newyearquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxesActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

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
    CheckBox answer1;
    CheckBox answer2;
    CheckBox answer3;
    CheckBox answer4;
    //Тут мы создаем переменную для хранения ответов
    TextView ny_answer;
    //Тут мы создаем переменную для хранения Button
    Button nextQuestion;
    //Другое
    String qnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ny_checkbox);
        question_number = findViewById(R.id.question_number);
        question_image = findViewById(R.id.question_image);
        ny_question = findViewById(R.id.question);
        answer1 = findViewById(R.id.checkbox1);
        answer1.setOnCheckedChangeListener(this);
        answer2 = findViewById(R.id.checkbox2);
        answer2.setOnCheckedChangeListener(this);
        answer3 = findViewById(R.id.checkbox3);
        answer3.setOnCheckedChangeListener(this);
        answer4 = findViewById(R.id.checkbox4);
        answer4.setOnCheckedChangeListener(this);
        ny_answer = findViewById(R.id.answer);
        nextQuestion = (Button) findViewById(R.id.next_question);
        nextQuestion.setOnClickListener(this);
        currentQuestion = getIntent().getExtras().getInt("current_question");
        correct_score = getIntent().getExtras().getInt("correct_score");
        incorrect_score = getIntent().getExtras().getInt("incorrect_score");
        totalNumberOfQuestions = getIntent().getExtras().getInt("total_number_of_questions");
        Question6();
    }

    public void Question6() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void Question8() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image.setImageResource(R.drawable.question8img);
        ny_question.setText(R.string.ny_question_8);
        answer1.setText(R.string.ny_q8_var_1);
        answer2.setText(R.string.ny_q8_var_2);
        answer3.setText(R.string.ny_q8_var_3);
        answer4.setText(R.string.ny_q8_var_4);
        ny_answer.setText(R.string.ny_answer_8);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void onCheckedChanged(CompoundButton checkbox, boolean isChecked) {
        switch (currentQuestion) {
            case 6:
                if (answer1.isChecked()) {
                    answer1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                } else if (answer2.isChecked()) {
                    answer2.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                } else if (answer3.isChecked()) {
                    answer3.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                } else if (answer4.isChecked()) {
                    answer4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                }
                if (answer1.isChecked() && answer4.isChecked()) {
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                break;
            case 8:
                if (answer1.isChecked()) {
                    answer1.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                } else if (answer2.isChecked()) {
                    answer2.setTextColor(getResources().getColor(R.color.correct_answer_color));
                } else if (answer3.isChecked()) {
                    answer3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                } else if (answer4.isChecked()) {
                    answer4.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                }
                if (answer2.isChecked() && answer3.isChecked()) {
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    // This method calls RadioButtonsActivity
    public void openRBActivity() {
        Intent openRBActivity = new Intent(this, RadioButtonsActivity.class);
        openRBActivity.putExtra("current_question", currentQuestion);
        openRBActivity.putExtra("correct_score", correct_score);
        openRBActivity.putExtra("incorrect_score", incorrect_score);
        openRBActivity.putExtra("total_number_of_questions", totalNumberOfQuestions);
        startActivity(openRBActivity);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next_question:
                if (!answer1.isChecked() && !answer2.isChecked() && !answer3.isChecked() && !answer4.isChecked()) {
                    Toast.makeText(this, R.string.not_chosen, Toast.LENGTH_SHORT).show();
                    return;
                }
        }
        currentQuestion++;
        switch (currentQuestion) {
            case 7:
                openRBActivity();
                break;
            case 8:
                Question8();
                break;
            case 9:
                openRBActivity();
                break;
        }
    }
}
