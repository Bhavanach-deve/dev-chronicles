public class TwoPointerReverse {
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1,0};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int array:arr) {
            System.out.print(array + " ");
        }
    }
}
