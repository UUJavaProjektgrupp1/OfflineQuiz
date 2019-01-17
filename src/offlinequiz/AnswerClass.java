/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinequiz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author conta
 */
public class AnswerClass {

    private static String question;
    private static String answer1;
    private static String answer2;
    private static String answer3;
    private static String correctAnswer;

    public static String getQuestion() {
        return question;
    }

    public static void setQuestion(String question) {
        AnswerClass.question = question;
    }

    public static String getAnswer1() {
        return answer1;
    }

    public static void setAnswer1(String answer1) {
        AnswerClass.answer1 = answer1;
    }

    public static String getAnswer2() {
        return answer2;
    }

    public static void setAnswer2(String answer2) {
        AnswerClass.answer2 = answer2;
    }

    public static String getAnswer3() {
        return answer3;
    }

    public static void setAnswer3(String answer3) {
        AnswerClass.answer3 = answer3;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static void setCorrectAnswer(String correctAnswer) {
        AnswerClass.correctAnswer = correctAnswer;
    }

    public void randomizeAnswers() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String[][] array = new String[2][4];
        array[0][0] = "Vilken av dessa drycker har en variant som kallas 'Exotic'";
        array[0][1] = "Fanta ---";
        array[0][2] = "Coca-cola";
        array[0][3] = "Sprite";
        array[1][0] = "Vilken tillverkare har gjort skärmarna i systemet?";
        array[1][1] = "Samsung";
        array[1][2] = "LG";
        array[1][3] = "Sony ---";

        int randomInt = (int) Math.round(Math.random());
        setQuestion(array[randomInt][0]);
        for (int i = 0; i < 20; i++) {
            for (int j = 1; j <= 3; j++) {
                String answer = array[randomInt][j];
                if (answer.contains("---")) {
                    answer = answer.substring(0,answer.indexOf("-"));
                    setCorrectAnswer(answer);
                }
                    switch(j){
                        case 1:
                            setAnswer1(answer);
                            break;
                        case 2:
                            setAnswer2(answer);
                            break;
                        case 3:
                            setAnswer3(answer);
                            break;
                }

            }

        }
    }

}
