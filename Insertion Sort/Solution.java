public class Solution {
    public static void main(String args[]){
        int arr[] = {21,45,23,91,57};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for(int k = 0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
