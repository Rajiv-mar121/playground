package restClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClientsTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url="https://api.github.com/users/hadley/orgs";
		new ClientsTest().getRestCall();
	}

	
	
	public void getRestCall() throws Exception
	{
		String url="https://api.github.com/users/hadley/orgs";
		URL urlobj=new URL(url);
		HttpURLConnection con=(HttpURLConnection)urlobj.openConnection();
		con.setRequestMethod("GET");
		int status=con.getResponseCode();
		System.out.println(status);
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response=new StringBuffer();
		while((inputLine=br.readLine())!=null)
		{response.append(inputLine);
		}
		br.close();
		
		System.out.println(response.toString());
		
		JSONArray jArray = new JSONArray(response.toString());
		System.out.println("Length"+jArray.length());
		 for (int i = 0; i < jArray.length(); i++) {
			 JSONObject jb = jArray.getJSONObject(i);
			 String cityId = jb.getString("login");
			 System.out.println(cityId);
		 }
		
		 /*		JSONObject json=new JSONObject(response.toString());
			//	System.out.println(json.getString("login"));
		JSONArray array=new JSONArray(response);
		JSONObject jsonGeneralData = new JSONObject(array.get(0));
		String sResult = jsonGeneralData.get("login").toString();
	//	System.out.println(sResult); */ 

       }
}
