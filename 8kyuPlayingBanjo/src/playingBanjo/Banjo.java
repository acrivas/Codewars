package playingBanjo;

/*Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!

The function takes a name as its only argument, and returns one of the following strings:

name + " plays banjo" 
name + " does not play banjo"*/

public class Banjo {

	public static void main(String[] args) {
		
		String name = "Quijote";
		String answer = areYouPlayingBanjo(name);
		System.out.println(answer);

	}
	
	public static String areYouPlayingBanjo(String name) {
		String answer;
		if(name.toLowerCase().startsWith("r")) {
			answer = name + " plays banjo";
		} else {
			answer = name + " does not play banjo";
		}
		return answer;
	}

}
