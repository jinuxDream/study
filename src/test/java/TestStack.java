import java.util.Stack;

/**
 * 回文的判断
 * Created by jyp on 2017/12/14.
 */
public class TestStack {

    public static void main(String[] args) {
        String str1="abab";
        System.out.println("字符串:  "+str1+" 结果为： "+isHuiWen(str1));
        String str2="abba";
        System.out.println("字符串:  "+str2+" 结果为： "+isHuiWen(str2));

    }

    static String isHuiWen(String str){
        Stack<String> strings = new Stack<String>();
        for (char c:str.toCharArray())
            strings.add(String.valueOf(c));

        String strTemp = "";
        while (!strings.isEmpty())
            strTemp+=strings.pop();

        System.out.println("字符串:  "+str+"利用栈字符串倒排后的输出字符串："+strTemp);

        if (str.equals(strTemp))
            return "Right";
        return "Wrong";
    }

}
