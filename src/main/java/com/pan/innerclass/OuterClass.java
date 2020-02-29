package com.pan.innerclass;

public class OuterClass {
    private Integer index;
    private String name;

    public OuterClass(int index,String name) {
        this.index = index;
        this.name = name;
    }

    //定义在其他类中的类，称为内部类
    public class InnerClass {
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        public class InnerClass2 {
            public class InnerClass3{

            }
        }

        public void printInfo() {
//            StringBuilder tmp = new StringBuilder();
//            tmp.append("外围类index = ");
//            tmp.append(index);
//            tmp.append(",外围类name = ");
//            tmp.append(OuterClass.this.name);
//            System.out.println(tmp.toString());

            // 使用局部内部类实现打印
//            String name = "方法";
//
//            class PrintClass {
//                void print() {
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index = ");
//                    tmp.append(index);
//                    tmp.append(",外围类name = ");
////                    tmp.append(OuterClass.this.name);
//                    tmp.append(InnerClass.this.name);   //外围类为InnerClass
//                    System.out.println(tmp.toString());
//
//                }
//            }
//            new PrintClass().print();

            // 使用匿名内部类来实现打印

            /*
            class PrintClassNew extends PrintClass {
            }
            new PrintClassNew().print();
            * */

            /*
            new PrintClass() {
            }.print();
            * */

/*            class PrintInterfaceImpl implements PrintInterface{
                @Override
                public void print() {

                }
            }
            new PrintInterfaceImpl().print();*/


            new PrintClass("类名") {
                @Override
                public void print() {
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类index = ");
                    tmp.append(index);
                    tmp.append(",外围类name = ");
//                    tmp.append(OuterClass.this.name);
//                    tmp.append(InnerClass.this.name);   //外围类为InnerClass
                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }.print();

        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(1,"我是外部类");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass("内部类");
        innerClass.printInfo();
    }

}
