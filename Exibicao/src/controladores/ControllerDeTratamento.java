package controladores;

import facade.FacadeExibicao;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Item;
import org.json.JSONArray;
import org.json.JSONObject;

public class ControllerDeTratamento{

    private ObservableList<Item> list;
    
    public ControllerDeTratamento() {
    }

    public byte[] convertToByte(String string) {
        return string.getBytes(StandardCharsets.UTF_8);
    }

    public String convertToString(byte[] dados) {
        return new String(dados, StandardCharsets.UTF_8);
    }

    public void tratarMensagem(byte[] bytes) {
        JSONObject infos = new JSONObject(convertToString(bytes));
        JSONArray a = infos.getJSONArray("infos");
        
        ArrayList<Item> array = new ArrayList();
        
        /*
        
        for (int i = 0; i < a.length(); i++) {
            JSONObject jo = new JSONObject(a.getString(i));
            Item item = new Item(i+1, jo.getString("nome"), " ", jo.getString("ultimaVolta"), 
                                 jo.getString("maisRapida"), jo.getInt("voltas"));
            array.add(item);
        }        
        
        list = FXCollections.observableList(array);
*/

    }
    
    public ObservableList<Item> getList(){
        return list;
    }
    
    
    
}
