import java.util.Scanner;

public class QuestionService {
    Question [] questions = new Question[5];
    String [] selection = new String[5];

    public QuestionService(){
        // Question 1
        questions[0] = new Question(1, "What programming language is this?", "cpp", "java", "python", "c", "2");

        // Question 2
        questions[1] = new Question(2, "Which of the following is an object-oriented programming language?", "cpp", "java", "python", "c", "2");

        // Question 3
        questions[2] = new Question(3, "Which language is known for its simplicity and readability?", "cpp", "java", "python", "c", "3");

        // Question 4
        questions[3] = new Question(4, "In which language is memory management done manually?", "cpp", "java", "python", "c", "4");

        // Question 5
        questions[4] = new Question(5, "Which language is commonly used for system programming?", "cpp", "java", "python", "c", "4");

 

    }



    public void playQuiz(){
    int i = 0 ;{
      for(Question q : questions){
        System.out.println("Question no. :"+ q.getId());
        System.out.println(q.getQuestion());
        System.out.println("opt1" + q.getOpt1());
        System.out.println("opt2 " +q.getOpt2());
        System.out.println("opt3 " +q.getOpt3());
        System.out.println("opt4 " +q.getOpt4());
        Scanner sc = new Scanner(System.in);
        selection[i] = sc.nextLine();
        i += 1;
      }
      System.out.println("Your answers are : ");
      for(String s : selection){
        System.out.println(s);
      }


    }
}
public void printScore(){
    int score = 0;
    for(int i = 0 ; i < questions.length ; i++){
        Question que = questions[i];
        String actualAnswer = que.getAnswer();
        String userAnswer = selection[i];
        if(actualAnswer.equals(userAnswer)){
            score += 1;
        }

        
    }
    System.out.println("Your Score is : " + score);

}



     


   
    
}
