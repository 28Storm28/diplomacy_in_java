import java.io.Serializable;

public class unit implements Serializable {
    int id;
    int type; //0: army, 1: fleet, 2: test
    int postion;
    int team; //The team which the army belongs to by id

    public unit(int id, int type, int postion, int team) {
        this.id = id;
        this.type = type;
        this.postion = postion;
        this.team = team;
    }

}
