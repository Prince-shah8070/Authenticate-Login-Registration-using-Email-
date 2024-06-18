package mail_OTP;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.*;

import java.util.Properties;
import java.util.Random;

public class sent_mail {
	
	public int getRandom()
	{
    int otp   =(int) (Math.random()*9000)+1000; 
    return otp;
	}
	
	String to2;
	
	public boolean sendEmail(String to, String from, String subject, String text) {
        boolean flag = false;

        //logic
        //smtp properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp.gmail.com");

        String username = "shahprince8070";
        String password = "hsed sgrg htmz hxrn";


        //session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(from));
            message.setSubject(subject);
            message.setText(text);
            Transport.send(message);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return flag;
    }
    
    public void sent_mail(forget_passwordBean bean) {
//    	public static void main(String args[]) {
//            String to = "shahprince8070@gmail.com";

//    	mailotp.put(to2, otp);
//    	System.out.print(mailotp);
        sent_mail gEmailSender = new sent_mail();
        String to = bean.getEmail() ;
//        String to = "shahprince8070@gmail.com";
        String from = "shahprince8070@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "Your OTP to reset your password:  "+bean.getOtp();
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");

        } else {
            System.out.println("There is problem in sending email");
        }

    }
    
//    public int getValue(String key) {
//    	mailotp.put(to2, otp);
////    	if (mailotp.containsKey(key)) {
////			return true;
////		} 
////    	return false;
//    	System.out.print("Otp nahi aa raha hai kya???"+otp);
//        return mailotp.get(key);
//    }
    }
