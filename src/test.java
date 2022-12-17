import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "l i k e,d";
        String a[] = str.split(" ");//去除空格并在空格处进行分割
        for (String s : a) System.out.println(s);

    }
}