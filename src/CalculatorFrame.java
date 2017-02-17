import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Frame of the calculator.
 */
public class CalculatorFrame extends JFrame {
    JButton[] numBtn = new JButton[10];
    JButton[] opBtn = new JButton[8];

    public CalculatorFrame() {
        // FRAME SETUP -----------------------------------------
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(330, 400);
        setLayout(null);
        setVisible(true);
        //------------------------------------------------------

        // SETS NUMBER BUTTONS
        for (int i = 0; i < numBtn.length; i++) {
            numBtn[i] = new JButton(i + "");
        }
        // SETS NUMBER BUTTON BOUNDS
        numBtn[0].setBounds(200, 135, 60, 190);
        numBtn[1].setBounds(5, 135, 60, 60);
        numBtn[2].setBounds(70, 135, 60, 60);
        numBtn[3].setBounds(135, 135, 60, 60);
        numBtn[4].setBounds(5, 200, 60, 60);
        numBtn[5].setBounds(70, 200, 60, 60);
        numBtn[6].setBounds(135, 200, 60, 60);
        numBtn[7].setBounds(5, 265, 60, 60);
        numBtn[8].setBounds(70, 265, 60, 60);
        numBtn[9].setBounds(135, 265, 60, 60);
        // ADDS BUTTONS
        for (int i = 0; i < numBtn.length; i++) {
            add(numBtn[i]);
        }

        // SETS OPERATOR BUTTONS
        opBtn[0] = new JButton(".");
        opBtn[1] = new JButton("-/+");
        opBtn[2] = new JButton("C");
        opBtn[3] = new JButton("+");
        opBtn[4] = new JButton("-");
        opBtn[5] = new JButton("*");
        opBtn[6] = new JButton("/");
        opBtn[7] = new JButton("=");
        // SET OPERATOR BUTTON BOUNDS
        opBtn[0].setBounds(200, 135, 60, 190);
        opBtn[1].setBounds(5, 135, 60, 60);
        opBtn[2].setBounds(70, 135, 60, 60);
        opBtn[3].setBounds(135, 135, 60, 60);
        opBtn[4].setBounds(5, 200, 60, 60);
        opBtn[5].setBounds(70, 200, 60, 60);
        opBtn[6].setBounds(135, 200, 60, 60);
        opBtn[7].setBounds(5, 265, 60, 60);
        // ADDS BUTTONS
        for (int i = 0; i < opBtn.length; i++) {
            add(opBtn[i]);
        }

        // BUTTON FUNCTIONS
        numBtn[0].addActionListener(e -> {

        });

    }
}
