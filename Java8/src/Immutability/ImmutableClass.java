//package Immutability;
//
//final public class ImmutableClass {
//    final int anInt;
//    final double aDouble;
//    final MutableClass mutableClass;
//
//    public ImmutableClass(int anInt, double aDouble, MutableClass mutableClass) {
//        this.anInt = anInt;
//        this.aDouble = aDouble;
//
//        MutableClass mutableClass1 = new MutableClass();
////        mutableClass1.setA(mutableClass.getA());
//        this.mutableClass = mutableClass1;
//    }
//
//    public int getAnInt() {
//        return anInt;
//    }
//
//    public double getaDouble() {
//        return aDouble;
//    }
//
//    public MutableClass getMutableClass() {
//        return mutableClass;
//    }
//
//    public static void main(String[] args) {
//        MutableClass mutableClass = new MutableClass();
//        mutableClass.setA(1);
//        ImmutableClass immutableClass = new ImmutableClass(2, 2.0, mutableClass);
//
//        System.out.println(immutableClass.getMutableClass().getA());
//
//        mutableClass.setA(2);
//
//        System.out.println(immutableClass.getMutableClass().getA());
//    }
//}
//
//class MutableClass {
//    int a;
//
////    public void setA(MutableClass a) {
////        this.a = a;
////    }
//
//    public int getA() {
//        return a;
//    }
//}
