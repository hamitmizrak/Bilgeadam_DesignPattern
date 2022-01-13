package com.hamitmizrak.creation.a1.singleton;

public class SingletonDesignPattern {

    // database: 1 bağlantı olsun büütn connection o bağlantıyı kullansın
    //eğer yeni bir gelirse var olan bağlantıyı kullansın yoksa eskisini kullansın.

    //1-)  SingletonDesignPattern instance oluşturmak
    private static SingletonDesignPattern instance;


    //2-) constructor private olmasını sağlamak
    private   SingletonDesignPattern() {
    }

    //3-) SingletonDesignPattern dış dünyaya açık kapı burası olacaktır.
    public static SingletonDesignPattern getInstance() {
        if(instance==null){
            instance=new SingletonDesignPattern();
        }
        return instance;
    }
}
