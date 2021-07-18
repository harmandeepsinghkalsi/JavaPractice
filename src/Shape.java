import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Shape {

	public static void main(String args[]) throws SecurityException, IOException {
		
		
		String str = "";
		str += "harman";
		System.out.println(str);
		FileHandler fh;
		fh = new FileHandler("C:\\Users\\Harmandeep Singh\\test.log");

		String json = "[{\"data\":{\"frequency\":1,\"lastUpdateTs\":\"2020-07-22T17:18:43.985Z\",\"lastUpdateSource\":\"DELIVR|LEADS\",\"value\":{\"followupflag\":true,\"optOutFlag\":false,\"optOutDealers\":[null]}},\"audit\":[{\"source\":\"DELIVR|LEADS\",\"sourceId\":\"987654321\",\"sourceIdName\":\"LEADID\",\"pacode\":\"00002\"}]}]";
		System.out.println("original data:" + json);

		JsonArray jsonArray = new JsonParser().parse(json).getAsJsonArray();

		// System.out.println(jsonArray);
		Logger logger = Logger.getLogger("test_logger");
		Level level = Level.FINER;
		for(Handler h : java.util.logging.Logger.getLogger("test_logger").getHandlers())    
	        h.setLevel(level);
		logger.setLevel(level);
		logger.addHandler(fh);
		logger.finer("test mmsg: "+ jsonArray);
		
		for(JsonElement element: jsonArray) {
			final JsonObject jsonObject = element
					.getAsJsonObject();
			System.out.println("element"+element.equals(jsonObject));

			System.out.println("jsonObject"+ jsonObject);
			final JsonObject data = jsonObject.get("data")
					.getAsJsonObject();
			final JsonObject value = data.get("value")
					.getAsJsonObject();
			Boolean optOutFlag = value.get("optOutFlag").getAsBoolean();
			value.get("optOutDealers").getAsJsonArray().add("09101");
			System.out.println("Before: "+ value);
			value.addProperty("optOutFlag", true);
			System.out.println("After:" + jsonObject);
			final JsonArray audit = jsonObject.get("audit")
					.getAsJsonArray();
			for (final JsonElement element1 : audit) {
				final JsonObject auditObj = element.getAsJsonObject();
			}
		}
		
		System.out.println("Updated:"+ jsonArray);
	}

}
