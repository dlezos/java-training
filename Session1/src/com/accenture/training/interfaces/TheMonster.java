/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.training;

/**
 *
 * @author p.tsakoniatis
 */
public interface TheMonster {

    /***
     * 
     */
    public static final int No_QUESTIONS = 4;
    public static final int No_ASSISTS = 3;
    
    String registerUser(String userName, String passWord);
    
    int loginUser(String userName, String passWord);
    
    int resetPassword (String userName, String oldPassword, String newPassword);
    
    int resetQuestions();
    
    int resetScore(int score, boolean reset);
    
    int initiallizeGame(String playerName);
    
    int startGame(int score, String playerName, int numberOfAssist, boolean hasAssist);
    
    int endGame(int score, String playerName, int numberOfAssist, boolean hasAssist);
    
    int selectQuestion(int No_QUESTIONS, String questionCategory, String question, int scoreOfQuestion, int questionNumber);    
    
    int displayAssistance(int No_ASSISTS, int currentNoOfAssist, boolean hasAssist, enum assistType);
    
    int calculateScore(int currentScore, int questionNumber );
    
    
    
    
    

}
