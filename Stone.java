public abstract class Stone 
{
  private double volume; // has units cm^3
  
  public Stone (double volume)
  {
    this.volume = volume;
  }
  
  public abstract double calculateMass();
  
  public double getVolume ()
  {
    return volume;
  }
}

