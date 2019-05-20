package Deadlock;

public class Resources {
    private Integer a;
    private String s;

    public Integer getA() {
        return a;
    }

    public String getS() {
        return s;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Resources(Integer a, String s) {
        this.a = a;
        this.s = s;

    }
}
