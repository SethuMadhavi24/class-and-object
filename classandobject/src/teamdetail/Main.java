package teamdetail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader inobj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(inobj);
		String str1,str2;
		str1=br.readLine();
		str2=br.readLine();
		Team t=new Team(str1,str2);
		

	}

}
