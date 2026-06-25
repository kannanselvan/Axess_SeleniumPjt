package UtilsPack;

import io.cucumber.java.ja.但し;

import java.util.Map;

public class ExcelManager {

    private static ThreadLocal<Map<String, String >>testdata = new ThreadLocal<>();
    public static void setTestdata(Map<String, String> data){
    testdata.set(data);
    }
    public static String getData(String  key){
        return testdata.get().get(key);
    }
    public static void unLoadData(){
         testdata.remove();
    }
    public static Map<String ,String >GetAllData(){
        return testdata.get();
    }


}
