package com.sda.fasade;

import java.util.List;

public class QuizQuestion {
    private String questions;
    private List<String> possibleAnswers;
    private char answer;

    public QuizQuestion(String questions, List<String> possibleAnswers, char answer) {
        this.questions = questions;
        this.possibleAnswers = possibleAnswers;
        this.answer = answer;
    }

    public String getQuestions() {
        return questions;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public char getAnswer() {

        return answer;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" +
                "questions='" + questions + '\'' +
                ", possibleAnswers=" + possibleAnswers +
                ", answer=" + answer +
                '}';
    }
}
