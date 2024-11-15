package com.driver;

    class Main {
        Main() {
        }

        public static void main(String[] args) {
            B obj = new B();
            obj.meth();
            obj.meth();
        }

        public static class B extends A {
            public B() {
            }

            public String meth() {
                return "Method is overridden in Extendend class B";
            }
        }

        public static class A {
            public A() {
            }

            public String meth() {
                return "Invoking method from class A";
            }
        }
    }
