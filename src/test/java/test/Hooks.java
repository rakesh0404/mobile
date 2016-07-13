package test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by rakeshreddy on 07/07/2016.
 */
public class Hooks {

    @Before
    public void setUp() throws IOException{
        new DriverHelper().openApp();
    }

    @After
    public  void tearDown(){
        new DriverHelper().closeServer();
    }
}
