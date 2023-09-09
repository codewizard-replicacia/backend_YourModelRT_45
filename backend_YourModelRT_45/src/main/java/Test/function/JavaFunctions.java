package Test.function;

import Test.model.Document;
import Test.model.Product;
import Test.model.Vendor;
import Test.model.OrderAlert;
import Test.model.Inventory;
import Test.model.PurchaseOrder;
import Test.model.Restuarant;
import Test.enums.ProductType;
import Test.converter.ProductTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import Test.repository.OrderAlertRepository;
import Test.repository.RestuarantRepository;
import Test.repository.ProductRepository;
import Test.repository.PurchaseOrderRepository;
import Test.repository.VendorRepository;
import Test.repository.DocumentRepository;
import Test.repository.InventoryRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
