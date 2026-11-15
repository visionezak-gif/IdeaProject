public enum GeoPoliticalZone {


    NORTHCENTRAL ("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTHEAST ("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST ("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST ("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH ("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTHWEAST ("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");


    private String [] states;

    GeoPoliticalZone(String... states){
        this.states = states;
    }

    public boolean hasState(String state){
        for(String items : states){
            if(items.equalsIgnoreCase(state)){
                return true;
            }
        }
        return false;
    }

}
