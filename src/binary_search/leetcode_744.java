package binary_search;

public class leetcode_744 {
    public static char nextGreatestLetter(char[] arr ,char target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }

        }
        return arr[start%arr.length];
    }
    public static void main(String[] args) {
    char[] arr = {'c','f','j'};
    char target = 'j';
      char res =  nextGreatestLetter(arr,target);
        System.out.println(res);
    }
}
