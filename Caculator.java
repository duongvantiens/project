/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dương Tiến
 */
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.*;

public class Caculator {
    
    public static void main(String[] args) {
        
    }
    
    private static void createMenu() {
        final Frame fr = new Frame();
        fr.setLayout(new BorderLayout());
        
        MenuBar menu = new MenuBar();
        Menu menuFile = new Menu("Edit");
        MenuItem coptyItem = new MenuItem("Copy ctrl + C");
        MenuItem pasteItem = new MenuItem("Paste ctrl + V");
        menuFile.add(pasteItem);
        
        Menu menuHelp = new Menu("Help");
        MenuItem hTopicItem = new MenuItem("Help Topics");
        MenuItem hAboutItem = new MenuItem("About Calculator");
        menuHelp.add(hTopicItem);
        menuHelp.addSeparator();
        menuHelp.add(hAboutItem);
        menu.add(menuFile);
        menu.add(menuHelp);
        
        fr.setMenuBar(menu);
        fr.setBounds(100, 100, 300, 200);
        fr.setTitle("Calculator");
        fr.setResizable(false);
        fr.setVisible(true);
        
        fr.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
    }
}
