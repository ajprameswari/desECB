package des;

import java.io.UTFDataFormatException;
import java.nio.charset.Charset;

public class Main {

	private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String textClar = "CRIPTEAZA ASTA";
			
			
			textClar = "Algoritmul de criptare DES";
			//DES
			String k = "123456789";
			System.out.println("Text clar: "+textClar);
			byte[] enc = DES.encrypt(textClar.getBytes(), k.getBytes());
			System.out.println("Text criptat DES: "+new String(enc));

			byte[] dec = DES.decrypt(enc, k.getBytes());
			System.out.println("Text decriptat DES: "+new String(dec));
			System.out.println("------------------");
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
