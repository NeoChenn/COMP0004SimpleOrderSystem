public class Book extends Product{
    private String description;
    public Book(int code, String title, String author, String date, int price)
    {
        super(code, price);
        this.description = title + " by " + author + " published on " + date;
    }
    
    @Override
    public String getDescription()
    {
        return description;
    }
}
