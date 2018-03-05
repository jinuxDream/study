import java.util.Scanner;
import java.util.Stack;

/**
 * Created by jyp on 2018/1/2.
 */
public class Test {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一串字符，以@结束：");
        String str = scanner.nextLine();
        while ('@' != str.charAt(str.length() - 1)){
            System.out.println("请以@结尾!");
            str = scanner.nextLine();
        }
        isHuiWen(str.substring(0,str.length()-1));
    }

    private static void isHuiWen(String str) {
        Stack<String> strings = new Stack<>();
        for (char c :str.toCharArray()){
            strings.add(String.valueOf(c));
        }

        String strTemp = "";
        while (!strings.isEmpty())
            strTemp+=strings.pop();

        if (strTemp.equals(str)){
            System.out.println("是回文！");
        }else
            System.out.println("不是回文！");
    }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一串字符，以@结束：");
        String str = scanner.nextLine();
        while ('@' != str.charAt(str.length() - 1)){
            System.out.println("请以@结尾!");
            str = scanner.nextLine();
        }
        isHuiWen(str.substring(0,str.length()-1));
    }

    private static void isHuiWen(String str) {
        Stack<String> strings = new Stack<>();
        for (char c :str.toCharArray()){
            strings.add(String.valueOf(c));
        }

        String strTemp = "";
        while (!strings.isEmpty())
            strTemp+=strings.pop();

        if (strTemp.equals(str)){
            System.out.println("是回文！");
        }else
            System.out.println("不是回文！");
    }*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一串字符，以@结束：");
        String str = scanner.nextLine();
        while ('@' != str.charAt(str.length() - 1)){
            System.out.println("请以@结尾!");
            str = scanner.nextLine();
        }

        stackTest();
    }

    private static void stackTest() {
        Stack<Integer> integers = new Stack<>();

    }
}
