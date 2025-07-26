package org.example.config;

import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student Student(@Autowired Writer writer) {
        Student student = new Student();
        student.setRno(23);
        student.setWrite(writer);
        return student;
    }

    @Bean
    public Pen pen() {
        return new Pen();
    }
}

//        @Bean
//        public Pencil pencil(){return new Pencil();}
//    }
