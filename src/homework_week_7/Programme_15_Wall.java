package homework_week_7;

public class Programme_15_Wall {
    // instance variable
    double width;
    double height;

    // default constructor
    public Programme_15_Wall(){

    }
    // parameterizes constructor
    public  Programme_15_Wall(double width, double height){
        if(width<0){
            this.width=0;
        }else{
            this.width=width;
        }
        if(height<0){
            this.height=0;
        }else{
            this.height=height;
        }
    }
    // get width method
    public double getWidth(){
        return width;
    }
    // get height method
    public double getHeight(){
        return height;
    }
    //set width method
    public void setWidth(double width){
        if(width<0){
            this .width=0;
        }else{
            this.width=width;
        }
    }
    // set height method
    public void setHeight(double height){
        if(height<0){
            this.height= 0;
        }else{
            this.height= height;
        }
    }
    // get area method
    public double getAraea(){
        return(getHeight() * getWidth());
    }
    // main method
    public static void main (String[]arge){
        Programme_15_Wall wall = new Programme_15_Wall();
        System.out.println("area=" + wall.getAraea());
        wall.setHeight(-1.5);
        System.out.println("width=" +wall.getWidth());
        System.out.println("height="+ wall.getHeight());
        System.out.println("area =" +wall.getAraea());
    }
}
