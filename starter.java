import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator {

    private static JTextField textField;
    private static double num1 = 0; //declare first number
    private static double num2 = 0; //declare second number
    private static char operator = ' '; //declare variable
    
    private static class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { //Method for putting the buttons clicked into the text field
            JButton button = (JButton) e.getSource(); //
            String buttonText = button.getText();//Variable for what is put into the text field
            if (buttonText.matches("[0-9.]")) { //If I click a button 0-9, it will send it to the text field
                textField.setText(textField.getText() + buttonText); //Puts the clicked button into the text field
            } else if (buttonText.matches("[+\\-*/]")) { //If I click an operator, it will send it to the text field
                num1 = Double.parseDouble(textField.getText()); //Stores the first number typed into int num1
                operator = buttonText.charAt(0);//Set operator clicked to operator variable
                textField.setText(""); //Once an operator is clicked, it will set the text field to nothing
            } else if (buttonText.equals("=")) { //If I click equal, it will perform the operation
                num2 = Double.parseDouble(textField.getText()); //Stores the second number into int num2
                double result = operation(num1, num2, operator); //sets result of operation to double result
                textField.setText(String.valueOf(result)); //Ouputs the result of the operation into the text field
            }
        }
        
        private double operation(double num1, double num2, char operator) { //operation method
            double result = 0;
            if(operator == '+'){
                result = num1+num2;          
            }
            else if(operator == '-'){
                result = num1-num2;
            } 
            else if(operator == '*'){
                result = num1*num2;
            }
            else if(operator == '/'){
                result = num1/num2;
            }
            return result;
        }
    
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(); //Create frame
        frame.setLayout(null); //No specific layout order
        textField = new JTextField(); //Create text field
        textField.setBounds(10, 10, 470, 50); //set dimensions of text field
        frame.add(textField); //add text field to frame
        ButtonClickListener listener = new ButtonClickListener(); //Create button listener

        //Create all the number buttons :
        //Order of layers based on order of code (first button = first layer)
        //Zero
        JButton button0 = new JButton("0");
        button0.setBounds(30, 400, 100, 50); //Sets dimensions of button
        button0.addActionListener(listener); //Adds button action
        frame.add(button0); //Adds button to frame

        //One
        JButton button1 = new JButton("1");
        button1.setBounds(150, 400, 100, 50);
        button1.addActionListener(listener);
        frame.add(button1);

        //Two
        JButton button2 = new JButton("2");
        button2.setBounds(270, 400, 100, 50);
        button2.addActionListener(listener);
        frame.add(button2);

        //Three
        JButton button3 = new JButton("3");
        button3.setBounds(390, 400, 100, 50);
        button3.addActionListener(listener);
        frame.add(button3);

        //Four
        JButton button4 = new JButton("4");
        button4.setBounds(30, 320, 100, 50);
        button4.addActionListener(listener);
        frame.add(button4);

        //Five
        JButton button5 = new JButton("5");
        button5.setBounds(150, 320, 100, 50);
        button5.addActionListener(listener);
        frame.add(button5);

        //Six
        JButton button6 = new JButton("6");
        button6.setBounds(270, 320, 100, 50);
        button6.addActionListener(listener);
        frame.add(button6);

        //Seven
        JButton button7 = new JButton("7");
        button7.setBounds(390, 320, 100, 50);
        button7.addActionListener(listener);
        frame.add(button7);

        //Eight
        JButton button8 = new JButton("8");
        button8.setBounds(30, 240, 100, 50);
        button8.addActionListener(listener);
        frame.add(button8);

        //Nine
        JButton button9 = new JButton("9");
        button9.setBounds(150, 240, 100, 50);
        button9.addActionListener(listener);
        frame.add(button9);

        //Add
        JButton buttonAdd = new JButton("+");
        buttonAdd.setBounds(270, 240, 100, 50);
        buttonAdd.addActionListener(listener);
        frame.add(buttonAdd);

        //Subtract
        JButton buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(390, 240, 100, 50);
        buttonSubtract.addActionListener(listener);
        frame.add(buttonSubtract);

        //Multiply
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(30, 160, 100, 50);
        buttonMultiply.addActionListener(listener);
        frame.add(buttonMultiply);

        //Divide
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(150, 160, 100, 50);
        buttonDivide.addActionListener(listener);
        frame.add(buttonDivide);

        //Decimal
        JButton buttonDecimal = new JButton(".");
        buttonDecimal.setBounds(270, 160, 100, 50);
        buttonDecimal.addActionListener(listener);
        frame.add(buttonDecimal);

        //Equal
        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(390, 160, 100, 50);
        buttonEqual.addActionListener(listener);
        frame.add(buttonEqual);

        //Calculator Outside
        JButton calc = new JButton("");
        calc.setBounds(10, 70, 500, 470);
        calc.setBackground(Color.BLACK); //Sets colors to black
        frame.add(calc);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
