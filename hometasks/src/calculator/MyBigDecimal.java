package calculator;

import java.math.BigDecimal;

public class MyBigDecimal extends BigDecimal {

    private String local = "ru";
    private String val = "";

    MyBigDecimal(String str){
        super(str);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
