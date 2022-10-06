import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        stateHandler x = saveToFile.load_game_state();
        System.out.println("");
    }
    public static void testFileSave(){
        List<Integer> blank = new ArrayList<>();
        List<unit> blankUnit = new ArrayList<>();
        province test1 = new province(1,blank,0,"test1",blank,null);
        province test2 = new province(2,blank,0,"test1",blank,null);
        unit testUnit1 = new unit(0,0,1);
        unit testUnit2 = new unit(1,0,2);
        List<province> map = new ArrayList<>();
        List<unit> units = new ArrayList<>();
        units.add(testUnit1);
        units.add(testUnit2);
        test1.borders.add(test2.id);
        test2.borders.add(test1.id);
        map.add(test1);
        map.add(test2);

        stateHandler sh = new stateHandler(map,units);
        saveToFile.save_game_state(sh);

    }
}
