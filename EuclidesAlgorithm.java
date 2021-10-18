package JAVA;

public class EuclidesAlgorithm {
    static int EuclidesAlgorithmfunction(int x,int y){
        System.out.println("mcd("+x+","+y+")");
        int r=x%y;
        if(r==0){
            System.out.println("mcd("+y+","+r+")");
            return y;
        }
        else{
            return EuclidesAlgorithmfunction(y,r);
        } 
    }
    public static void main(String[] args) {
    int proof1=EuclidesAlgorithmfunction(194, 70);
    System.out.println(proof1);
    }
}
