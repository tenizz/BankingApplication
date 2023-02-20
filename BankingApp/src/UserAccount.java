import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserAccount extends JFrame {
    private JTextField depositUpdate;
    private JButton depositButton;
    private JLabel balanceField;
    private JLabel welcomeUserField;
    private JPanel informationPanel;
    private JTextField withdrawUpdate;
    private JButton withdrawButton;
    public String userFirstName = "Sam";
    public String userLastName = "Nolan";
    public double userBalance = 0.0;

    public UserAccount() {
        setContentPane(informationPanel);
        setTitle("User Account Information Form");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        welcomeUserField.setText("Welcome " + userFirstName + " " + userLastName + "!");
        balanceField.setText("Available Balance: $" + userBalance);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userBalance += Double.parseDouble(depositUpdate.getText());
                balanceField.setText("Available Balance: $" + userBalance);
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userBalance -= Double.parseDouble(withdrawUpdate.getText());
                balanceField.setText("Available Balance: $" + userBalance);
            }
        });
    }
}
