//Main class to run the program 
public class rpg {
  
//Main Method
  public static void main(String[] args) {
    
/*-------BASIC ITEM TEST-------*/
    
    //Declaring new 'Item'
    Item gem1 = new Item();
    
    //Set the name and weight of the new item
    gem1.setName("Emerald");
    gem1.setWeight(2);
    
    //Examines the 'gem' item, displaying all relevant stats
    System.out.println(gem1.examine());
    
    /*---MULTI SET BASIC ITEM TEST---*/
    
    Item gem2 = new Item();
    
    gem2.setStats("Opal", 6);
    
    System.out.println(gem2.examine());

/*-------WEAPON TEST-------*/
    
    //Declaring new 'Weapon'
    Weapon sword = new Weapon();
    
    //Initializing all statsof the 'Weapon' (name, weight, damage)
    sword.setName("Excalibur");
    sword.setWeight(10);
    sword.setDamage(10);

    //Examines the 'Weapon' item, displaying all relevant information
    System.out.println(sword.examine());
    
    /*---MULTI SET WEAPON TEST---*/
    
    Weapon hammer = new Weapon();
    
    hammer.setStats("Thor", 6, 10000);
    
    System.out.println(hammer.examine());
    
/*-------ARMOR TEST-------*/
    
    //Declaring new 'Armor'
    Armor shield = new Armor();
    
    //Initializing all stats of the 'Armor' (name, weight, defense)
    shield.setName("Iron Shield");
    shield.setWeight(10);
    shield.setDefense(10);

    //Examines the 'Armor' item, displaying all relevant information
    System.out.println(shield.examine());
    
    /*---MULTI SET ARMOR TEST---*/
    
    Armor legPlate = new Armor();
    
    legPlate.setStats("Leg Plate", 4, 20);
    
    System.out.println(legPlate.examine());
    
/*-------FOOD TEST-------*/
    
    // Declaring new 'Food'
    Food cake = new Food();
    
    // Initializing all stats of the 'Food' (name, weight, nutrition, quantity)
    cake.setName("Cake");
    cake.setWeight(2);
    cake.setQuantity(4);
    cake.setNutrition(4);
    
    // Examines the 'Food' item, displaying all relevant information
    System.out.println(cake.examine());
    
    /*---MULTI SET FOOD TEST---*/
    
    Food taco = new Food();
    
    taco.setStats("Taco", 1, 6, 3);
    
    System.out.println(taco.examine());

  }
}










  

