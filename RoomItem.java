import java.util.Set;
import java.util.HashMap;

/**
 * Write a description of class RoomItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomItem
{
    private String description;
    private HashMap<String, String> items;

    /**
     * Constructor for objects of class RoomItem
     */
    public RoomItem(String description)
    {
        this.description = description;
        items = new HashMap<>();
    }

    public void setItem(String description, String weight)
    {
        items.put(description, weight);        
    }
    
    public String getItem(String description) 
    {
        return items.get(description);
    }
    
        private String getItemString()
    {
        String returnString = "Items:";
        Set<String> keys = items.keySet();
        for(String description : keys) {
            returnString += " " + description;
        }
        return returnString;
    }
    
    public String getShortDescription()
    {
        return description;
    }
    
    public String getLongDescription()
    {
        return "The item is " + description + ".\n" + getItemString();
    }
}
