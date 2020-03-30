
public class themes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] themes = {"Unbeständigkeit", "Leiden", "Nicht-Selbst","die 5 Hindernisse", "Anfängergeist", "Achtsamkeit"};
		int i = 1; 
		for(String theme : themes) {
			System.out.println("Das " + i + ". Thema für eine Dharma Ansprache soll " + theme + " sein.");		
		i+=1;
		}
		Quotes grace = new Quotes("faith", "When you seek the grace of god, you can be assured, that the grace of god is also seeking you. ", "Ramana Maharashi", "Buddhist");
		Quotes path = new Quotes("acceptance", "whatever arises in body and mind is to be regarded as path. ", "Zen wisdom", "Buddhist");
		Quotes sameeyes = new Quotes("oneness","The eye through wich I see god is the same eye through wich god sees me. ", "Meister Eckhardt", "Christian");
	}

}
