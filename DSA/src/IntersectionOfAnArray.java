import java.util.Scanner;

class Intersection
{
    void elements(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in 1st array:");
        int a=sc.nextInt();
        System.out.println("Enter elements of 1st Array:");
        int arr1[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter number of elements in 2nd array:");
        int b=sc.nextInt();
        System.out.println("Enter elements of 2nd Array:");
        int arr2[]=new int[a];
        for(int i=0;i<b;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("The common elements from both the arrays are:");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                    break;
                }
            }
        }

    }
}
public class IntersectionOfAnArray
{
    public static void main(String[] args)
    {
        Intersection i = new Intersection();
        i.elements();

    }
}

