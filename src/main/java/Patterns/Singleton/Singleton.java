package Patterns.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h3dg3wytch on 8/19/16.
 */
public class Singleton<T> {

    private static Singleton singleton;


    private Singleton(){
        this.singleton = new Singleton();
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
