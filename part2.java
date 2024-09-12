public class part2 {
   //fr [] contains all the instances of the number
   //data [] contains the integers
   public static int findMode(int [] data, int [] fr){
       int mode = data[0];
       int maxCount = 0;
//        int [] occurences = new int[data.length];
       for(int i = 0; i < data.length; i++){
           int value = data[i];
           int count = 1;

           for (int j = 0; j < data.length; j++) {
               if (data[j] == value)
                   count++;
               if (count > maxCount) {
                   mode = value;
                   maxCount = count;
               }

//                for (int f = 0; f < fr.length; f++) {
//                    fr[f] = maxCount;
//                }
           }
       }
       return mode;
   }

   public static void main(String [] args){
       int [] usernumbers = {0,6,7,2,7};

       System.out.println(findMode(usernumbers, null));
   }
}
