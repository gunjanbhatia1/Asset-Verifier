package com.project.restfulwebservices.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.restfulwebservices.asset.AssetJpa;








@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/email")
public class SimpleEmailController {

    @Autowired
	public JavaMailSender javaMailSender;


    @PutMapping("/sendEmail")
    public ResponseEntity<Email> sendEmail(@RequestBody Email reciever){
   System.out.println(reciever);
   if(reciever==null) {
	  System.out.println("hi");
   return null;}

    	SimpleMailMessage message=new SimpleMailMessage();
    	message.setTo(reciever.email);
    	message.setSubject("Notification");
    	message.setText("This email is for notifying you assets are verified");
    	javaMailSender.send(message);
    	return new ResponseEntity<Email>(reciever, HttpStatus.OK);
    }


    //http://localhost:8080/email/sendEmail
    
}
