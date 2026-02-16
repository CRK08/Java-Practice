import java.util.*;


class Rotation_Check {
    public static void main(String[] args) {
        //Checks if one array is rotation of another
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter First Array:");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        System.out.println("Enter Second Array:");
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        boolean isRotation = false;
        for(int i=0;i<n;i++){
            if(arr2[i] == arr1[0]){
                int j;
                for(j=0;j<n;j++){
                    if(arr1[j] != arr2[(i+j)%n]){
                        break;
                    }
                }
                if(j == n){
                    isRotation = true;
                    break;
                }
            }
        }
        if(isRotation)
            System.out.println("Yes! Rotation");
        else
            System.out.println("No! Not a Rotation");
    }
}