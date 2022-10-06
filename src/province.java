import java.io.Serializable;
import java.util.List;

public class province implements Serializable {
    int id;
    List<Integer> borders;
    int type; //0: in land, 1: costal, 2:Ocean
    String name;
    List<Integer> coords;
    List<unit> occupied_by;

    public province(int id, List<Integer> borders, int type, String name, List<Integer> coords, List<unit> occupied_by) {
        this.id = id;
        this.borders = borders;
        this.type = type;
        this.name = name;
        this.coords = coords;
        this.occupied_by = occupied_by;
    }
}
