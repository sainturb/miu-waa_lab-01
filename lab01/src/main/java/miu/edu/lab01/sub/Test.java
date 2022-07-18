package miu.edu.lab01.sub;

import miu.edu.lab01.MyAutowired;
import miu.edu.lab01.MyBean;

@MyBean
public class Test {

    @MyAutowired
    public TestDetail detail; // new Insntace90

    public void print() {
        System.out.println("Print in test");
    }

    public void display() {
        detail.print();
    }

}
