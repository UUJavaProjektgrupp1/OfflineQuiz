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
/**
 * Get the amount of answers that are correct so far
 * @return returns the amount of answers that have been correct so far as an Integer
 */
    public static int getAnswerCounter() {
        return answerCounter;
    }
/**
 * add one to the number of answers that have been correct so far
 */
    public static void setAnswerCounter() {
        answerCounter++;
    }
/**
 * get number of questions asked so far
 * @return returns number of questions asked so far
 */
    public static int getCounter() {
        return counter;
    }
/**
 * add one to the number of questions asked so far
 */
    public void AddToCounter() {
        counter++;
    }
/**
 * Check if we have asked 10 question yet
 * @return boolean
 */
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
