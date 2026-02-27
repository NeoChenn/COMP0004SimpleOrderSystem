public class Electronic extends Product
{
  private String description;
  public Electronic(int code, String brand, String warranty, int price)
  {
    super(code, price);
    this.description = brand + " with " + warranty + " warranty";
  }
    
  @Override
  public String getDescription()
  {
    return description;
  }
}
