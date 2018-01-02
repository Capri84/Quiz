package com.example.android.newyearquiz;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioButtonsActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

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
    RadioButton answer1, answer2, answer3, answer4;
    //Тут мы создаем переменную для хранения ответов
    TextView ny_answer;
    RadioGroup radioGroup1;
    //Тут мы создаем переменную для хранения Button
    Button nextQuestion, shareButton, mainScreenButton;
    //Другое
    String qnum;
    String resultMessage;
    // Here we declare a variable to store player's name
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_year_quiz);
        question_number = findViewById(R.id.question_number);
        question_image = findViewById(R.id.question_image);
        ny_question = findViewById(R.id.question);
        radioGroup1 = findViewById(R.id.radio_group1);
        radioGroup1.setOnCheckedChangeListener(this);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        ny_answer = findViewById(R.id.answer);
        nextQuestion = (Button) findViewById(R.id.next_question);
        nextQuestion.setOnClickListener(this);
        shareButton = (Button) findViewById(R.id.share);
        shareButton.setOnClickListener(this);
        mainScreenButton = (Button) findViewById(R.id.main_screen);
        mainScreenButton.setOnClickListener(this);
        currentQuestion = getIntent().getExtras().getInt("current_question");
        correct_score = getIntent().getExtras().getInt("correct_score");
        incorrect_score = getIntent().getExtras().getInt("incorrect_score");
        totalNumberOfQuestions = getIntent().getExtras().getInt("total_number_of_questions");

        /**  switch (currentQuestion) {
         case 2:
         qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
         question_number.setText(qnum);
         ny_answer.setVisibility(View.INVISIBLE);
         break;
         case 3:
         qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
         question_number.setText(qnum);
         question_image.setImageResource(R.drawable.question31img);
         ny_question.setText(R.string.ny_question_3);
         answer1.setText(R.string.ny_q3_var_1);
         answer2.setText(R.string.ny_q3_var_2);
         answer3.setText(R.string.ny_q3_var_3);
         answer4.setText(R.string.ny_q3_var_4);
         ny_answer.setText(R.string.ny_answer_3);
         ny_answer.setVisibility(View.INVISIBLE);
         break;
         case 4:
         qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
         question_number.setText(qnum);
         question_image.setImageResource(R.drawable.question4img);
         ny_question.setText(R.string.ny_question_4);
         answer1.setText(R.string.ny_q4_var_1);
         answer2.setText(R.string.ny_q4_var_2);
         answer3.setText(R.string.ny_q4_var_3);
         answer4.setText(R.string.ny_q4_var_4);
         ny_answer.setText(R.string.ny_answer_4);
         ny_answer.setVisibility(View.INVISIBLE);
         break;
         case 5:
         qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
         question_number.setText(qnum);
         question_image.setImageResource(R.drawable.question5img);
         ny_question.setText(R.string.ny_question_5);
         answer1.setText(R.string.ny_q5_var_1);
         answer2.setText(R.string.ny_q5_var_2);
         answer3.setText(R.string.ny_q5_var_3);
         answer4.setText(R.string.ny_q5_var_4);
         ny_answer.setText(R.string.ny_answer_5);
         ny_answer.setVisibility(View.INVISIBLE);
         break;
         case 7:
         qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
         question_number.setText(qnum);
         question_image.setImageResource(R.drawable.question7img);
         ny_question.setText(R.string.ny_question_7);
         answer1.setText(R.string.ny_q7_var_1);
         answer2.setText(R.string.ny_q7_var_2);
         answer3.setText(R.string.ny_q7_var_3);
         answer4.setText(R.string.ny_q7_var_4);
         ny_answer.setText(R.string.ny_answer_7);
         ny_answer.setVisibility(View.INVISIBLE);
         break;
         case 9:
         qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
         question_number.setText(qnum);
         question_image.setImageResource(R.drawable.question9img);
         ny_question.setText(R.string.ny_question_9);
         answer1.setText(R.string.ny_q9_var_1);
         answer2.setText(R.string.ny_q9_var_2);
         answer3.setText(R.string.ny_q9_var_3);
         answer4.setText(R.string.ny_q9_var_4);
         ny_answer.setText(R.string.ny_answer_9);
         ny_answer.setVisibility(View.INVISIBLE);
         break;
         case 10:
         qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
         question_number.setText(qnum);
         question_image.setImageResource(R.drawable.question10img);
         ny_question.setText(R.string.ny_question_10);
         answer1.setText(R.string.ny_q10_var_1);
         answer2.setText(R.string.ny_q10_var_2);
         answer3.setText(R.string.ny_q10_var_3);
         answer4.setText(R.string.ny_q10_var_4);
         ny_answer.setText(R.string.ny_answer_10);
         ny_answer.setVisibility(View.INVISIBLE);
         nextQuestion.setText(R.string.submit_button);
         mainScreenButton.setVisibility(View.VISIBLE);
         shareButton.setVisibility(View.VISIBLE);
         break;
         } */

        if (currentQuestion == 2) {
            Question2();
        } else if (currentQuestion == 7) {
            Question7();
        } else if (currentQuestion == 9) {
            Question9();
        }
    }


    public void Question2() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void Question3() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image.setImageResource(R.drawable.question31img);
        ny_question.setText(R.string.ny_question_3);
        answer1.setText(R.string.ny_q3_var_1);
        answer2.setText(R.string.ny_q3_var_2);
        answer3.setText(R.string.ny_q3_var_3);
        answer4.setText(R.string.ny_q3_var_4);
        ny_answer.setText(R.string.ny_answer_3);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void Question4() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image.setImageResource(R.drawable.question4img);
        ny_question.setText(R.string.ny_question_4);
        answer1.setText(R.string.ny_q4_var_1);
        answer2.setText(R.string.ny_q4_var_2);
        answer3.setText(R.string.ny_q4_var_3);
        answer4.setText(R.string.ny_q4_var_4);
        ny_answer.setText(R.string.ny_answer_4);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void Question5() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image.setImageResource(R.drawable.question5img);
        ny_question.setText(R.string.ny_question_5);
        answer1.setText(R.string.ny_q5_var_1);
        answer2.setText(R.string.ny_q5_var_2);
        answer3.setText(R.string.ny_q5_var_3);
        answer4.setText(R.string.ny_q5_var_4);
        ny_answer.setText(R.string.ny_answer_5);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void Question7() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image.setImageResource(R.drawable.question7img);
        ny_question.setText(R.string.ny_question_7);
        answer1.setText(R.string.ny_q7_var_1);
        answer2.setText(R.string.ny_q7_var_2);
        answer3.setText(R.string.ny_q7_var_3);
        answer4.setText(R.string.ny_q7_var_4);
        ny_answer.setText(R.string.ny_answer_7);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void Question9() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image.setImageResource(R.drawable.question9img);
        ny_question.setText(R.string.ny_question_9);
        answer1.setText(R.string.ny_q9_var_1);
        answer2.setText(R.string.ny_q9_var_2);
        answer3.setText(R.string.ny_q9_var_3);
        answer4.setText(R.string.ny_q9_var_4);
        ny_answer.setText(R.string.ny_answer_9);
        ny_answer.setVisibility(View.INVISIBLE);
    }

    public void Question10() {
        qnum = getString(R.string.questionNumber, currentQuestion, totalNumberOfQuestions);
        question_number.setText(qnum);
        question_image.setImageResource(R.drawable.question10img);
        ny_question.setText(R.string.ny_question_10);
        answer1.setText(R.string.ny_q10_var_1);
        answer2.setText(R.string.ny_q10_var_2);
        answer3.setText(R.string.ny_q10_var_3);
        answer4.setText(R.string.ny_q10_var_4);
        ny_answer.setText(R.string.ny_answer_10);
        ny_answer.setVisibility(View.INVISIBLE);
        nextQuestion.setText(R.string.submit_button);
        mainScreenButton.setVisibility(View.VISIBLE);
        shareButton.setVisibility(View.VISIBLE);
    }

    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioButton checked_answer = (RadioButton) findViewById(radioGroup1.getCheckedRadioButtonId());
        switch (currentQuestion) {
            case 2:
                if (answer3.isChecked()) {
                    answer3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    checked_answer.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 3:
                if (answer1.isChecked()) {
                    answer1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    checked_answer.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 4:
                if (answer4.isChecked()) {
                    answer4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    checked_answer.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 5:
                if (answer3.isChecked()) {
                    answer3.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    checked_answer.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 7:
                if (answer4.isChecked()) {
                    answer4.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    checked_answer.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 9:
                if (answer2.isChecked()) {
                    answer2.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    checked_answer.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
            case 10:
                if (answer1.isChecked()) {
                    answer1.setTextColor(getResources().getColor(R.color.correct_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    correct_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.correctAnswer), Toast.LENGTH_SHORT).show();
                } else {
                    checked_answer.setTextColor(getResources().getColor(R.color.wrong_answer_color));
                    ny_answer.setVisibility(View.VISIBLE);
                    incorrect_score++;
                    Toast.makeText(getApplicationContext(), getString(R.string.wrongAnswer), Toast.LENGTH_SHORT).show();
                }
                answer1.setEnabled(false);
                answer2.setEnabled(false);
                answer3.setEnabled(false);
                answer4.setEnabled(false);
                break;
        }
    }

    // This method calls CheckBoxesActivity
    public void openCheckBoxesActivity() {
        Intent openCheckBoxesActivity = new Intent(this, CheckBoxesActivity.class);
        openCheckBoxesActivity.putExtra("current_question", currentQuestion);
        openCheckBoxesActivity.putExtra("correct_score", correct_score);
        openCheckBoxesActivity.putExtra("incorrect_score", incorrect_score);
        openCheckBoxesActivity.putExtra("total_number_of_questions", totalNumberOfQuestions);
        startActivity(openCheckBoxesActivity);
    }

    // This method is called by clicking on Submit button. It creates and displays a toast with the results of the game.
    public void submit() {
        Intent openNYQuiz = getIntent();
        name = openNYQuiz.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String resultMessage = createQuizSummary(name, correct_score, incorrect_score, totalNumberOfQuestions);
        Toast.makeText(getApplicationContext(), resultMessage, Toast.LENGTH_LONG).show();
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

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next_question:
                if (!answer1.isChecked() && !answer2.isChecked() && !answer3.isChecked() && !answer4.isChecked()) {
                    Toast.makeText(this, R.string.not_chosen, Toast.LENGTH_SHORT).show();
                    return;
                }
                if (currentQuestion == 10) {
                    submit();
                    return;
                }
                break;
            case R.id.main_screen:
                mainActivity();
                break;
            case R.id.share:
                share();
                break;
        }
        currentQuestion++;
        radioGroup1.clearCheck();
        answer1.setTextColor(getResources().getColor(R.color.questions_color));
        answer2.setTextColor(getResources().getColor(R.color.questions_color));
        answer3.setTextColor(getResources().getColor(R.color.questions_color));
        answer4.setTextColor(getResources().getColor(R.color.questions_color));
        answer1.setEnabled(true);
        answer2.setEnabled(true);
        answer3.setEnabled(true);
        answer4.setEnabled(true);
        switch (currentQuestion) {
            case 3:
                Question3();
                break;
            case 4:
                Question4();
                break;
            case 5:
                Question5();
                break;
            case 6:
            case 8:
                openCheckBoxesActivity();
                break;
            case 10:
                Question10();
                break;
        }
    }
}
