import package1.MyCalc;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        boolean cont=true;
        do {
            Scanner sc = new Scanner(System.in);

            MyCalc myCalc = new MyCalc();

            System.out.println("------Calculator-----\n" +
                    "Functions avaliable: +, -, *, /, ^, sin, cos, tan, mod(%)\n"+
                    "\t1. Additon\n" +
                    "\t2. Extraction\n" +
                    "\t3. Multiply \n" +
                    "\t4. Division\n" +
                    "\t5. Mod \n" +
                    "\t6. Power\n" +
                    "\t7. Square root\n" +
                    "\t8. sin\n" +
                    "\t9. cos\n" +
                    "\t10. tan\n" +
                    "\t11. help\n" +
                    "\t0. Exit \n"+
                    "Please enter your function: ");
            String func = sc.nextLine();

            System.out.print("Please enter your first number: ");
            double a = sc.nextDouble();

            System.out.print("Please enter your second number: ");
            double b = sc.nextDouble();

            // random error fix
            sc.nextLine();

            // initialize the result variable "c"
            double c = 0;

            switch (func) {
                // text function is add, subtract ...

                default:
                    System.out.println("The function you have entered has been misspelled or has not yet been implemented!");

                case "help":
                    myCalc.help();
                    break;
                case "11":
                    myCalc.help();
                    break;
                case "add":
                    c = myCalc.add(a, b);
                    break;
                case "1":
                    c = myCalc.add(a, b);
                    break;
                case "subtract":
                    c = myCalc.subtract(a, b);
                    break;
                case "2":
                    c = myCalc.subtract(a, b);
                    break;
                case "multiply":
                    c = myCalc.multiply(a, b);
                    break;
                case "3":
                    c = myCalc.multiply(a, b);
                    break;

                case "divide":
                    c = myCalc.divide(a, b);
                    break;

                case "4":
                    c = myCalc.divide(a, b);
                    break;

                // same as above except with symbols
                case "+":
                    c = myCalc.add(a, b);
                    break;

                case "-":
                    c = myCalc.subtract(a, b);
                    break;

                case "*":
                    c = myCalc.multiply(a, b);
                    break;

                case "/":
                    c = myCalc.divide(a, b);
                    break;

                case "sin":
                    c = myCalc.sin(a, b);
                    break;
                case "8":
                    c = myCalc.sin(a, b);
                    break;

                case "cos":
                    c = myCalc.cos(a, b);
                    break;
                case "9":
                    c = myCalc.cos(a, b);
                    break;

                case "tan":
                    c = myCalc.tan(a, b);
                    break;
                case "10":
                    c = myCalc.tan(a, b);
                    break;

                case "sqrt":
                    c = myCalc.sqrt(a, b);
                    break;
                case "7":
                    c = myCalc.sqrt(a, b);
                    break;

                case "^":
                    c = myCalc.pow(a, b);
                    break;
                case "6":
                    c = myCalc.pow(a, b);
                    break;
                case "%":
                    c = myCalc.mod(a, b);
                    break;

                case "mod":
                    c = myCalc.mod(a, b);
                    break;
                case "5":
                    c = myCalc.mod(a, b);
                    break;
                case "0":
                    System.exit(0);


            }

            // TODO for more functions!
            System.out.println("Answer: " + c);
            boolean answer=false;
            do{
            System.out.println("One more? y/n");
            String yesOrNO=sc.nextLine();

               if(yesOrNO.equalsIgnoreCase("y")){
                   cont=true;
                   answer=true;
               } else if (yesOrNO.equalsIgnoreCase("n")) {
                   cont=false;
                   answer=true;
               } else{
                   System.out.println("Check your answer");
                   answer=false;
               }
            }while(answer==false);

        }while (cont==true);
    }

}