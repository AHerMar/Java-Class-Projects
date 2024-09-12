public class Person {
   private String fullName;
   private int age;
   private double height;
   private String language;

   public Person(){
       this.fullName = null;
       this.age = 0;
       this.height = 0.;
       this.language = null;
   }

   public Person(String fullName, int age, double height, String language){
       this.fullName = fullName;
       this.age = age;
       this.height = height;
       this.language = language;
   }

   public String getFullName(){
       return this.fullName;
   }

   public int getAge(){
       return this.age;
   }

   public double getHeight(){
       return this.height;
   }

   public String getLanguage(){
       return this.language;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public void setFullName(String fullName) {
       this.fullName = fullName;
   }

   public void setHeight(double height) {
       this.height = height;
   }

   public void setLanguage(String language) {
       this.language = language;
   }

   public void print(){
       System.out.println("Fullname: " + this.fullName);
       System.out.println("Age: " + this.age);
       System.out.println("Height: " + this.height + " ft");
       System.out.println("Primary Language: " + this.language + "\n");
   }
}
