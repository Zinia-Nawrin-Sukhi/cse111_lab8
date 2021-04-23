class Sphere extends Point {
  public Sphere(double r){
  super(7.0); 
  }
  
  double space(){
   System.out.println(" Enter radius of Sphere : "+getRadius());
        System.out.println(" Creating a Sphere.....done ! ");
        System.out.println(" The area of the Sphere "+4/3*3.1416*getRadius()*getRadius()*getRadius());
    return 3.1416*getRadius()*getRadius();
}
 }