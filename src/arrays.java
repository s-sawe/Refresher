import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        int [] numbers = new int[8];
        numbers [0] = 3;
        numbers [7] = 10;
        System.out.println(Arrays.toString(numbers));

        //curly braces syntax
        int [] grade = {1, 3, 6, 7};
        System.out.println(grade.length);

        //multidimensional arrays
        int [][] multi = new int[2][3];
        multi[0][0] = 1;
        System.out.println(Arrays.deepToString(multi));

        //curly braces syntax for multidimensional arrays
        int [][] dime = {{ 1, 2, 3}, { 4, 5, 6}};
        multi[0][0] = 1;
        System.out.println(Arrays.deepToString(dime));

    }
}
