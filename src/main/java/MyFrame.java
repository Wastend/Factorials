import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

/**
 *This class sets parameters for the graphical window
 */
public class MyFrame extends JFrame implements ActionListener {
    /**
     * jTextField - a text window in which you need to enter a number to calculate the sum of the inverse factorials
     */
    private JTextField jTextField;
    /**
     * jButton - button to start the calculation
     */
    private JButton jButton;
    /**
     * jLabel - outputs the result of calculations
     */
    private JLabel jLabel;

    /**
     * window creation constructor
     */
    public MyFrame(){

        JLabel text = new JLabel("Результат");
        text.setBounds(160,50,80,40);

        jLabel = new JLabel();

        jTextField = new JTextField();
        jTextField.setBounds(120,280,80,30);

        jButton = new JButton("Вычислить");
        jButton.setBounds(240,280,120,30);
        jButton.addActionListener(this);

        this.setTitle("Factorials");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(jTextField);
        this.add(jButton);
        this.add(text);
        this.add(jLabel);
        this.setResizable(false);
        this.setSize(400,400);
        this.setVisible(true);
    }

    /**
     * A method that regulates the behavior of the program after pressing a certain button
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * If a number was entered in the text field, the program will calculate the result
         * Otherwise, an error about incorrect input will be displayed
         */
        if (e.getSource() == jButton){
            Factorials factorials = new Factorials();
            try {
                BigDecimal result = factorials.sumOfDivFact(Integer.parseInt(jTextField.getText()));
                jLabel.setBounds(150,100,80,40);
                jLabel.setText(String.valueOf(result));
            } catch (Exception E){
                jLabel.setBounds(105,100,180,40);
                jLabel.setText("Введите число в поле ввода");
            }
        }
    }
}
