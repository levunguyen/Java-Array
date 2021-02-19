package _09_array;

public class MyArray {
    public static void main(String[] args) {
        String myArray[] ;
        String[] myArray_1 = {"Volvo","BMW", "Ford","Mazda"};
        String[] myArray_2 = new String[10];

        System.out.println(myArray_1[myArray_1.length - 1]);
        myArray_1[0] = "Toyota";
        System.out.println(myArray_1[0]);

        for(int index = 0; index < myArray_1.length ;index++){
            System.out.print(myArray_1[index] + "\t");
        }
    }
}
