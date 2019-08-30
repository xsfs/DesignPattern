package Interpreter;

public class Context {
    private String[] city={"韶关","广州"};
    private String[] person={"老人","妇女","儿童"};
    private Expression cityPerson;
    public Context(){
        cityPerson=new AndExpression(city,person);
    }
    public void freedoc(String info){
        if(cityPerson.interpret(info)){
            System.out.println(info+",本次乘车免费");
        }else {
            System.out.println(info+"您不是免费人员，本次乘车2元。");
        }
    }
}
