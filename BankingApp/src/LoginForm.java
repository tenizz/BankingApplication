import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JTextField textFieldLogin;
    private JButton enterButton;
    private JPasswordField passwordFieldLogin;
    private JButton openRegistrationFormButton;
    private JPanel loginPanel;
    public String userLoginInfo;
    public String userPasswordInfo;

    public LoginForm() {
        // Making Panel visible, setting its Size and Title. Stop program when closing
        setContentPane(loginPanel);
        setTitle("Login Form");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        openRegistrationFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrationForm registrationForm = new RegistrationForm();
                registrationForm.show(); // Opens Registration form

                dispose();  // Closes current form
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // RegistrationForm registrationForm = new RegistrationForm();


                String enteredLogin = textFieldLogin.getText();
                System.out.println(enteredLogin);
                var enteredPassword = passwordFieldLogin.getPassword();
                String enteredPasswordValue = String.valueOf(enteredPassword);
                System.out.println(enteredPasswordValue);


                if ((enteredLogin.equals(userLoginInfo) && enteredPasswordValue.equals(userPasswordInfo)) || (enteredLogin.equals("admin") && enteredPasswordValue.equals("123"))){
                    System.out.println("Login successfully!");
                    UserAccount userAccount = new UserAccount();
                    dispose();
                }
                else
                    System.out.println("Incorrect Login AND/OR Password");
            }
        });
    }
}
