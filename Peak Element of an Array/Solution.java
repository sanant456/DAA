ublic class Peak {
    public static int findPeakelement(int arr[]){
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        if(arr[0] >= arr[1]){
            return 0;
        }
        if(arr[n-1] >= arr[n-2]){
            return n-1;
        }
        for(int i=1;i<=n-1;i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return i;
            }}
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,5,8,7,9};
        int peakIndex = findPeakelement(arr);

        if(peakIndex != 1){
            System.out.println("Peak Element found at index: "+ peakIndex);
            System.out.println("Peak Element: "+arr[peakIndex]);
        } else {
            System.out.println("No peak element found. ");

        }
    }
}

