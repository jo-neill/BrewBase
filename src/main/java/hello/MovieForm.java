package hello;

public class MovieForm {
    private String movie, drink;
    private int rating;
  
    public String getMovie (){
        return movie;
    }
    
    public String getDrink (){
        return drink;
    }
    
    public int getRating (){
        return rating;
    }
    
    public void setMovie (String movie){
        this.movie = movie;
    }
    
    public void setDrink (String drink){
        this.drink = drink;
    }
    
    public void setRating (int rating){
        this.rating = rating;
    }
    
}
