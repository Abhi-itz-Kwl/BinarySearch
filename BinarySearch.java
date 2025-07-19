public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        //int[] arr={90,75,18,12,6,4,3,1};
       // int target=12;
       int target=36;
        System.out.print(findnum(arr,target));
    }
    /*static int findnum(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(target>arr[mid])
            {
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }*/
    /*static int findnum(int[] arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+((e-s)/2);
            if(target>arr[mid])
            {
                e=mid-1;
            }
            else if(target<arr[mid])
            {
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }*/
    static int findnum(int[] arr,int target)
    {
         int s=0;
         int e=arr.length-1;
         boolean isans=arr[s]<arr[e];
         while(s<=e)
         {
            int mid=s+((e-s)/2);
            if(isans)
            {
                if(target>arr[mid])
               {
                   s=mid+1;
               }
               else if (target<arr[mid])
               {
                   e=mid-1;
               }
           else
           {
                return mid;
           }
            }
            else
            {
                if(target>arr[mid])
                {
                    e=mid-1;
                }
                else if   (target<arr[mid])
               {
                   s=mid+1;
               }
              else{
                return mid;
            }
            }
            
           
         }
         return -1;
    }
    
}
