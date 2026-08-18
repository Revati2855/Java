public class find_duplicate_20 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 1};

        boolean d = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    d = true;
                    System.out.println("Duplicate: " + arr[i]);
        }
    }
}

if (d) {
    System.out.println("Duplicate exists");
} else {
    System.out.println("No duplicates");
}
    }
    
}
