import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Insets;

/**
 * Frame of the calculator.
 */
public class CalculatorFrame extends JFrame{
    public CalculatorFrame() {

        // FRAME SETUP -----------------------------------------
        super("Simple Calculator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CalculatorPanel cp = new CalculatorPanel();
        add(cp);
        setLayout(null);
        setVisible(true);
        //------------------------------------------------------
    }
}
