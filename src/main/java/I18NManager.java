import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class I18NManager {
    private static I18NManager instance;
    private HashMap<String,ResourceBundle> data;

    private I18NManager(){
        data = new HashMap<String, ResourceBundle>();
    }

    public HashMap<String, ResourceBundle> getData() {
        return data;
    }

    public static I18NManager getInstance(){
        if (instance==null) instance = new I18NManager();
        return instance;
    }

    public String getText(String lenguaje, String key){
        ResourceBundle rb = data.get(lenguaje);
        if(rb==null){
            rb = ResourceBundle.getBundle("edu.uc.eetac.dsa.patrons.i18n "+lenguaje);
            data.put(lenguaje, rb);
        }
        return rb.getString(key);
    }


    public static void main(String[] args) {
        // write your code here
        String value = I18NManager.getInstance().getText("cas", "t1");
        value = I18NManager.getInstance().getText("cat", "t2");
        value = I18NManager.getInstance().getText("en", "t3");
    }

}
