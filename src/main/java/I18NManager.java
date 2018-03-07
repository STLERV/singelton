import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.Properties;
import org.apache.log4j.LogManager;

public class I18NManager {
    private static I18NManager instance;
    private HashMap<String,ResourceBundle> data;
    ///LOG4JAVA
    private static final  log = LogManager.getRootLogger();

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
            log.info("Valor de la clave" + key);
            rb = ResourceBundle.getBundle("edu.upc.eetac.dsa.patrons.i18n "+lenguaje);
            data.put(lenguaje, rb);
            log.info("Valor de la clave" + key);
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
