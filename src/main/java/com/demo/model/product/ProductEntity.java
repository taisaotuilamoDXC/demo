package com.demo.model.product;

import com.demo.entity.common.CommonEntity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "product")
public class ProductEntity extends CommonEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_code")
	private int productCode;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_price")
	private Double productPrice;

	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "product_categories")
	private String categories;

	public ProductEntity()
	{
	}

	public int getProductCode()
	{
		return productCode;
	}

	public void setProductCode(int productCode)
	{
		this.productCode = productCode;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public Double getProductPrice()
	{
		return productPrice;
	}

	public void setProductPrice(Double productPrice)
	{
		this.productPrice = productPrice;
	}

	public String getProductDescription()
	{
		return productDescription;
	}

	public void setProductDescription(String productDescription)
	{
		this.productDescription = productDescription;
	}

	public String getCategories()
	{
		return categories;
	}

	public void setCategories(String categories)
	{
		this.categories = categories;
	}
}
