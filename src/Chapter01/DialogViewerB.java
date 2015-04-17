package Chapter01;

/**
 *  Application: DialogViewerB
 *  Created on:  2015.04.17
 *
 *  GitHub Repo: cmetzger4/BigJavaExercises
 */

import javax.swing.JOptionPane;

public class DialogViewerB
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello, " + name + "!");
        System.exit(0);
    }
}