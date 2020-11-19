
public class Main {
	public static void main(String[] args) {
		IDandPasswords idandPasswords=new IDandPasswords();
		//Registration regist=new Registration();
		
		
		LoginPage loginPage=new LoginPage(idandPasswords.getLoginInfo());
		
	}

}
