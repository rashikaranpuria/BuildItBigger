package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import org.mockito.Mock;

import java.util.concurrent.TimeUnit;


public class TestAsyncStringNotNull extends AndroidTestCase {

    EndpointsAsyncTask task;
    String result;
    @Mock
    Context mockContext;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        result = null;
        task = new EndpointsAsyncTask(mockContext,null){
            @Override
            protected void onPostExecute(String joke){
                //No need to launch intent, so override this method
                return ;
            }
        };
    }


    public void testAsyncReturnType() {

        try{

            //Default timeout for the GCM server is 20 seconds
            //If the .get can't get the result in 10 seconds, something is wrong anyway
            //Greater than 20 seconds results in an error string returned and requires further interpretation
            task.execute(new Pair<Context, String>(mockContext, "Manfred"));
            result = task.get(10, TimeUnit.SECONDS);
            assertNotNull(result);

        }catch (Exception e){
            fail(e.getMessage());
        }
    }
}