import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {

    JButton buttonReckon = new JButton("Reckon");
    JTextField inputField1 = new JTextField(5);
    JTextField inputField2 = new JTextField(5);
    JTextField inputField3 = new JTextField(5);
    JTextField inputField4 = new JTextField(5);
    JLabel answerLabel;
    JFrame window = new JFrame("RPG Character");
    JPanel panel= new JPanel();
    JLabel inputLabel1 = new JLabel ( " Enter Name: ");
    JLabel inputLabel2 = new JLabel ( " Enter Dexterity: ");
    JLabel inputLabel3 = new JLabel ( " Enter Spirit: ");
    JLabel inputLabel4 = new JLabel ( " Enter Strength: ");
    JLabel inputLabel5 = new JLabel ( " To Find Your Damage, Mana, Spell, and Cloaking Stats...  ");

    //Labels for new stats

    double dex = Double.parseDouble(inputField2.getText());
    double sprt = Double.parseDouble(inputField3.getText());
    double strength = Double.parseDouble(inputField4.getText());

    public RPGCharacterGUI() {

        window.setSize(350,350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(panel);
        window.setVisible(true);


        panel.add(inputLabel5);
        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);
        panel.add(inputLabel3);
        panel.add(inputField3);
        panel.add(inputLabel4);
        panel.add(inputField4);

        panel.add(buttonReckon);

        buttonReckon.addActionListener(new Reckon());

    }

    private class Reckon implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionevent){

            JLabel stats = new JLabel();
            JLabel damage = new JLabel();
            JLabel mana = new JLabel();
            JLabel spell = new JLabel();
            JLabel cloak = new JLabel();

            double dmg = (strength * dex)/ (sprt/100.0);
            double mna = dmg *(dmg/15.0) * (sprt/1000.0);
            double spl = (strength * sprt)* 1.34;
            double clk = (dex * sprt)* (strength * .4);

            panel.add(stats);
            panel.add(damage);
            panel.add(mana);
            panel.add(spell);
            panel.add(cloak);

            stats.setText((inputField1.getText()) + " your stats are:");
            damage.setText("Damage: " + dmg);
            mana.setText("Mana: " + mna);
            spell.setText("Spell: " + spl);
            cloak.setText("Cloak: "+ clk);

        }
    }
}
