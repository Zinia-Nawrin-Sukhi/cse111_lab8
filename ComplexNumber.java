class ComplexNumber extends RealNumber{
  double complxval;
  ComplexNumber(){
    super(1.0);
    complxval=1.0;
  }
  ComplexNumber(double f,double s){
    super(f);
    complxval=s;
  }
  public String toString(){
    System.out.println("RealPart: "+getRealValue());
    return "imaginarypart: "+complxval ;
  }
  void check(){
    System.out.println("i am in real number clss");
    System.out.println("i am in complex number clss");
    System.out.println("check ended");
  }
}