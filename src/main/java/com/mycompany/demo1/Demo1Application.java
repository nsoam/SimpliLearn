package com.mycompany.demo1;

import com.mycompany.demo1.persistence.model.Book;
import com.mycompany.demo1.persistence.repo.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.mycompany.demo1.persistence.repo")
@EntityScan("com.mycompany.demo1.persistence.model")
@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Demo1Application.class, args);
		BookRepository bookRepository = configurableApplicationContext.getBean(BookRepository.class);
		Book myBook = new Book("Sopranos", "dhl");
		bookRepository.save(myBook);
	}

}
