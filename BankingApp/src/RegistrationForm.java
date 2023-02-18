import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField textFieldUserLogin;
    private JPasswordField passwordField;

    private JTextField textFieldFirstName;
    private JTextField textFieldLastName;
    private JButton registerButton;
    private JButton openLoginFormButton;
    private JPanel registrationPanel;

    /*public String firstName;
    public String lastName;
    public String userLogin;
    public String userPassword;*/


    public RegistrationForm() {
        // Making Panel visible, setting its Size and Title. Stop program when closing
        setContentPane(registrationPanel);
        setTitle("Registration Form");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        // LoginForm loginForm = new LoginForm();

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Assigning input to the variables
                String firstName = textFieldFirstName.getText();
                System.out.println(firstName);
                String lastName = textFieldLastName.getText();
                System.out.println(lastName);
                var passwordInput = passwordField.getPassword();
                // loginForm.userPasswordInfo = String.valueOf(passwordInput);
                String userPassword = String.valueOf(passwordInput);
                System.out.println(userPassword);
                String userLogin = textFieldUserLogin.getText();
                // loginForm.userLoginInfo = textFieldUserLogin.getText();
                System.out.println(userLogin);

                // Validation on which text fields were entered
                if (firstName.isEmpty()) {
                    textFieldFirstName.setBackground(Color.red);
                    textFieldFirstName.setText("Information is missing");
                }
                if (lastName.isEmpty()) {
                    textFieldLastName.setBackground(Color.red);
                    textFieldLastName.setText("Information is missing");
                }
                if (userLogin.isEmpty()) {
                    textFieldUserLogin.setBackground(Color.red);
                    textFieldUserLogin.setText("Information is missing");
                }

                // Checking if all data is entered
                if (!firstName.isEmpty() && !lastName.isEmpty() && !userPassword.isEmpty() && !userLogin.isEmpty())
                    System.out.println("Registration Complete");

            }
        });

        // loginForm.dispose();


        openLoginFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm();
                loginForm.show(); // Opens Login Form


                dispose(); // Closes current form
            }
        });


    }
}
