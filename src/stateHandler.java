public class stateHandler {
    public province getProvinceById(int id){
        for (province p:map) {
            if(p.id == id){
                return p;
            }
        }
        return null;
    }
    province[] map;
    unit[] units;
}
