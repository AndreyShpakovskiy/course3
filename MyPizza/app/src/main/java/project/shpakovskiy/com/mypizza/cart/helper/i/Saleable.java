package project.shpakovskiy.com.mypizza.cart.helper.i;

import java.math.BigDecimal;

public interface Saleable {
    BigDecimal getPrice();
    String getName();
}
