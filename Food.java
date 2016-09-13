/*-------FOOD CLASS------*/

//Inherits from 'Item' class
class Food extends Item {
  
  //Nutrition variable of 'Food'
  private int nutrition;

  //Quantity variable of 'Food'
  private int quantity;
  
  //Returns the nutition value  
  public int getNutrition() {
    
    return nutrition;
  
  }
  
  //Sets the nutrition value of the 'Food'  
  public void setNutrition(int nutrition) {
    
    this.nutrition = nutrition;
  
  }

  //Returns the quantity value of the 'Food'
  public int getQuantity() {
    
    return quantity;
  
  }
  
  //Sets a new quantity of the 'Food'
  public void setQuantity(int newQuantity) {
    
    this.quantity = newQuantity;
  
  }
  
  //Personal Experimentation with setting the name, weight, nutrition, and quantity through one method
  //..Does work
  public void setStats(String name, int weight, int nutrition, int quantity) {
    
    this.name = name;
    this.weight = weight;
    this.nutrition = nutrition;
    this.quantity = quantity;
  
  }

  //Returns the name, weight, nutrition, and quantity of the 'Food' in form of String
  public String examine() {
    
    return String.format("---Food---\nName: %1$s\nWeight: %2$d kg\nNutrition: %3$d\nQuantity: %4$d\n", name, weight, nutrition, quantity);
  
  } 
}