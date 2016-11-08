/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package com.accenture.training.jsf.flows;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

import com.accenture.training.beans.Test;
import com.accenture.training.beans.User;
import com.accenture.training.domain.Answers;
import com.accenture.training.domain.Game;
import com.accenture.training.main.MonsterEngine;

@ManagedBean
@SessionScoped
//@RequestScoped
//@ApplicationScoped
public class GameFlowBean implements Serializable {

	//private String name;
	private User user = new User();

	Integer answer;
	
	@EJB
	private Test test;
	
	private Game currentGame;
	
	@EJB
	private MonsterEngine engine;// = new MonsterEngine();
	
	public GameFlowBean(){
		System.out.println("Creating GameFlowBean");
	}
	
	public String startGame(){
		currentGame = engine.startGame(user.getName());
		return currentGame!=null?"OK":"error";
	}

//	public String getName() {
//		System.out.println("GetName:"+name);
//		return name;
//	}
//
//	public void setName(String name) {
//		System.out.println("SetName:"+name);
//		this.name = name;
//	}

	public String getQuestion(){
		return currentGame.getCurrentQuestion().getQuestion();
    	//return "The Question";
    	//return test.getQuestion();
    }
    
    public List<String> getAnswers(){
    	Answers answers = currentGame.getCurrentQuestion().getAnswers();
    	return Arrays.asList(
    			answers.getAnswerA(), 
    			answers.getAnswerB(),
    			answers.getAnswerC(),
    			answers.getAnswerD());
    }
    
    public String getReturnValue() {
        return "/return";
    }
    
    public String checkAnswer(){
    	System.out.println("Answer: "+answer);
    	return engine.giveAnswer(currentGame, answer)?"correct":"error";
    }
    
    public String nextQuestion(){
    	return "OK";
    }
    
    public String endGame(){
    	return "OK";
    }

	public Integer getAnswer() {
		return answer;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}
	
	public Integer getWinnings(){
		return 100;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
     
}
