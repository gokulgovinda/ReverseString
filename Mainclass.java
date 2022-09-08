import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String str ="ABCD";
        String rev = " ";
        
        int length = str.length();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
        }
    }
