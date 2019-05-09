public class Balloon implements Colored
{
  private String color;
  private double size;
  private boolean inflatedOrNot;
  
  public Balloon (String color, double size, boolean inflatedOrNot)
  {
    this.color = color;
    this.size = size;
    this.inflatedOrNot = inflatedOrNot;
  }
  
  public String getColor ()
  {
    return color;
  }
}