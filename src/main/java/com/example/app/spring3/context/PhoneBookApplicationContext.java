package com.example.app.spring3.context;


import com.example.app.spring3.repository.FileRepository;
import com.example.app.spring3.repository.GmailRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration //어떤 빈즈를 쓸것이냐 -> 이게 붙었으니까 main에서 AnnotationConfigApplicationContext를 쓸 수 있는 것이다.
@ComponentScan( basePackages = {"com.example.app.spring3"})//그룹
public class PhoneBookApplicationContext {

    @Bean
    FileRepository getFileRepository(){
        FileRepository repository = new FileRepository("phone_books.bin");
        return repository;
    }

    @Bean
    GmailRepository getGmailrepository(){
        GmailRepository repository = new GmailRepository();
        return repository;
    }

}
