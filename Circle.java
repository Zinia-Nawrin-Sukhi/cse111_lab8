class Circle extends Point {
  public Circle(double r){
  super(5.0); 
  }
  
 double space(){
     System.out.println(" Enter radius of circle : "+getRadius());
        System.out.println(" Creating a Sphere.....done ! ");
       
    System.out.println("The area of the Circle is"+3.1416*getRadius()*getRadius());
    return 3.1416*getRadius()*getRadius();
}
 }