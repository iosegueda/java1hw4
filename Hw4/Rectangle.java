/**
 * Created by Iris Osegueda on 7/17/2015.
 */
public class Rectangle
{
    private int length;
	private int width;
	
	public int getLen()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setLen(int l)
	{
		length = l;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public int getPerimiter()
	{
		return ((2*width) + (2*length));
	}
	
	public int getArea()
	{
		return (width*length);
	}
 
    public Rectangle()
    {
        this ( 1, 1);
    }
 
    public Rectangle( int l, int w )
    {
        setLen( l );
        setWidth( w );
    } 
 
    public String toString() { return "Length: " + length + " Width: " + width ; }
 
}