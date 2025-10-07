package org.example.components;

import org.example.core.JFrameBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrameBase {

    private JPanel contentPanel;
    private JTextField emailUserField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JCheckBox savePasswordChBx;
    private JCheckBox noQuestionChBx;
    private JLabel titleLabel;

    public LoginFrame() {
        super("Login", 350,400);
        //this.setExitOnClose(true);
    }

    @Override
    public void init() {
        this.titleLabel.putClientProperty("FlatLaf.styleClass", "h1");
        setResizable(false);
        this.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        this.loginButton.putClientProperty("FlatLaf.style", ""
                + "background: #1976D2;"
                + "foreground: #fff;"
                + "arc: 20;"
                + "hoverBackground: #1565C0;"
        );
        this.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(emailUserField.getText());
                System.out.println(passwordField.getPassword());
                System.out.println(savePasswordChBx.isSelected());
                System.out.println(noQuestionChBx.isSelected());
                dispose();
                SwingUtilities.invokeLater(() -> new DashboardFrame().setVisible(true));
            }
        });
    }

    @Override
    public void initComponents() {
        setContentPane(contentPanel);

        pack();
    }
}
