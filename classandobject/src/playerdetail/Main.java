package playerdetail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader insr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(insr);
		String str1,str2;
		str1=br.readLine();
		str2=br.readLine();
		Player pl=new Player(str1,str2);
		
	}

}
