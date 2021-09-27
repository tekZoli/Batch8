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

    public Cup (int newSize, boolean newClean){
        this.size=newSize;
        this.isClean=newClean;
        System.out.println("This is the two argument costructor");
    }

    public Cup(){
        this(33, true);
        System.out.println("This is the no argument costructor");
    }

    public void info(){

        System.out.println("Size is: "+size+" is clean "+isClean+ " liquid amount is: "+liquidAmount);
    }
    public String toString(){
        return "Size is: "+size+" is clean "+isClean+ " liquid amount is: "+liquidAmount;
    }

    protected void finalize(){
        System.out.println("Now one object went to the garbage");
    }

}
