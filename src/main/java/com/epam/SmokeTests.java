package com.epam;

import org.testng.annotations.Test;

public class SmokeTests {

    @Test
    public void add(){
        System.out.println("addition :"+10+20);
    }

    @Test
    public void multiply(){
        System.out.println("multiply :"+10*20);
    }

    @Test
    public void div(){
        System.out.println("division :"+10/20);
    }
}
