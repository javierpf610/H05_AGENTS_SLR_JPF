package calcsrc;

public class linearRegression {
    private  int[][] dataSet;
    private double sumxy,sumxsq,sumx,sumy,x;


    public linearRegression(int[][] dataSet,double x) {
        this.dataSet = dataSet;
        this.x= x;
        Init();
    }

    private void Init(){
        for(int i = 0; i < dataSet.length; i++) {
            sumx += dataSet[i][1];
            sumy += dataSet[i][0];
            sumxsq += dataSet[i][1]*dataSet[i][1];
            sumxy += dataSet[i][1]*dataSet[i][0];

        }

    }

    public double Beta0(){
        return (sumxsq * sumy- sumx * sumxy)/(dataSet.length * sumxsq - (sumx * sumx));
    }
    public double Beta1(){
        return (dataSet.length * sumxy - sumx *  sumy)/(dataSet.length * sumxsq - (sumx * sumx));
    }
    public double yhat(){return Beta0()+Beta1()*x;}

    public void printRegressionEquation(){
        System.out.println("Y"+(char) 94+"="+Beta0()+"+"+Beta1()+"("+x+")");
    }
    public void printYHat(){
        System.out.println("Y"+(char) 94+"="+yhat());
    }
}
