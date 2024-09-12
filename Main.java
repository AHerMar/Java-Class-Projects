public class Main {
   public static void main(String [] args){
     

       System.out.println("HERNANDEZ FAMILY");
       String[] myFam = new String[] {
               "Anna Hernandez", "Jose Jr Hernandez", "Jesus Hernandez", "Gladys Hernandez",
               "Ray Hernandez", "Iris Melendrez"
       };

       int [] age = new int[]{
               18, 31, 20, 28, 30, 27
       };
       double [] heights = new double[]{
               5.3, 5.6, 5.11, 5.4, 6.0, 5.5
       };

       String [] language = new String[]{
               "Spanish", "English", "Spanish", "English",
               "Spanish", "English"
       };

       Person [] hernandezFam = new Person[] {
               new Person(), new Person(), new Person(),
               new Person(), new Person(), new Person()
       };

       for(int i = 0; i < myFam.length;i++){
           hernandezFam[i].setFullName(myFam[i]);
           hernandezFam[i].setAge(age[i]);
           hernandezFam[i].setHeight(heights[i]);
           hernandezFam[i].setLanguage(language[i]);
       }

       for(int i = 0; i < hernandezFam.length; i++){
           hernandezFam[i].print();
       }

       //Second Fam

       System.out.println("RAMIREZ FAMILY");
       String[] crushFam = new String[] {
               "Ilias Ramirez", "Isaiah Ramirez", "Maribel Remirez",
               "Juan Ramirez"
       };

       int [] theirAge = new int[]{
               17, 14, 35, 36
       };
       double [] theirHeights = new double[]{
               5.8, 5.6, 5.3, 6.0
       };

       String [] theirLanguage = new String[]{
               "English", "English", "Spanish", "English"
       };

       Person [] ramirezFam = new Person[] {
               new Person(), new Person(), new Person(),
               new Person()
       };

       for(int i = 0; i < crushFam.length;i++){
           ramirezFam[i].setFullName(crushFam[i]);
           ramirezFam[i].setAge(theirAge[i]);
           ramirezFam[i].setHeight(theirHeights[i]);
           ramirezFam[i].setLanguage(theirLanguage[i]);
       }

       for(int i = 0; i < ramirezFam.length; i++){
           ramirezFam[i].print();
       }
   }
}

