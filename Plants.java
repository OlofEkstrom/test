package Övning1;



abstract class Plants{

    protected String namn;
    protected String type;
    protected double height;

    public Plants(String namn, String type, double height){
        this.namn = namn;
        this.type = type;
        this.height = height;
    }

    public String getName() {
        return namn;
    }

    public String getType(){
        return type;
    }

    public double getHeight() {
        return height;
    }
}
