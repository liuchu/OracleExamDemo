package com.chuliu.exception;

/**
 * Created by chuliu on 2017/6/2.
 */
public class Test {

    public static void main(String[] args) {

        TestCaughtException caughtException = new TestCaughtException();
        try {
            caughtException.saveName("331312312312312312");
        } catch (NameisEmptyException e) {
            e.printStackTrace();
        } catch (NameisTooLongException e) {
            e.printStackTrace();
        }

        caughtException.saveList(new int[]{1,2,3,4,5,6,7,8,9,0,11});
        System.out.println("Last line");
    }


}
