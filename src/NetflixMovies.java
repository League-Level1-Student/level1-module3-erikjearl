
public class NetflixMovies {

	
	public static void main(String[] args) {
		
		Movie a = new Movie ("Cars",   5);
		Movie b = new Movie ("Cars 2", 4);
		Movie c = new Movie ("Cars 3", 3);
		Movie d = new Movie ("Cars 4", 3);
		Movie e = new Movie ("Cars 5", 1);
		
		System.out.println("For a ticket to Cars 3, " + c.getTicketPrice());
		
		NetflixQueue q = new NetflixQueue();
		
		q.addMovie(a);
		q.addMovie(b);
		q.addMovie(c);
		q.addMovie(d);
		q.addMovie(e);
		
		q.printMovies();
		
		q.sortMoviesByRating();
		
		
		System.out.println("the best movie is "+q.getBestMovie());
		System.out.println("the second best movie is "+q.getMovie(1));
		
		
		
		
		
	}
}
