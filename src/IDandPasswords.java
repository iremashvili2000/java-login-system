import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo=new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("IKa","1234");
		logininfo.put("shorena","shorena");
		logininfo.put("goga","12345678");
		
	}
	IDandPasswords(String username,String password){
		logininfo.put(username, password);
		logininfo.put("IKa","1234");
		logininfo.put("shorena","shorena");
		logininfo.put("goga","12345678");
	}
	
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}

}
