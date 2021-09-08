public class FirstJavaHomework {//main() method & println() method
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        //dataType variable = value
        String userName = "CF_McGee";
        System.out.println(userName);

        //Primitive Data Types
        byte bits = 126;
        System.out.println(bits);
        short lo_ng = 29700;
        System.out.println(lo_ng);
        int longer = 1002700;
        System.out.println(longer);
        long longest = 1010103045;
        System.out.println(longest);
        // WHOLE NUMBERS DATA TYPES ^
        float myFloat = 6.39f;
        System.out.println(myFloat);
        double Timed = 7.43;
        System.out.println(Timed);
        // FRACTIONAL NUMBERS DATA TYPES ^
        boolean myBL = true;
        System.out.println(myBL);
        // TRUE OR FALSE ^
        char letter = '(';
        System.out.println(letter);
        // SINGLE CHARACTER ^


        // Widening Casting
        int anIntNumber = 23;
        long aLongNumber = anIntNumber;
        System.out.println(aLongNumber);

        // Narrowing Casting
        double doubleNumber = 46.60;
        int intNumber = (int) doubleNumber;

        System.out.println(doubleNumber);
        System.out.println(intNumber);

        //Operators + String + Math: ADDITION, MULTIPLICATION [3 LESSON COMBO] [\n = New Line & \t = Tab]
        byte byteNumber = 120;
        System.out.println(bits);
        short shortNumber = 32700;
        String text = "CONGRATS! You win over 50k!\nThe money will appearing in your account soon.\tThanks for entering the sweepstakes.";
        System.out.println((shortNumber + byteNumber) * 2);
        System.out.println(text);


        //STRING METHODS
        String uppercase = "This will look like I am yelling in text!";
        String lowercase = "This will look like I am whispering in text!";
        System.out.println(uppercase.toUpperCase().concat("\n").concat(lowercase.toLowerCase()));


        //RANDOM NUMBER MATH METHOD
        int randomNumber = (int)(Math.random() * 530);
        System.out.println(randomNumber);


    }}
