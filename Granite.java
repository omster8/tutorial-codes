public class Granite extends Stone
{
  private String color;
  
  public Granite (double volume, String color)
  {
    super (volume);
    this.color = color;
  }
  
  // Density of granite is 2.75 g/cm^3
  public double calculateMass ()
  {
    return getVolume() * 4.5; // mass has units g
  }
}