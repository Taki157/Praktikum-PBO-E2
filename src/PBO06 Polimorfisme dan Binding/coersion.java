public class coersion {
    public static void main(String[] args) {
        // Program no 1 : int
        int output1 = 'a';
        System.out.println(output1);

        // Program no 2 : double -> int (gabisa)
        double x = 15.5;
        // int output2 = x; //gbisa dikonversi karena kemungkinan kehlangan data dari double ke int
        // System.out.println(output2);

        // Program no 3 : int -> double
        int y = 25;
        double output3 = y;
        System.out.println(output3);

        // Program no 4 : int -> char
        int z = 78;
        char output4 = (char) z; //diubah dalam ASCII no 78
        System.out.println(output4);
        
        // Program no 5 : char -> double 
        char a = 'a';
        double output5 = a; //diubah ke no ASCII 'a' dan diconvert ke double
        System.out.println(output5);
    }
}