# AP23_Project

For this project I created a 4-function calculator that takes in one number, an operation and a second number. The numbers are taken in as ints and they return the answer in form of a double.

At the top of the calculator I created a text field where the operation takes place. When you click the numbered button, it will appear in the text field. When you click the operation, the first number will disappear. After entering the second number and pressing the equal sign, the text field will return the answer in form of a double.

I created a method called actionPerformed that will check what button (number) is pressed and will send it to the text field along with the operator and answer.

I created another method called operation that essentially runs the operation that is pressed. I used simple if and else if statements that check what operator was pressed and run the function of that operator after it is pressed. 

In my main method, I created the JFrame, or the frame that the calculator is in. I also created the text field that displays the operation taking place. I initialized a ButtonClickListener which will notify the code when the button is pressed. Below all of that I created buttons 0-9 as well as the mutliplication, division, addition, subtraction and equal buttons. I simply set the bounds, created the listener, and added them to the JFrame. At the very bottom I created the border of the calculator by setting the bounds and setting the color to black.

