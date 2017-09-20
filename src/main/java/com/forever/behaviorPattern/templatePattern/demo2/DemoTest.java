package com.forever.behaviorPattern.templatePattern.demo2;

/**
 * Created by forever on 2017-4-22.
 */
public class DemoTest {
    public static void main(String[] args) {
        RunTime runTime = new TestCode1();
        long codeRunTime = runTime.getCodeRunTime();
        RunTime runTime2 =new TestCode2();
        long codeRunTime2 = runTime2.getCodeRunTime();
    }
}
