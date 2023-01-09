class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temp= new double[2];
        temp[0]=(celsius + 273.15d);
        temp[1]=(celsius*9/5)+32;
        return temp;
    }
}