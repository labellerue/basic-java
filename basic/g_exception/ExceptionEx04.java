package g_exception;

public class ExceptionEx04 {
	public static void main(String[] args) {

		try{
			startInstall();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			deleteFile();
		}

}

	static void startInstall(){
		copyFile();
	}

	static void copyFile(){

	}

	static void deleteFile(){

	}


}

