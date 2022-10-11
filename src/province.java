import java.io.Serializable;
import java.util.List;

public class province implements Serializable {

    int id;
    List<Integer> borders;
    int type; //0: in land, 1: costal, 2:Ocean
    String name;
    List<Integer> coords;
    List<unit> occupied_by;
    int team_origin; //-1 is neutral territory
    boolean supply_point; //Is this province a supply point that allows allocation of more units
    int currently_owned_by; //Who is this province currently controlled by -1 currently owned by no one

    public province(int id, List<Integer> borders, int type, String name, List<Integer> coords, List<unit> occupied_by, int team_origin, boolean supply_point, int currently_owned_by) {
        this.id = id;
        this.borders = borders;
        this.type = type;
        this.name = name;
        this.coords = coords;
        this.occupied_by = occupied_by;
        this.team_origin = team_origin;
        this.supply_point = supply_point;
        this.currently_owned_by = currently_owned_by;
    }




}
