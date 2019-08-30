package Interpreter;

import java.util.Objects;

public class AndExpression implements Expression {
    private Expression city;
    private Expression person;
    public AndExpression(String[] citys,String[] persons){
        city = new TernimalExpression(citys);
        person = new TernimalExpression(persons);
    }
    @Override
    public boolean interpret(String info){
        String s[]=info.split("的");
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}
