package imdb;

import org.junit.Test;

import junitparams.FileParameters;

public class ImdbTest extends ParentTest{
	
	@Test
	@FileParameters("./data/imbdatos.csv")
	public void testimdb(String browser, String url,
	String user, String password, String friendName){

	setUp(browser,url);		
	}
	/*
	
	logIntoFacebook(user, password);
	
	searchFacebookFriend(friendName);
		
	gotoPhotos();
		
	likeAllPhotos();
		*/
	
	//este codigo es el original
		/*
	@Test
	public void buscaPelicula() {
		navigateToPage("http://imdb.com");
		buscaPelicula();
		
	}
	
	@Test
	public void testSearchMovie() {
		navigateToPage("http://imdb.com");
		validatePage();
		searchMovie();
		validateMovieExists();
	}
	
	
	@Test
	public void testPlayTrailer() {
		navigateToPage("http://imdb.com");
		validatePage();
		searchMovie();
		validateMovieExists();
		selectMovie();
		validateCorrectMovie();
		playTrailer();
		
		
	}
	
	

	@Test
	public void testValidateMovieStars() {
		navigateToPage("http://imdb.com");
		validatePage();
		searchMovie();
		validateMovieExists();
		selectMovie();
		validateCorrectMovie();
		validateMovieStars();
	}

	*/
	//este codigo es el original
	
}
