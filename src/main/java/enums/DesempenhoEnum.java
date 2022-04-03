package enums;

import java.math.BigDecimal;

public enum DesempenhoEnum {
    A_DESEJAR(new BigDecimal("0.03")),
    BOM(new BigDecimal("0.15")),
    OTIMO(new BigDecimal("0.20"));

    private BigDecimal percentual;

    // constructors

    DesempenhoEnum(BigDecimal percentual) {
        this.percentual = percentual;
    }

    // getters and setters

    public BigDecimal getPercentual() {
        return percentual;
    }

    public void setPercentual(BigDecimal percentual) {
        this.percentual = percentual;
    }
}
