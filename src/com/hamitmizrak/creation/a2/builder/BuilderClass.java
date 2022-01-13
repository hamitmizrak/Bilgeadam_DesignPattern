package com.hamitmizrak.creation.a2.builder;

public class BuilderClass {
    private String adi;
    private String soyadi;

    // parametresiz constructor
    public BuilderClass() {
    }

    // parametreli constructor
    public BuilderClass(Builder builder) {
        this.adi = builder.adi;
        this.soyadi = builder.soyadi;
    }

    // getter and setter
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    @Override
    public String toString() {
        return "BuilderClass [adi=" + adi + ", soyadi=" + soyadi + "]";
    }


    // inner class
    public static class Builder {
        private String adi;
        private String soyadi;

        public Builder() {

        }

        public Builder adi(String adi) {
            this.adi = adi;
            return this;
        }

        public Builder soyadi(String soyadi) {
            this.soyadi = soyadi;
            return this;
        }

        // build
        public BuilderClass build() {
            return new BuilderClass(this);
        }

    }



}
