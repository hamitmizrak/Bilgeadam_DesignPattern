package com.hamitmizrak.creation.a2.builder;

public class BuilderTestMain {


    public static void main(String[] args) {
        BuilderClass builder=new BuilderClass.Builder().adi("Hamit").soyadi("Mızrak").build();
        System.out.println(builder);
    }
}
