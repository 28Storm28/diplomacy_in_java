import java.io.Serializable;
import java.util.List;

public class stateHandler implements Serializable {
    public province getProvinceById(int id){
        for (province p:map) {
            if(p.id == id){
                return p;
            }
        }
        return null;
    }
    List<province> map;
    List<unit> units;

    public stateHandler(List<province> map, List<unit> units) {
        this.map = map;
        this.units = units;
    }
}
