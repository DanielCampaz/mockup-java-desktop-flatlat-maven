package org.example;

import org.example.components.ChangeThemePanel;
import org.example.components.LoginFrame;
import org.example.themes.CustomTheme_Dark;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Launch the book editor form
        CustomTheme_Dark.setup();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.open();
            }
        });
    }
}