package Methods;

public class NetFlix {

    String accountName;
    String username;
  static double monthlyData=200;

    public double usage(double data){

       return monthlyData = monthlyData-data;

    }

    public static void main(String[] args) {
        NetFlix flix = new NetFlix();
        flix.usage(12);

        flix.accountName="Susi";

        NetFlix net = new NetFlix();

        net.usage(2);



        System.out.println(flix.monthlyData);
        System.out.println(flix.accountName);
        System.out.println(net.monthlyData);
    }
}
