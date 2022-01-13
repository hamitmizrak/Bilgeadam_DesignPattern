package com.hamitmizrak.creation.a1.singleton;

public class _A1_SingletonDesignPattern {

    // database: 1 bağlantı olsun büütn connection o bağlantıyı kullansın
    //eğer yeni bir gelirse var olan bağlantıyı kullansın yoksa eskisini kullansın.

    //1-)  SingletonDesignPattern instance oluşturmak
    private static _A1_SingletonDesignPattern instance;


    //2-) constructor private olmasını sağlamak
    private _A1_SingletonDesignPattern() {
    }

    //3-) SingletonDesignPattern dış dünyaya açık kapı burası olacaktır.
    public static _A1_SingletonDesignPattern getInstance() {
        if(instance==null){
            instance=new _A1_SingletonDesignPattern();
        }
        return instance;
    }
}
