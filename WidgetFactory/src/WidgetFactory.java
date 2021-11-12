import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class WidgetFactory {
    final static int WIDGETS_PER_HOUR = 10;
    final static int NUM_SHIFTS = 2;
    final static int SHIFT_HOURS = 8;
    final static int  NUMWORKERS = 5;
    final static double WAGE = 16.50;
    final static double WIDGET_PRICE = 10.00;
    static int numWidgets = 0;

    public static void main(String[] args) {
        input();
        output();

    }
    public static void input(){
        numWidgets = Integer.parseInt(JOptionPane.showInputDialog("How many widgets do you need"));
    }

    public static  int widgetsPerDay(){
        return NUM_SHIFTS * SHIFT_HOURS * WIDGETS_PER_HOUR;
    }

    public static int numDays(){
        return (int)Math.ceil(numWidgets/(double)widgetsPerDay());
    }

    public static double cost(){
        return numDays()* NUM_SHIFTS * SHIFT_HOURS * WAGE * NUMWORKERS;
    }

    public static double profit(){
        return numWidgets * WIDGET_PRICE - cost();
    }
    public static void output(){

        String message = "";
        message += "Number of Widgets " + numWidgets;
        message += "\nNumber of Days: " + numDays();
        message += "\nCost of widgets: " + (numWidgets * WIDGET_PRICE);
        message += "\nCost pf production: " + cost();
        message += "\nProfit: " + profit();

        JOptionPane.showMessageDialog(null,message);
    }

    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production: $9,240.00
     Profit: $760.00

     */

    //my stuff added below
   /* public static JFrame window = new JFrame ("Widget Factory");
    public static JPanel panel = new JPanel();
    public static JLabel Label1 = new JLabel("How many widgets to you want made?");
    public static JTextField numWid = new JTextField(3);
    public static JButton button = new JButton("Calculate");
    public static JLabel calculation = new JLabel();

    public static void main(String[] args) {

        window.add(panel);
        window.setSize(350,350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panel.add(Label1);
        panel.add(numWid);
        panel.add(button);
        panel.add(button);

        button.addActionListener(new button());
    }
    private static class button implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionevent){
            int wid = Integer.parseInt(numWid.getText());

            calculation.setText(wid)




        }

    }*/


}
