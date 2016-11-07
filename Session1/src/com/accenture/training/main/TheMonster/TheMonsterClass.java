
public class MonsterEngine implements theMonster {
	public String username;
	public String password;
	
	public String registerUser(String userName, String passWord) {
		this.username = userName;
		this.password = passWord;
	}
	
	 public int loginUser(String userName, String passWord) {
		 
	 }
	 
	 public int resetPassword (String userName, String oldPassword, String newPassword) {
		 
	 }
	 
	 public int resetQuestions() {
		 
	 }
	    
	 public int resetScore(int score, boolean reset) {
		 
		 if(reset) {
			 score = 0;
		 }
	 }
	    
	 public int initiallizeGame(String playerName) {
		 
	 }
	 
	 public int startGame(int score, String playerName, int numberOfAssist, boolean hasAssist) {
		 
	 }
	    
	 public int endGame(int score, String playerName, int numberOfAssist, boolean hasAssist) {
		 
	 }
	 
	 public int selectQuestion(int No_QUESTIONS, String questionCategory, String question, int scoreOfQuestion, int questionNumber) {
		 
	 }
	    
	 public int displayAssistance(int No_ASSISTS, int currentNoOfAssist, boolean hasAssist, enum assistType) {
		 if (hasAssist) {
			 
		 }
	 }
	    
	 public  int calculateScore(int currentScore, int questionNumber ) {
		 
	 }
}
