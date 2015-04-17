Chapter 1 Exercises

P1.1
Write a program NamePrinter that displays your name inside a box on the console screen, like this:

    +----+
    |Dave|
    +----+


P1.2
Write a program that prints your name in large letters, such as:

    *   *    **    ****    ****   *   *
    *   *   *  *   *   *   *   *  *   *
    *****  *    *  ****    ****    * *
    *   *  ******  *   *   *   *    *
    *   *  *    *  *    *  *    *   *


P1.3
Write a program FacePrinter that prints a face, using text character, hopefully better looking than this one:

       //////
      | 0 0 |
     (|  ^  |)
      | [_] |
       -----
Use comments to indicate the statements that print the hair, ears, mouth, and so on.

  **My notes on exercise P1.3:
    I used some backslashes in my face construction and each one needs to be prefaced with an additional backslash as
    an escape character.


P1.4
Write a program that prints an animal speaking a greeting, similar to (but different from) the following

     /\_/\     -----
    ( ' ' )  / Hello \
    (  -  ) <  Junior |
     | | |   \ Coder!/
    {__|__)    -----


P1.5
Write a program TicTacToeBoardPrinter that prints a tic-tac-toe board:

    +---+---+---+
    |   |   |   |
    +---+---+---+
    |   |   |   |
    +---+---+---+
    |   |   |   |
    +---+---+---+


P1.6
Write a program StaircasePrinter that prints a staircase:

                +---+
                |   |
            +---+---+
            |   |   |
        +---+---+---+
        |   |   |   |
    +---+---+---+---+
    |   |   |   |   |
    +---+---+---+---+


P1.7
Write a program that prints three items, such as the names of your three best friends or favorite movies, on three separate lines.

P1.8
Write a program that computes the sum of the first ten positive integers, 1 + 2 + ... + 10. Hint: Write a program of the form

    public class Sum10
    {
        public static void main(String[] args)
        {
            System.out.println(           );
        }
    }


P1.9
Type in and run the following program:

    import javax.swing.JOptionPane;

    public class DialogViewer
    {
       public static void main(String[] args)
       {
          JOptionPane.showMessageDialog(null, "Hello, World!");
          System.exit(0);
       }
    }

Then modify the program to show the message "Hello, your name!".


P1.10 Type in and run the following program:

    import javax.swing.JOptionPane;

    public class DialogViewer
    {
       public static void main(String[] args)
       {
          String name = JOptionPane.showInputDialog("What is your name?");
          System.out.println(name);
          System.exit(0);
       }
    }

Then modify the program to print "Hello, name!", displaying the name that the user typed in.

