import java.util.Scanner;

public class Recursion10
{
    public static void eliminate(String str,int index){
        if(index>=str.length())return;
        if(str.charAt(index)!='x')
            System.out.print(str.charAt(index));
        eliminate(str,index+1);
    }

    public static void main(String[] args)
    {
       eliminate("abcxdefxxghixxxjklxx",0);

    }

}
