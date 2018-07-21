import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class UuidDemo {
	
	public static void main(String a[])
	{
		try {
			String source = "odio" + "user";
			byte[] bytes = source.getBytes("UTF-8");
			UUID uuid = UUID.nameUUIDFromBytes(bytes);
			System.out.println(uuid);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
