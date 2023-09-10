
class Holder<V1, V2> {

  // variable is V1 and V2 type

  private V1 integerData;
  private V2 stringData;

  public Holder(V1 integerData, V2 stringData){

    this.integerData=integerData;
    this.stringData=stringData;
    
  }

  //getter method for two value
  
  public V1 getintegerData(){

    return integerData;
    
  }
  
  public void setintegerData(V1 integerData){

    this.integerData = integerData;
    
  }

  public V2 getstringData(){

    return stringData;
    
  }

  public void setstringData(V2 stringData){

    this.stringData = stringData;
    
  }

  @Override

  public String toString(){

    return "Holder{first= "+ integerData +" second= "+ stringData +"}";
    
  }
 
}


class GenericClass {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // CREATE ONE HOLDER OBJECT FOR INTEGER VALUE OR ITMENS
    Holder<Integer, Integer> IntHolder = new Holder <>(1, 2);

    // CREATE ONE HOLDER  OBJECTFOR INTEGER VALUE OR ITMENS
    Holder<String, String> StringHolder = new Holder <>("one", "two");

    System.out.println(IntHolder);
    System.out.println(StringHolder);

    
  }
}