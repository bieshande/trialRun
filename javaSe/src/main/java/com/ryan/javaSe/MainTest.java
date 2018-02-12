package com.ryan.javaSe;

/**
 * @Auther:biexiande@hisense.com
 * @date:2017/12/22 9:51
 * @des
 */
public class MainTest {

    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
//        Properties properties=System.getProperties();
//        Enumeration enumeration = properties.propertyNames();
//        while (enumeration.hasMoreElements()){
//            String key =  (String)enumeration.nextElement();
//            System.out.println(key+":=======");
//            System.out.println(properties.getProperty(key));
//        }


       int processorNum = Runtime.getRuntime().availableProcessors();
        System.out.println(processorNum);
        //AbstractQueuedSynchronizer S;
    }
}