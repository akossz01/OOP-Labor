public class Negyes{
	public static void main(String args[]){
		String word = "“Kerekes Balint Adam Jozsef";
		String[] arrOfStr = word.split(" ");
		String Monogram;
		for(int i=0; i< arrOfStr.length; ++i){
			System.out.print(arrOfStr.charAt(i));
		}
	}
	
}