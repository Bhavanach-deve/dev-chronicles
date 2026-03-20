import java.util.Arrays;

class CustomList<T>{
    private Object[]elements;
    private int size;

    public CustomList(){
        elements=new Object[10];
        size=0;
    }

    public void addelements(T element){
        if(size==elements.length){
            elements= Arrays.copyOf(elements,elements.length*2);
        }
        elements[size++]=element;


    }
    public T get(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) elements[index];

    }

    public void display()
    {
        System.out.println("List elements:");
        for(int i=0;i<size;i++){
            System.out.println(elements[i]+" ");
        }
        System.out.println();

    }
    public int size(){
        return size;
    }
}
public class Custom
{
    public static void main(String[] args)
    {
        CustomList<Integer>intList=new CustomList<>();
        intList.addelements(100);
        intList.addelements(20);
        intList.addelements(40);

        intList.display();
        System.out.println("Elements at index 1:"+intList.get(1));

        CustomList<String>strList=new CustomList<>();
        strList.addelements("java");
        strList.addelements("Generics");
        strList.addelements("Wildcards");

        strList.display();
        strList.display();
        System.out.println("Element at index 2: " + strList.get(2));
    }

}
