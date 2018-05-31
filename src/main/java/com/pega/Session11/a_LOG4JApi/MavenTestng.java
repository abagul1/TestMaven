package com.pega.Session11.a_LOG4JApi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MavenTestng {

    @BeforeClass

    public void before(){
        System.out.println("Before");

    }


    @AfterClass

    public void after(){
        System.out.println("After");
    }


    @Test
    public void testMaven(){

        System.out.println("Maven test");
    }


}
