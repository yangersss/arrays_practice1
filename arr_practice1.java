public class arr_practice1 {
    public static void main (String args[]){
        int myArray[] = new int[50];

        int c = 0;
        int p = 0;
        while (c < 50){
            if (IsPrime(p)){
                myArray[c] = p;
                c ++;
            }
            p++;
        }
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    static boolean IsPrime(int n){
        if (n == 2 || n == 3){
            return true;
        }
        if (n <= 1 || n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for (int i = 5; i * i <= n; i += 6){
            if (n % i == 0 || n % (i + 2) == 0){
                return false;
            }   
        }
        return true;
    }
}