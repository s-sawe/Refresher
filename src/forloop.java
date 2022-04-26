public class forloop {
    public static void main(String[] args){

        //normal increments
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //for loop for even numbers only
        for (int s = 0; s < 5; s = s+2){
            System.out.println("The Even Values Are " +s);
        }

        //for loop for odd numbers only
        for (int s = 0; s < 10; s++){
            if( s%2 !=0){
                System.out.println("The Odd Values Are " +s);
            }
        }


        //printing a triangle
        for (int s = 1; s <= 5; ++s) {

            for (int j = 1; j <=s; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }


        //full pyramid
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}


