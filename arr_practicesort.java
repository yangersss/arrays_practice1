public class arr_practicesort {
    public static void main (String[] args){
        int[] numbers = {99,84,70,112,138,157,22,171,124,90,102,191,184,93,140,22,8,15,101,124,51,129,165,60,67,88,123,97,101,188,40,106,56,55,94,87,89,97,86,66,135,170,113,20,199,89,198,29,168,28};
        int current_highest;

        for (int i = 0; i < numbers.length; i++){
            current_highest = i;
            for (int j = 0; j < numbers.length; j++){
                if (numbers[current_highest] < numbers[j]){
                    current_highest = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[current_highest];
            numbers[current_highest] = temp;
        }

        for (int x : numbers){
            System.out.println(x);
        }

    }
}
