/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinequiz;

/**
 *
 * @author conta
 */
public class QuizCounter {
    private static int counter = 0;
    private static int answerCounter = 0;

    public static int getAnswerCounter() {
        return answerCounter;
    }

    public static void setAnswerCounter() {
        answerCounter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void AddToCounter() {
        counter++;
    }

    public Boolean checkCounter() {
        boolean checkCounter = false;
        if (counter == 10) {
            checkCounter = true;
        } else {
            checkCounter = false;
        }

        return checkCounter;

    }

}
