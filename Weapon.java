/*-------WEAPON CLASS-------*/

//Inherits from the 'Item' class
class Weapon extends Item {
  
  //Damage variable of a 'Weapon'
  private int damage;
  
  //Returns the damage of the 'Weapon'
  public int getDamage() {
    
    return damage;
  
  }
  
  //Sets the damage of a 'Weapon'
  public void setDamage(int damage) {
    
    this.damage = damage;
  
  }
  
  //Personal Experimentation with setting the name, weight, and damage through one method
  //..Does work
  public void setStats(String name, int weight, int damage) {
    
    this.name = name;
    this.weight = weight;
    this.damage = damage;
  
  }
  
  //Returns the name, weight, and damage of the 'Weapon' in form of String
  public String examine() {
    
    return String.format("---Weapon---\nName: %1$s\nWeight: %2$d kg\nDamage: %3$d\n", name, weight, damage);
  
  } 
}