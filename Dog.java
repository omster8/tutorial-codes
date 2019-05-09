public class Dog
{
  public String name;
  public String breed;
  public String ownerName;
  public int age;
  public static final int humanYearToDogYear = 7;
    
  public Dog (String name, String breed, String ownerName, int age)
  {
    this.name = name;
    this.breed = breed;
    this.ownerName = ownerName;
    this.age = age;
  }
  
  public Dog (String name, String breed, String ownerName)
  {
    this.name = name;
    this.breed = breed;
    this.ownerName = ownerName;
    age = 0;
  }
  
  public static int getAgeInHumanYears (Dog myDog)
  {
    return myDog.age * humanYearToDogYear;
  }
    
  public void incrementAge ()
  {
    age++;
  }
  
  public String getOwnerName ()
  {
    return ownerName;
  }
  
  public void changeOwner (String newOwnerName)
  {
    ownerName = newOwnerName;
  }
  
  public static void main (String [] args)
  {
    System.out.println (Dog.humanYearToDogYear);
    System.out.println (Dog.getAgeInHumanYears(new Dog("Fido", "Husky", "John", 3)));
  }
}
  



