/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accenture.training.interfaces;

import com.accenture.training.domain.Assists;

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
    
    Boolean loginUser(String userName, String passWord);
    
    Boolean resetPassword (String userName, String oldPassword, String newPassword);
    
    void resetQuestions();
    
    Integer resetScore(int score, boolean reset);
    
    void startGame(String playerName);
    
    int startGame(int score, String playerName, int numberOfAssist, boolean hasAssist);
    
    int endGame(int score, String playerName, int numberOfAssist, boolean hasAssist);
    
    int selectQuestion(int noQuestions, String questionCategory, String question, int scoreOfQuestion, int questionNumber);    
    
    int displayAssistance(int noAssists, int currentNoOfAssist, boolean hasAssist, Assists assistType);
    
    int calculateScore(int currentScore, int questionNumber );

}
