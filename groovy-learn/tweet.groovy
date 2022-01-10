@groovy.transform.ToString()
class tweet {
    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn
    
    public tweet(String user, String tweet) {
        username = user
        text = tweet
        retweets = 0
        favorites = 0
    }
    void addToRedweets() {
        retweets += 1
    } 
     void addToFavorites() {
        favorites += 1
    } 
     
}