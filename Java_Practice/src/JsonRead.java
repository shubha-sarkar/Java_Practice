import org.json.JSONObject;

public class JsonRead {

	public static void main(String[] args) {
		
		String json = "{\r\n"
				+ "  \"firstname\":\"Shubha\",\r\n"
				+ "  \"lastname\":\"Sarkar\",\r\n"
				+ "  \"city\":\"Bangalore\",\r\n"
				+ "  \"country\":\"India\"\r\n"
				+ "}";
		
		JSONObject jsonObject = new JSONObject(json);
		System.out.println(jsonObject.get("firstname"));

	}

}
