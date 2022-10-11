import java.util.ArrayList;
import java.util.Scanner;
public class dev_tools {
    public static void main(String[] args) {
        create_new_map();
    }
    public static void saveMap(stateHandler sh){
        saveToFile.save_game_state(sh);
    }
    //Io for creating a new map
    public static void cat(stateHandler sh){
        for (province p :sh.map) {
            System.out.println(p.name + ":");
            System.out.printf(" Supply point: %b\n", p.supply_point);
            System.out.println("   Occupied by:");
            for (unit u:p.occupied_by) {
                System.out.print("     id:"+ u.id );
                if(u.type == 0){
                    System.out.println("\n       Army");
                } else if (u.type == 1) {
                    System.out.println("\n       Fleet");
                }
            }
            System.out.println("   Borders:");
            for (int id:p.borders){
                System.out.println("     id:" + id + "\n      " + sh.getProvinceById(id).name);
            }
            System.out.println("--------------");
        }
    }
    public static String create_new_map(){
        //stateHandler map = new stateHandler(new ArrayList<>(),);
        System.out.println("(0) View Current Items\n" +
                "(1) Create New Province\n" +
                "(2) Create New Water Tile\n" +
                "(3) Populate Tiles\n");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 0:

        }
        //return file location
        return null;
    }
}
