package mail_OTP;

import java.util.HashMap;
import java.util.Random;

public class forget_passwordBean {
//	public HashMap<String ,Integer> mailotp = new HashMap<>();
	private String email;
	private int otp;
	
//	public forget_passwordBean() {
//		mailotp.put(email, otp);
//	}

	public String getEmail() {
		return email;
	}

	public forget_passwordBean(String email, int otp) {
		super();
		this.email = email;
		this.otp = otp;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	
}
