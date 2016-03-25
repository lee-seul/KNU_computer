package movie;

class MovieClass {
	String name;
	int publishedYear;
	String director;
	
	void info(){
		System.out.printf("영화이름: %s\n출시연도: %d\n감독이름: %s", name, publishedYear, director);
	}
}

public class Movie {

	public static void main(String[] args) {
		MovieClass movie = new MovieClass();
		movie.name = "java";
		movie.publishedYear = 2013;
		movie.director = "lee";
		movie.info();

	}

}
