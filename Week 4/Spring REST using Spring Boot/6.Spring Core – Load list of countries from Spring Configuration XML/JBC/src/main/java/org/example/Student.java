package org.example;

import org.example.config.Writer;

import java.sql.SQLOutput;

public class Student {

    private int rno;
    private Writer write;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWrite() {
        return write;
    }

    public void setWrite(Writer write) {
        this.write = write;
    }


    public Student() {
        System.out.println("Student");
    }

    public void WriteExam(){
        Writer.write();
    }
}
