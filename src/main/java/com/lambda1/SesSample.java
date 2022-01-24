//package com.lambda1;
//
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
//import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
//import com.amazonaws.services.simpleemail.model.Body;
//import com.amazonaws.services.simpleemail.model.Content;
//import com.amazonaws.services.simpleemail.model.Destination;
//import com.amazonaws.services.simpleemail.model.Message;
//import com.amazonaws.services.simpleemail.model.SendEmailRequest;
//
//public class SesSample {
//	private static final String AccessKeyID = "AKIAZQQ7SDMQQMVL3DGQ";
//	  private static final String SecretAccessKey = "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";
//	  static final String FROM = "vishakha.thokal@acc.ltd";
//	  static final String TO = "vaibhavi7588@gmail.com";
//	  static final String SUBJECT = "AWS Simple Email Service";
//	  static final String TEXTBODY = "This email was sent through Amazon SES"
//	      + "using the AWS SDK for Java";
//	  public static void main(String[] args) {
//	    try {
//	      BasicAWSCredentials credentials = new BasicAWSCredentials(AccessKeyID, SecretAccessKey);
//	      AmazonSimpleEmailService client =
//	          AmazonSimpleEmailServiceClientBuilder.standard()
//	              .withCredentials(new AWSStaticCredentialsProvider(credentials))
//	              .withRegion(Regions.AP_SOUTH_1).build();
//	      SendEmailRequest request =
//	          new SendEmailRequest()
//	              .withDestination(new Destination().withToAddresses(TO))
//	              .withMessage(
//	                  new Message().withBody(
//	                      new Body().withText(new Content().withCharset("UTF-8").withData(TEXTBODY)))
//	                      .withSubject(new Content().withCharset("UTF-8").withData(SUBJECT)))
//	              .withSource(FROM);
//	      client.sendEmail(request);
//	      // client.sendEmail(request);
//	      System.out.println("Email sent!");
//	    } catch (Exception ex) {
//	      ex.printStackTrace();
//	      System.out.println("The email was not sent. Error message: " + ex.getMessage());
//	    }
//	  }
//	}