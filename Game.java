public class Game 
{
	String name;
	String genre;
	String developer;
	String platform;
	String price;
	String rating;
	
	public Game() {
		this("", "", "", "", "", "");
	}
	
	public Game(String name, String genre, String developer, String platform, String price, String rating) {
		setName(name);
		setGenre(genre);
		setDeveloper(developer);
		setPlatform(platform);
		setPrice(price);
		setRating(rating);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
