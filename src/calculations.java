public class calculations {
    public static void main(String[] args){

        //absolute value of numbers
        System.out.println(Math.abs(-4.7));

        //generating random numbers
        System.out.println(Math.random());

        //getting control of random numbers ie getting numbers within the 0 to 100 range
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);

        //getting the maximum value of two numbers
        int x = 5, y=10;
        System.out.println("The Maximum Value is " + Math.max(x,y));

        //finding the square root of a number
        System.out.println("The Value of the Square is " + Math.sqrt(81));
    }
}

