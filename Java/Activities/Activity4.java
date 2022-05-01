public class Activity4 {

    public static void main(String[] args) {
        int[] arr = {9,5,4,1,3};
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for(int j=0;j<i;j++)
            if(arr[j]>arr[i])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}