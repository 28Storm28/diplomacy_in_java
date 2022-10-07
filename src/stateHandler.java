import java.io.Serializable;
import java.util.List;

public class stateHandler implements Serializable {
    //This class contains an object for storing game state as well as some utility functions
    public int ret_province_index_by_id(int id){
        int counter = 0;
        for (province p:this.map) {
            if(p.id == id){
                return counter;
            }
            else{
                counter++;
            }
        }
        return -1;
    }
    public void assign_occupation_by_unit(){
        for (province p:this.map) {
            p.occupied_by.clear();
        }
        for (unit u:this.units) {
            if(ret_province_index_by_id(u.postion) != -1){
                map.get(ret_province_index_by_id(u.postion)).occupied_by.add(u);
            }
        }
    }
    public void calculate_team_supply(){
        for (team t:this.teams) {
            t.supply = 0;
            for (province p: this.map) {
                if(p.supply_point && p.currently_owned_by == t.id){
                    t.supply++;
                }
            }
        }
    }
    public void populate_team_armies(){
        for (team t:this.teams) {
                t.army.clear();
            for (unit u:this.units) {
                if (u.id == t.id){
                    t.army.add(u);
                }
            }
        }

    }
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
    List<team> teams;

    public stateHandler(List<province> map, List<unit> units) {
        this.map = map;
        this.units = units;
    }
}
