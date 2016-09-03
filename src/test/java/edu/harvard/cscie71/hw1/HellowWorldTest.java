package edu.harvard.cscie71.hw1;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertNull;

/**
 * JUnit Tests for HelloWorld.
 *
 * Created by mjohns on 9/3/16.
 */
public class HellowWorldTest {

    @Test
    public void testGenerateGreetMsgSuccess(){
        try{

            //TEST A SUCCESSFUL GREETING
            String name = "Michael Johns";
            String match_msg = String.format(HelloWorld.HELLO_TEMPLATE,name);

            String msg = HelloWorld.generateGreetMsg(new String[]{name});
            assertEquals(
                    String.format("Expect HelloWorld#generateGreetMsg msg to match '%s'",match_msg),
                    match_msg,
                    msg);

        } catch (Exception e){
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    public void testGenerateGreetMsgFail(){
        try{

            String name;
            String msg;

            //SUB_TEST #1 ::: NULL ARGS
            msg = HelloWorld.generateGreetMsg(null);
            assertNull("Expect HelloWorld#generateGreetMsg msg to be null (null args)",msg);

            //SUB_TEST #2 ::: EMPTY ARGS
            msg = HelloWorld.generateGreetMsg(new String[]{});
            assertNull("Expect HelloWorld#generateGreetMsg msg to be null (empty args)",msg);

            //SUB_TEST #3 ::: EMPTY ARGS[0]
            msg = HelloWorld.generateGreetMsg(new String[]{""});
            assertNull("Expect HelloWorld#generateGreetMsg msg to be null (empty args[0])",msg);

            //SUB_TEST #4 ::: TRIM TO EMPTY ARGS[0]
            msg = HelloWorld.generateGreetMsg(new String[]{" "});
            assertNull("Expect HelloWorld#generateGreetMsg msg to be null (trim to empty args[0])",msg);

            //SUB_TEST #5 ::: NULL ARGS[0]
            name = null;
            msg = HelloWorld.generateGreetMsg(new String[]{(String)name});
            assertNull("Expect HelloWorld#generateGreetMsg msg to be null (null args[0])",msg);

        } catch (Exception e){
            e.printStackTrace();
            fail(e.getMessage());
        }
    }



    @Test
    public void testMainSuccess(){
        try{

            //THIS DIRECTLY TESTS A SUCCESSFUL MAIN (ONLY FOR VISUAL REVIEW OF OUTPUT)
            HelloWorld.main(new String[]{"Michael Johns"});

        } catch (Exception e){
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    @Test
    public void testMainFail(){
        try{

            //THIS DIRECTLY TESTS A FAILED MAIN (ONLY FOR VISUAL REVIEW OF OUTPUT)
            HelloWorld.main(new String[]{});

        } catch (Exception e){
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
}
