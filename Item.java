/*-------MAIN ITEM CLASS-------*/

class Item {
  
  //Declaring a name for every 'Item'
  public String name;
  
  //Declaring a weight for every 'Item'
  public int weight;
  
  //Returns the name of the 'Item'
  public String getName() {
    
    return name;
    
  }
  
  //Sets the name of the 'Item'
  public void setName(String name) {
    
    this.name = name;
  
  }
  
  //Returns the weight of the 'Item'
  public int getWeight() {
    
    return weight;
  
  }
  
  //Personal Experimentation with setting the name and weight through one method
  //..Does work
  public void setStats(String name, int weight) {
    
    this.name = name;
    this.weight = weight;
  
  }
  
  //Sets the weight of the 'Item'
  public void setWeight(int weight) {
    
    this.weight = weight;
  
  }
  
  //Returns the name and weight of the 'Item' in form of String
  public String examine() {
    
    return String.format("---Item---\nName: %1$s\nWeight: %2$d kg\n", name, weight);
  
  }

}