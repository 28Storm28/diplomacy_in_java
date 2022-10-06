import java.io.Serializable;
import java.util.List;

public class order implements Serializable {
    unit relatedUnit;
    province startingLocation;
    province endingLocation;
    int type; //0:Hold 1:Support 2:Move 3:convoy
    public boolean checkOrder(){
        if(this.type == 3){
            if(this.relatedUnit.type != 1){
                return false;
            }
        }
        if(!startingLocation.borders.contains(endingLocation.id)){
            return false;
        }
        return true;
    }
}
