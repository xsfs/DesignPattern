package Interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TernimalExpression implements Expression {
    private Set<String> set= new  HashSet<>();
    public TernimalExpression(String[] data){
        set.addAll(Arrays.asList(data));
    }
    @Override
    public boolean interpret(String info){
        return set.contains(info);
    }
}
