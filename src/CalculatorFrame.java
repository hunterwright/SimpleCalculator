import javax.swing.*;

/**
 * Frame of the calculator.
 */
public class CalculatorFrame extends JFrame {
    JButton[] numBtn = new JButton[10];
    JButton[] opBtn = new JButton[8];

    JTextField txt_input = new JTextField("");
    JTextField txt_output = new JTextField("");

    private String s = "";

    private boolean isMult = false;
    private boolean isDiv = false;
    private boolean isAdd = false;
    private boolean isSub = false;

    public CalculatorFrame() {
        // FRAME SETUP -----------------------------------------
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(335, 400);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        //------------------------------------------------------

        txt_input.setBounds(5,5,320,20);
        add(txt_input);
        txt_input.setHorizontalAlignment(JLabel.RIGHT);
        txt_output.setBounds(5,35,320,20);
        add(txt_output);

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
        opBtn[0].setBounds(70, 70, 60, 60);
        opBtn[1].setBounds(135, 70, 60, 60);
        opBtn[2].setBounds(200, 70, 60, 60);
        opBtn[3].setBounds(265, 70, 60, 60);
        opBtn[4].setBounds(265, 135, 60, 60);
        opBtn[5].setBounds(265, 200, 60, 60);
        opBtn[6].setBounds(265, 265, 60, 60);
        opBtn[7].setBounds(5, 335, 320, 35);
        // ADDS BUTTONS
        for (int i = 0; i < opBtn.length; i++) {
            add(opBtn[i]);
        }

        // NUMBER BUTTON FUNCTIONS
        numBtn[0].addActionListener(e -> {
            s+="0";
            txt_input.setText(s);
        });
        numBtn[1].addActionListener(e -> {
            s+="1";
            txt_input.setText(s);
        });
        numBtn[2].addActionListener(e -> {
            s+="2";
            txt_input.setText(s);
        });
        numBtn[3].addActionListener(e -> {
            s+="3";
            txt_input.setText(s);
        });
        numBtn[4].addActionListener(e -> {
            s+="4";
            txt_input.setText(s);
        });
        numBtn[5].addActionListener(e -> {
            s+="5";
            txt_input.setText(s);
        });
        numBtn[6].addActionListener(e -> {
            s+="6";
            txt_input.setText(s);
        });
        numBtn[7].addActionListener(e -> {
            s+="7";
            txt_input.setText(s);
        });
        numBtn[8].addActionListener(e -> {
            s+="8";
            txt_input.setText(s);
        });
        numBtn[9].addActionListener(e -> {
            s+="9";
            txt_input.setText(s);
        });


        // OPERATOR BUTTON FUNCTIONS
        opBtn[0].addActionListener(e -> {
            String str = txt_input.getText();
            if(!str.contains(".")) {
                s+=".";
                txt_input.setText(s);
            }
        });
        opBtn[1].addActionListener(e -> {
            s+="";
            txt_input.setText(s);
        });
        opBtn[2].addActionListener(e -> {
            txt_input.setText("");
            s = "";
        });
        opBtn[3].addActionListener(e -> {
            s+="+";
            txt_input.setText(s);
        });
        opBtn[4].addActionListener(e -> {
            s+="-";
            txt_input.setText(s);
        });
        opBtn[5].addActionListener(e -> {
            s+="*";
            txt_input.setText(s);
        });
        opBtn[6].addActionListener(e -> {
            s+="/";
            txt_input.setText(s);
        });
        opBtn[7].addActionListener(e -> {
            txt_input.setText("");
            s = "";
        });

    }
}
