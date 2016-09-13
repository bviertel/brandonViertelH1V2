/*-------ARMOR CLASS-------*/

//Inherits from 'Item' class
class Armor extends Item {

  //Defense variable of 'Armor'
  private int defense;
  
  //Returns the defense value
  public int getDefense() {
    
    return defense;
  
  }

  //Sets the defense value of the 'Armor'  
  public void setDefense(int defense) {
    
    this.defense = defense;
  
  }
  
  //Personal Experimentation with setting the name, weight, and defense through one method
  //..Does work
  public void setStats(String name, int weight, int defense) {
    
    this.name = name;
    this.weight = weight;
    this.defense = defense;
  
  }

  //Returns the name, weight, and defense of the 'Armor' in form of String  
  public String examine() {
    
    return String.format("---Armor---\nName: %1$s\nWeight: %2$d kg\nDefense: %3$d\n", name, weight, defense);
  
  } 
}