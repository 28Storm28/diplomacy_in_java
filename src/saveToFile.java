import java.io.*;

public class saveToFile{
    public static void save_game_state(stateHandler GameState){
        try{
            FileOutputStream fos = new FileOutputStream("gameState.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(GameState);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static stateHandler load_game_state(){
        try{
            FileInputStream fis = new FileInputStream("gameState.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            stateHandler ret = (stateHandler) ois.readObject();
            return ret;
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return null;
        }
    }

}

//try (FileOutputStream fos = new FileOutputStream("object.dat");
//     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//
//    // create a new user object
//    User user = new User("John Doe", "john.doe@example.com",
//            new String[]{"Member", "Admin"}, true);
//
//    // write object to file
//    oos.writeObject(user);
//
//} catch (IOException ex) {
//    ex.printStackTrace();
//}