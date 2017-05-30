package com.chuliu.test;

/**
 * Created by chuliu on 2017/5/30.
 */
public class Question102 {

    public static void main(String[] args) {

        String[] a = {"1","2"};
        Alpha main = new Alpha(a);
        main.main();

        StringBuffer bf = new StringBuffer("ChuLIU");
        bf.substring(3,6);
        System.out.println(bf);
    }


}

class Alpha{

    public String[] main = new String[2];
    public Alpha(String[] main){
        for (int i = 0; i < main.length ; i++) {
            this.main[i] = main[i]+5;
        }
    }

    public void main(){

        System.out.println(main[0]+main[1]);
    }

}
