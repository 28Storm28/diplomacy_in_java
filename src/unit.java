import java.io.Serializable;

public class unit implements Serializable {
    int id;
    int type; //0: army, 1: fleet, 2: test
    int postion;

    public unit(int id, int type, int postion) {
        this.id = id;
        this.type = type;
        this.postion = postion;
    }
}
