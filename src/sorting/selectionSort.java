package sorting;
// tc = n^2;
public class selectionSort {
      public static void  sort(int[] a){
          for (int i = 0; i < a.length-1 ; i++) {
              int min= i;
              for (int j = i+1; j < a.length; j++) {
                  if(a[min]> a[j]){
                      min = j;
                  }
              }
              int temp = a[min];
              a[min] = a[i];
              a[i] = temp;
          }

      }
      public static void display(int[] r){
          for (int i = 0; i < r.length; i++) {
              System.out.print(r[i]  + " , ");
          }
          System.out.println();
      }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,9,8,7,0};
        sort(arr);
        display(arr);
    }
}
