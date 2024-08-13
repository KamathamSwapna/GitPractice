package data;

public class LoginPageData {
	private static String email;
	private static String password;
	
	public LoginPageData(){
		ReadExcelFile file;
		try{
			file=new ReadExcelFile();
			Object[][] data=file.ReadDataInExcelFile("C:\\Selenium", "LoginPageData.xlsx", "sheet1");
			email=data[1][0].toString();
			password=data[1][1].toString();//to get String representation of an object
			System.out.println(email);
			System.out.println(password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static String getEmail() {
		return email;
	}

	

	public static String getPassword() {
		return password;
	}
	
	



}
