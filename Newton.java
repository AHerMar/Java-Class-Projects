import java.lang.Math;
//Finds the root using Newton's Method, using an aboslute error stopping criterion and a tolerance of 0.00005
//Math 225 Spring 2024
public class Newton{
  public static double iterFunc (double x){
    //x - f(x)/f'(x) 
    return x - (Math.pow(x,3) + x - 1)/(3*Math.pow(x,2)+1);
}

public static void main(String [] args){
  double oldEst = 0;
  double tol = 0.00005;
  double n = 0;
  double nmax = 50;

  double error = 1;
  while(error > tol && n < nmax){
  double newEst = iterFunc(oldEst);
  System.out.println(newEst);
  error = Math.abs(newEst - oldEst);
  oldEst = newEst;
  n++;
  }
}
