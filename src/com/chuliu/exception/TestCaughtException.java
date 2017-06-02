package com.chuliu.exception;

/**
 * Created by chuliu on 2017/6/2.
 */
public class TestCaughtException {

    public void saveName(String name) throws NameisEmptyException, NameisTooLongException {
        if("".equals(name))
            throw new NameisEmptyException("The name is EMPTY!");
        else if (name.length()>10)
            throw new NameisTooLongException("The name is TOO LONG!");
        else{
            System.out.println("the name '"+name+"' has been saved");

        }
    }

    public void saveList(int[] list){
        if(list.length>10)
            throw new TestRumtimeException("Meet runtime exception!");
    }

}
