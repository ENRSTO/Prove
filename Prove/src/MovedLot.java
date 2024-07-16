import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovedLot {
	
	// inizio 21
	
	  int IDPR;
	    int IDPRBL;
	    int IDBLMBL;
	    int IDELBL;
	    int EVENBL;
	    String CDLTBL;
	    String TPMOBL;
	    int NROPBL;
	    String ORPRRM;
	    String SEGNRM;
	    String CDMGRM;
	    String CDARRM;
	    BigDecimal QTA1;
	    BigDecimal QTA2;
	    
	    public int getIDPR() {
			return IDPR;
		}

		public void setIDPR(int iDPR) {
			IDPR = iDPR;
		}

		public int getIDPRBL() {
			return IDPRBL;
		}

		public void setIDPRBL(int iDPRBL) {
			IDPRBL = iDPRBL;
		}

		public int getIDBLMBL() {
			return IDBLMBL;
		}

		public void setIDBLMBL(int iDBLMBL) {
			IDBLMBL = iDBLMBL;
		}

		public int getIDELBL() {
			return IDELBL;
		}

		public void setIDELBL(int iDELBL) {
			IDELBL = iDELBL;
		}

		public int getEVENBL() {
			return EVENBL;
		}

		public void setEVENBL(int eVENBL) {
			EVENBL = eVENBL;
		}

		public String getCDLTBL() {
			return CDLTBL;
		}

		public void setCDLTBL(String cDLTBL) {
			CDLTBL = cDLTBL;
		}

		public String getTPMOBL() {
			return TPMOBL;
		}

		public void setTPMOBL(String tPMOBL) {
			TPMOBL = tPMOBL;
		}

		public int getNROPBL() {
			return NROPBL;
		}

		public void setNROPBL(int nROPBL) {
			NROPBL = nROPBL;
		}

		public String getORPRRM() {
			return ORPRRM;
		}

		public void setORPRRM(String oRPRRM) {
			ORPRRM = oRPRRM;
		}

		public String getSEGNRM() {
			return SEGNRM;
		}

		public void setSEGNRM(String sEGNRM) {
			SEGNRM = sEGNRM;
		}

		public String getCDMGRM() {
			return CDMGRM;
		}

		public void setCDMGRM(String cDMGRM) {
			CDMGRM = cDMGRM;
		}

		public String getCDARRM() {
			return CDARRM;
		}

		public void setCDARRM(String cDARRM) {
			CDARRM = cDARRM;
		}

		public BigDecimal getQTA1() {
			return QTA1;
		}

		public void setQTA1(BigDecimal qTA1) {
			QTA1 = qTA1;
		}

		public BigDecimal getQTA2() {
			return QTA2;
		}

		public void setQTA2(BigDecimal qTA2) {
			QTA2 = qTA2;
		}

		public MovedLot(int IDPR, int IDPRBL, int IDBLMBL, int IDELBL, int EVENBL, String CDLTBL, String TPMOBL,
	                    int NROPBL, String ORPRRM, String SEGNRM, String CDMGRM, String CDARRM, BigDecimal QTA1, BigDecimal QTA2) {
	        this.IDPR = IDPR;
	        this.IDPRBL = IDPRBL;
	        this.IDBLMBL = IDBLMBL;
	        this.IDELBL = IDELBL;
	        this.EVENBL = EVENBL;
	        this.CDLTBL = CDLTBL;
	        this.TPMOBL = TPMOBL;
	        this.NROPBL = NROPBL;
	        this.ORPRRM = ORPRRM;
	        this.SEGNRM = SEGNRM;
	        this.CDMGRM = CDMGRM;
	        this.CDARRM = CDARRM;
	        this.QTA1 = QTA1;
	        this.QTA2 = QTA2;
	    }

	   

	    @Override
		public String toString() {
			return "MovedLot [IDPR=" + IDPR + ", IDPRBL=" + IDPRBL + ", IDBLMBL=" + IDBLMBL + ", IDELBL=" + IDELBL
					+ ", EVENBL=" + EVENBL + ", CDLTBL=" + CDLTBL + ", TPMOBL=" + TPMOBL + ", NROPBL=" + NROPBL
					+ ", ORPRRM=" + ORPRRM + ", SEGNRM=" + SEGNRM + ", CDMGRM=" + CDMGRM + ", CDARRM=" + CDARRM
					+ ", QTA1=" + QTA1 + ", QTA2=" + QTA2 + "]";
		}

		private static List<MovedLot> totalizzatore (List<MovedLot> originalList) {

	        Map<String, BigDecimal[]> quantityMap = new HashMap<> ();
	        List<MovedLot> resultList = new ArrayList<> ();

	        for (MovedLot lot : originalList) {
	            BigDecimal adjustedQTA1 = lot.getQTA1().multiply ("-".equals (lot.getSEGNRM()) ? BigDecimal.valueOf (-1) : BigDecimal.valueOf (1));
	            BigDecimal adjustedQTA2 = lot.getQTA2 ().multiply ("-".equals (lot.getSEGNRM()) ? BigDecimal.valueOf (-1) : BigDecimal.valueOf (1));
	            BigDecimal[] quantities = quantityMap.getOrDefault (lot.getCDLTBL(), new BigDecimal[] {BigDecimal.ZERO, BigDecimal.ZERO});
	            quantities[0] = quantities[0].add (adjustedQTA1);
	            quantities[1] = quantities[1].add (adjustedQTA2);
	            quantityMap.put (lot.getCDLTBL(), quantities);
	        }

	        for (MovedLot lot : originalList) {
	            BigDecimal[] quantities = quantityMap.get (lot.getCDLTBL());
	            if (quantities != null && (quantities[0].compareTo(BigDecimal.ZERO) != 0 || quantities[1].compareTo(BigDecimal.ZERO) != 0)) {
	                resultList.add (new MovedLot (lot.getIDPR(), lot.getIDPRBL (), lot.getIDBLMBL (), lot.getIDELBL (), lot.getEVENBL(), lot.getCDLTBL(), lot.getTPMOBL (),
	                    lot.getNROPBL (), lot.getORPRRM (), lot.getSEGNRM(), lot.getCDMGRM(), lot.getCDARRM(), quantities[0], quantities[1]));
	                quantityMap.remove (lot.getCDLTBL());
	            }
	        }
	        return resultList;
	    } // totalizzatore

	    public static Map<String, BigDecimal> getNegativeLotMinValues (List<MovedLot> movlotList) {
	        Map<String, BigDecimal> lotMinValues = new HashMap<> ();

	        for (MovedLot movlot : movlotList) {
	            if ("-".equals (movlot.getSEGNRM())) {
	                BigDecimal qta1 = movlot.getQTA1();
	                // BigDecimal qta2 = movlot.getQta2 ();

	                if (qta1 != null) {
	                    lotMinValues.merge (movlot.getCDLTBL(), qta1, BigDecimal::max);
	                }
	            }
	        }
	        return lotMinValues;
	    }    
	    
	    
	    
	
   public static void main(String[] args) {
	   List<MovedLot> originalList = Arrays.asList(
	            new MovedLot(-1, -8449, -25659, 5966, 445566, "LT.1", "P", 99946, "8479AVLH", "-", "026", "105415_LT_1", BigDecimal.valueOf(10.0000), BigDecimal.valueOf(10.0000)),
	            new MovedLot(-1, -8450, -25659, 5966, 445566, "LT.2", "P", 99946, "8479AVLH", "-", "026", "105415_LT_1", BigDecimal.valueOf(20.0000), BigDecimal.valueOf(20.0000)),
	            new MovedLot(-1, -8452, -25659, 5966, 445566, "LT.3", "P", 99946, "8479AVLH", "-", "026", "105415_LT_1", BigDecimal.valueOf(10.0000), BigDecimal.valueOf(10.0000)),
	            new MovedLot(-1, -8452, -25659, 5966, 445566, "LT.3", "P", 99946, "8479AVLH", "+", "026", "105415_LT_1", BigDecimal.valueOf(10.0000), BigDecimal.valueOf(10.0000)),
	            new MovedLot(-1, -8452, -25659, 5966, 445566, "LT.2", "P", 99946, "8479AVLH", "+", "026", "105415_LT_1", BigDecimal.valueOf(10.0000), BigDecimal.valueOf(10.0000)),
	            new MovedLot(-1, -8452, -25659, 5966, 445566, "LT.2", "P", 99946, "8479AVLH", "+", "026", "105415_LT_1", BigDecimal.valueOf(5.0000), BigDecimal.valueOf(5.0000)),
	            new MovedLot(-1, -8452, -25659, 5966, 445566, "LT.2", "P", 99946, "8479AVLH", "-", "026", "105415_LT_1", BigDecimal.valueOf(10.0000), BigDecimal.valueOf(10.0000))
	         //   new MovedLot(-1, -8455, -25659, 5966, 445566, "LOTT.ES.3", "P", 99946, "8479AVLH", "-", "026", "105415_LT_1", BigDecimal.valueOf(17.0000), BigDecimal.valueOf(17.0000)),
	         //   new MovedLot(-1, -8451, -25659, 5966, 445566, "LOTT.ES.1", "P", 99946, "8479AVLH", "-", "026", "105415_LT_1", BigDecimal.valueOf(20.0000), BigDecimal.valueOf(20.0000)),
	         //   new MovedLot(-1, -8454, -25665, 5968, 445566, "LOTT.ES.1", "P", 99946, "8479AVLH", "+", "026", "105415_LT_1", BigDecimal.valueOf(5.0000), BigDecimal.valueOf(5.0000))
	        );
	   
	   Map<String, BigDecimal[]> quantityMap = new HashMap<>();
	   
//	   for (MovedLot lot : originalList) {
//           BigDecimal adjustedQTA1 = lot.QTA1.multiply("-".equals(lot.SEGNRM) ? BigDecimal.valueOf(-1) : BigDecimal.valueOf(1));
//           BigDecimal adjustedQTA2 = lot.QTA1.multiply("-".equals(lot.SEGNRM) ? BigDecimal.valueOf(-1) : BigDecimal.valueOf(1));
//           BigDecimal[] quantities = quantityMap.getOrDefault(lot.CDLTBL, new BigDecimal[]{BigDecimal.ZERO, BigDecimal.ZERO});
//           quantities[0] = quantities[0].add(adjustedQTA1);
//           quantities[1] = quantities[1].add(adjustedQTA2);
//           quantityMap.put(lot.CDLTBL, quantities);
//       }
//	   
	   List<MovedLot> resultList = new ArrayList<>();
//	   
//	   for (MovedLot lot : originalList) {
//           BigDecimal[] quantities = quantityMap.get(lot.CDLTBL);
//           if (quantities != null) {
//               resultList.add(new MovedLot(lot.IDPR, lot.IDPRBL, lot.IDBLMBL, lot.IDELBL, lot.EVENBL, lot.CDLTBL, lot.TPMOBL,
//                       lot.NROPBL, lot.ORPRRM, lot.SEGNRM, lot.CDMGRM, lot.CDARRM, quantities[0], quantities[1]));
//               quantityMap.remove(lot.CDLTBL);
//           }
//       }
	   
	   var map = getNegativeLotMinValues(originalList);
	 //  totalizzatore(originalList);
	   System.out.println(map);
	   
	   for (MovedLot lot : totalizzatore(originalList)) {
		   if (!lot.getQTA1().equals(BigDecimal.ZERO))
			   System.out.println(lot);
	   }
   }
   // fine ehhh 1
}
