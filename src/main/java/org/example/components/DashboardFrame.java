package org.example.components;

import org.example.core.JFrameBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DashboardFrame extends JFrameBase {
    private JPanel navPanel;
    private JPanel mainPanel;
    private boolean navVisible = true;

    public DashboardFrame() {
        super("Dashboard",900, 600);
        UIManager.put("Button.arc", 12);
        this.setExitOnClose(true);
        setLayout(new BorderLayout());

        // 🔹 Panel lateral (nav)
        navPanel = new JPanel();
        //navPanel.setBackground(new Color(33, 150, 243));
        navPanel.setPreferredSize(new Dimension(200, getHeight()));
        navPanel.setLayout(new GridLayout(5, 1, 10, 10));

        navPanel.add(new JButton("Inicio"));
        navPanel.add(new JButton("Usuarios"));
        navPanel.add(new JButton("Reportes"));
        navPanel.add(new JButton("Ajustes"));
        navPanel.add(new JButton("Salir"));

        // 🔹 Panel principal
        mainPanel = new JPanel();
        //mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());

        JButton btnToggle = new JButton("☰");
       // btnToggle.putClientProperty("FlatLaf.style", "arc: 8; background: #1976D2; foreground: #fff;");
        btnToggle.addActionListener(this::toggleNav);

        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //header.setBackground(new Color(245, 245, 245));
        header.add(btnToggle);

        mainPanel.add(header, BorderLayout.NORTH);
        mainPanel.add(new JLabel("Contenido principal aquí", SwingConstants.CENTER), BorderLayout.CENTER);

        // 🔹 Agregar todo al frame
        add(navPanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }

    // 🔹 Método para mostrar/ocultar el nav
    private void toggleNav(ActionEvent e) {
        navVisible = !navVisible;
        navPanel.setVisible(navVisible);
        revalidate(); // Actualiza el layout
        repaint();
    }

    @Override
    public void init() {

    }

    @Override
    public void initComponents() {

    }
}

