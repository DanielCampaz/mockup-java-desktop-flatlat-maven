package org.example.core;

import javax.swing.*;
import java.awt.*;

public abstract class JFrameBase extends JFrame {
    private int HEIGHT;
    private int WIDTH;
    private boolean exitOnClose = false;
    public JFrameBase(int width, int height) {
        super();
        this.HEIGHT = height;
        this.WIDTH = width;
    }

    public JFrameBase(String title, int width, int height) {
        super(title);
        this.HEIGHT = height;
        this.WIDTH = width;
    }

    public int getHeight() {
        return HEIGHT;
    }

    public int getWidth() {
        return WIDTH;
    }

    public void setHeight(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public void setWidth(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public void setExitOnClose(boolean exitOnClose) {
        this.exitOnClose = exitOnClose;
    }

    public boolean getExitOnClose() {
        return this.exitOnClose;
    }

    public void open() {
        if(this.exitOnClose) setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(this.getWidth(), this.getHeight()));
        setLocationRelativeTo(null);
        init();
        initComponents();
        setVisible(true);
    }

    public abstract void init();

    public abstract void initComponents();

    public static Dimension getSizeScreen() {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }
}
