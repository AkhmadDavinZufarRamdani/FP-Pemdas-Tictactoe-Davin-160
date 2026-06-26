import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private PlayerService playerService;

    public LoginFrame() {

        playerService = new PlayerService();

        setTitle("Login");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtUsername = new JTextField(15);
        txtPassword = new JPasswordField(15);
        btnLogin = new JButton("Login");

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("Username"));
        panel.add(txtUsername);

        panel.add(new JLabel("Password"));
        panel.add(txtPassword);

        panel.add(new JLabel(""));
        panel.add(btnLogin);

        add(panel);

        btnLogin.addActionListener(e -> {

            String username = txtUsername.getText();

            String password =
                    new String(txtPassword.getPassword());

            Player player =
                    playerService.login(
                            username,
                            password
                    );

            if (player != null) {

                JOptionPane.showMessageDialog(
                        this,
                        "Login Successful!"
                );

                MainMenuFrame menuFrame =
                        new MainMenuFrame(player);

                menuFrame.setVisible(true);

                dispose();
            }
            else {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid username or password!"
                );
            }
        });
    }
}