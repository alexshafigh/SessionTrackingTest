import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by saazimi on 7/10/2018.
 */
@ManagedBean( name = "selectionBean")
@SessionScoped
public class selectionBean implements Serializable {

    private static final HashMap<String,String> booksMap = new HashMap<String,String>();
    static
        {
         booksMap.put( "java", "Java How to Program" );
         booksMap.put( "cpp", "C++ How to Program" );
         booksMap.put( "iphone","iPhone for Programmers: An App-Driven Approach" );
         booksMap.put( "android","Android for Programmers: An App-Driven Approach" );
         }

         private Set<String> selections = new HashSet<>();
         private String selection;

         public int getNumberOfSelections(){
             return selections.size();
         }

         public String getSelection(){
             return selection;
         }

         public void setSelection(String topic){
             selection = booksMap.get(topic);
             selections.add(selection);
         }

         public String[] getSelections(){
             return selections.toArray(new String[selections.size()]);
         }


}
