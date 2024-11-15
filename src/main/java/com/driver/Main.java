package com.driver;
class Main{
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        //System.out.println(obj.meth());
//        System.out.println(obj.meth());
        obj.meth();
        obj.meth();
    }}