package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    private HashMap<String,ResourceBundle> data;
    data.put("T1",)

    public HashMap<String, ResourceBundle> getData() {
        return data;
    }

    public static I18NManager getInstance(){
        if (instance==null) instance = new I18NManager;
        return instance;
    }
    private HashMap<String,ResourceBundle> data;

    public I18NManager data(){
        ResourceBundle rb = data.get()
    }

}
