package OOP.Interface1;

public class Triangle implements Shape {

    int height;

    @Override
    public Integer area(int side){
        return (side*height)/2;
    }


    public Double perimeter(){
        return 10.5;
    }

    public void info(){
        System.out.println("I am info from triangle");
    }

    public void info(String nameOfShape){
        System.out.println("I am info from triangle"+nameOfShape);
    }


}
