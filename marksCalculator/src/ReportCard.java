import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReportCard {

  private JTextField textName;
  private JTextField textLmarks;
  private JTextField textSCmarks;
  private JTextField textSocmarks;
  private JTextField textGrade;
  private JTextField textAvg;
  private JTextField textTotal;
  private JButton computeButton;
  private JPanel Main;


  public static void main(String[] args) {
    JFrame frame = new JFrame("ReportCard");
    frame.setContentPane(new ReportCard().Main);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

  public ReportCard() {
    computeButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
       int Lm,scm,som,sum;
       double avg,pers;
       double grade,per;
       Lm=Integer.parseInt(textLmarks.getText());
       scm=Integer.parseInt(textSCmarks.getText());
       som=Integer.parseInt(textSocmarks.getText());
       sum=Lm+scm+som;
       avg=sum/3;



       textTotal.setText(String.valueOf(sum));
       textAvg.setText(String.valueOf(avg));


       if(avg>50 && avg<55){
         textGrade.setText("E");
       } else if (avg>55 && avg<60) {
         textGrade.setText("D");
       }
       else if(avg>59&& avg<70){
         textGrade.setText("C");
       }
       else if(avg>69 && avg<80) {
         textGrade.setText("B");
       }
       else if(avg>89){
         textGrade.setText("S");
       }
       else if(avg>79 && avg<90){
         textGrade.setText("A");
       }
       else{
         textGrade.setText("FAIL");

       }
      }
    });
  }
}
