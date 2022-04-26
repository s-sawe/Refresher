public class conditionals {

    //this class is about Java Conditional Statements
    public static void main(String[] args){
        int time = 24;
        if(time < 18){
            System.out.println("Good Afternoon");
        }else {
            System.out.println("Good Evening");
        }


        // if then else statement (including elseif)
        if(time>=24){
            System.out.println("Let's meet next day");
        } else if (time<24 && time>10) {
            System.out.println("Good Night");
        }else {
            System.out.println("Good Morning");
        }


        //shorthand if else
        int age = 54;
        String result;
        result = (age>50)? "Too Old." : "Too Young.";
        System.out.println(result);

    }
}
