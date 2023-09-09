package Test.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum ProductType{
	    Edible,
	    Cleaning,
	    Grooming; 
    public int value(ProductType productType) {
        return productType.ordinal();
    }
    public static ProductType getProductType(int ordinal) {
        for(ProductType productType : ProductType.values())
                if(productType.ordinal() == ordinal)
                        return productType;
        return null;
    }
}


