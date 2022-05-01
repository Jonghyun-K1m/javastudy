
/*
    json 데이터가져오기 dnf api호출
    apikey는 개인것

*/


package plz;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import org.json.JSONObject;

public class ppp {
	public static void main(String[] args) {
		getJson();
	}
	
	public static void getJson() {
		try {
			String a ="https://api.neople.co.kr/df/servers/all/characters?characterName=%EC%9E%BC%EC%9E%BC%EC%BF%A0%ED%82%A4&apikey=";
			String b ="https://api.neople.co.kr/df/servers?apikey=" ;
			String d ="https://api.neople.co.kr/df/servers/prey/characters/16f2db7855702f03fc0ff75ddff619f3/timeline?limit=100&code=505&startDate=<startDate>&endDate=<endDate>&next=<next>&apikey=";
			String e ="https://api.neople.co.kr/df/servers/prey/characters/16f2db7855702f03fc0ff75ddff619f3/timeline?startDate=20220301T0000&endDate=20220319T2359&apikey=";
			String f ="https://api.neople.co.kr/df/servers/prey/characters/16f2db7855702f03fc0ff75ddff619f3/timeline?limit=100&code=505,504&startDate=20220301T0000&endDate=20220319T0000&apikey=";
			URL url = new URL(f);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				
			conn.setRequestMethod("GET"); // http 메서드
			conn.setRequestProperty("Content-Type", "application/json"); // header Content-Type 정보
			conn.setRequestProperty("auth", "myAuth"); // header의 auth 정보
			conn.setDoOutput(true); // 서버로부터 받는 값이 있다면 true
			
			// 서버로부터 데이터 읽어오기
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

//			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line = null;
			
			while((line = br.readLine()) != null) { // 읽을 수 있을 때 까지 반복
				sb.append(line);
			}
			
//			JSONObject obj = new JSONObject(sb.toString())	; // json으로 변경 (역직렬화)
		//	System.out.println("code= " + obj.getInt("code") + " / message= " + obj.getString("message"));
		    JSONObject jObject = new JSONObject(sb.toString());
		    
		  
			JsonParser jsonParser = new JsonParser();
		    JsonElement jsonElement = jsonParser.parse(sb.toString());
		    JsonObject jsonObject = jsonElement.getAsJsonObject();

		    
		   
		   // String na1me = jsonObject.get("level").getAsString();
	       // System.out.println("llll = " + na1me);
	        
	        
	        JsonObject na13me = jsonObject.get("timeline").getAsJsonObject();
	  //      System.out.println("3333 = " + na13me);
	  //      System.out.println("3333t5 = " + na13me.get("rows"));
	        
	        JsonElement na13me1 =  na13me.get("rows");
	        
	    
		    JsonArray members = na13me1.getAsJsonArray();
	
//	        System.out.println("333354 = " + members);
		    
	    	System.out.println("\n1. for loop");
	    	for(int i = 0; i < members.size(); i++) {
	    	
	    		System.out.println("> " + i + ": " + members.get(i));
	    		JsonElement aasc= members.get(i);
	    		
	    	}

		    

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
