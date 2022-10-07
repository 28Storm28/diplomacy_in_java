import java.util.List;

public class team {
    int id;
    int supply;
    List<unit> army;

    public team(int id, int supply, List<unit> army) {
        this.id = id;
        this.supply = supply;
        this.army = army;
    }
}
