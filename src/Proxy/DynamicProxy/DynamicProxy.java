package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private AbstractSubject obj=null;

    public DynamicProxy(AbstractSubject obj){
        this.obj= obj;
    }
    @Override
    public Object invoke(Object object, Method m,Object[] args) throws InvocationTargetException, IllegalAccessException {
        m.invoke(obj,args);//这里不能使用传入的object，否则会陷入死循环
        return null;
    }
}
