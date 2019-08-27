package Builder;

public class Product {
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String a){
        partA=a;
    }
    public void setPartB(String b){
        partB=b;
    }
    public void setPartC(String c){
        partC=c;
    }
    public void show(){
        System.out.println(partA+" "+partB+" "+partC);
    }
}
