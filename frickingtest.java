public class frickingtest {
    public static void main(String[] args) {
        int[] numbers = {99,84,70,112,138,157,22,171,124,90,102,191,184,93,140,22,8,15,101,124,51,129,165,60,67,88,123,97,101,188,40,106,56,55,94,87,89,97,86,66,135,170,113,20,199,89,198,29,168,28}; // given numbers we need to sort
        int current_lowest; // index of lowest number we have found in the array so far
  
        // loop through the array
        for(int i=0; i<numbers.length-1; i++){
            current_lowest = i;
           
          // loop through the rest of the array 
          // starting at +1 because we don't need to compare a number to itself
          for(int j=i+1; j<numbers.length; j++){ 
        // j can be used to represent the index of a value in the array to compare the current_lowest to 
                if(numbers[current_lowest] > numbers[j]){
                    current_lowest = j; // found a new lowest value
                }
            }
  
            // swap the location of the original value, and new lowest value
            int temp = numbers[i];
            numbers[i] = numbers[current_lowest];
            numbers[current_lowest] = temp;
        }
  
        for(int x : numbers){ // for each integer in numbers
            System.out.println(x);
        }
    }
 
}
