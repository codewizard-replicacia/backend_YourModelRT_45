package Test.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import Test.model.Document;
import Test.model.Product;
import Test.model.Vendor;
import Test.model.OrderAlert;
import Test.model.Inventory;
import Test.model.PurchaseOrder;
import Test.model.Restuarant;
import Test.enums.ProductType;
import Test.converter.ProductTypeConverter;

@Entity(name = "VendorOrderdetails")
@Table(schema = "\"Test\"", name = "\"VendorOrderdetails\"")
@Data
public class VendorOrderdetails{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"VendorID\"")
	private Integer vendorID;

    
    @Column(name = "\"PurchaseOrderId\"")
    private Integer purchaseOrderId;
 
}