package pl.vistula.podatekstepien;
import java.math.BigDecimal;
public class PodatekStepien {

    public static void main(String[] args) {

        double ProductCostStepien = 9.99;
        double TaxStepien = 0.23;
        double AfterTaxStepien = ProductCostStepien - ProductCostStepien * TaxStepien;
        AfterTaxStepien *= 10000;
        double BackWithTaxStepien = 0;

        System.out.println("Koszt 10000 sztuk produktu brutto: " + AfterTaxStepien);

        
    }

}
