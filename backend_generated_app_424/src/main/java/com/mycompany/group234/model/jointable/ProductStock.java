package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Document;
import com.mycompany.group234.model.Product;
import com.mycompany.group234.model.Vendor;
import com.mycompany.group234.model.OrderAlert;
import com.mycompany.group234.model.Inventory;
import com.mycompany.group234.model.PurchaseOrder;
import com.mycompany.group234.model.Restuarant;
import com.mycompany.group234.enums.ProductType;
import com.mycompany.group234.converter.ProductTypeConverter;

@Entity(name = "ProductStock")
@Table(schema = "\"generated_app\"", name = "\"ProductStock\"")
@Data
public class ProductStock{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"ProductId\"")
	private Integer productId;

    
    @Column(name = "\"InventoryId\"")
    private String inventoryId;
 
}