package OOP.Interface1;

public class Square implements Shape{
//(base*height0/2
    @Override
    public Integer area(int side){
        return 5;
    }
    public Double perimeter(){
        return 105d;
    }
    public Integer area(int side, int heigt){
        return side*side;
    }


}
