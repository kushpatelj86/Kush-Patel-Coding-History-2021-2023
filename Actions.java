public interface Actions // These are the behaviors the employee object exhibits
{    
    public String getProblem();
    public void problemSolve();
    public String getQuestion();
    public void askQuestion(String question);
    public String getAnswer();
    public void setAnswer(String ans);
    public String getGreeting();
    public void setGreeting(String str);
     public void takeABreak(boolean bre);
     public boolean isOnBreak();





}