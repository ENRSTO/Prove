import java.math.BigDecimal;

public class ErpQuantity {

	    public BigDecimal qty = BigDecimal.ZERO;
	    public BigDecimal qty2 = BigDecimal.ZERO;

	    public ErpQuantity () {
	    }

	    public ErpQuantity (BigDecimal qty, BigDecimal qty2) {
	        this.qty = qty;
	        this.qty2 = qty2;

	    }

		@Override
		public String toString() {
			return "ErpQuantity [qty=" + qty + ", qty2=" + qty2 + "]";
		}
	    
	    

}