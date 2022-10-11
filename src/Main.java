import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testFileSave();
        stateHandler x = saveToFile.load_game_state();
        dev_tools.cat(x);
    }


    public static void testFileSave(){
        List<Integer> blank = new ArrayList<>();
        List<unit> blankUnit = new ArrayList<>();
        List<province> map = new ArrayList<>();
        unit testUnit1 = new unit(0,0,1,0);
        unit testUnit2 = new unit(1,0,2,1);
        province test1 = new province(1,new ArrayList<Integer>(),0,"London",new ArrayList<Integer>(),new ArrayList<unit>(),-1, true,-1);
        province test2 = new province(2,new ArrayList<Integer>(),0,"France",new ArrayList<Integer>(),new ArrayList<unit>(), -1, true,-1);
        List<unit> units = new ArrayList<>();
        units.add(testUnit1);
        units.add(testUnit2);
        test1.borders.add(test2.id);
        test2.borders.add(test1.id);
        map.add(test1);
        map.add(test2);
        stateHandler sh = new stateHandler(map,units);
        sh.assign_occupation_by_unit();
        saveToFile.save_game_state(sh);

    }
}
