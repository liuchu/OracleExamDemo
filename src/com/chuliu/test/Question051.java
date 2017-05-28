package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/28.
 */
public class Question051 {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {

        Question051 que = new Question051();
        que.setType(null);

        String aString = "Chu LIU";
        try {
            String b = aString.substring(4, 8);
            System.out.println(b);
        }catch (StringIndexOutOfBoundsException outBound){
            System.out.println("limit");
        }
    }
}
