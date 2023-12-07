package Model.BEAN;

public class ProductBean {
    private int productId;
    private String name;
    private String description;
    private double priceOriginal;
    private double priceSale;
    private String manufacturer;
    private String imageUrl;

    public ProductBean() {
    	
    }

    public ProductBean(int productId, String name, String description, double priceOriginal, double priceSale, String manufacturer,String imageUrl) {
    	this.productId = productId;
    	this.name =name;
    	this.description = description;
    	this.priceOriginal = priceOriginal;
    	this.priceSale = priceSale;
    	this.manufacturer = manufacturer;
    	this.imageUrl = imageUrl;
    }
    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceOriginal() {
        return priceOriginal;
    }

    public void setPriceOriginal(double priceOriginal) {
        this.priceOriginal = priceOriginal;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(double priceSale) {
        this.priceSale = priceSale;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
