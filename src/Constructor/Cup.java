package Constructor;

public class Cup {

    int size;
    boolean isClean;
    double liquidAmount;

    public Cup(int inputSize, boolean inputClean, double inputLiquidAmount){
        this();
        this.size=inputSize;
        this.isClean=inputClean;
        this.liquidAmount=inputLiquidAmount;
    }

    public Cup (){

    }

    public void info(){

        System.out.println("Size is: "+size+" is clean "+isClean+ " liquid amount is: "+liquidAmount);
    }
    public String toString(){
        return "Size is: "+size+" is clean "+isClean+ " liquid amount is: "+liquidAmount;
    }

}
