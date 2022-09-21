package com.cydeo;

import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {

		Comment comment  = new Comment();
		comment.setAuthor("Johnson");
		comment.setText("Spring Framework");

		ApplicationContext container = SpringApplication.run(CydeoApplication.class, args);

		CommentService commentService = container.getBean(CommentService.class);

		commentService.publishComment(comment);

		commentService.printConfigData();

		commentService.printDBConfigData();







//		SpringApplication.run(CydeoApplication.class, args);
//		BeanFactory context = SpringApplication.run(CydeoApplication.class, args);

//		All the top containers are same with the


//	what if we want to create class from String or other method comes from third party.
//	we can make bean here because we have @Configuration and @Component class here with annotation
//	in @SpringBootApplication annotation








	}



}
