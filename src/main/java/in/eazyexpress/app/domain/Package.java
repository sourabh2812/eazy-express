package in.eazyexpress.app.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "package_detail")
public class Package implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4318528974268098249L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "package_id")
	private Long packageId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "unit_price")
	private Double unitPrice;

	@Column(name = "length")
	private Integer length;

	@Column(name = "width")
	private Integer width;

	@Column(name = "hieght")
	private Integer hieght;

	@Column(name = "weight")
	private Double weight;

	@Column(name = "weight_metrics")
	private String weightMetrics;

	@OneToOne(fetch = FetchType.EAGER)
	private Address senderAddress;

	@OneToOne(fetch = FetchType.EAGER)
	private Address receiverAddress;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "package_id", referencedColumnName = "package_id", insertable = true, updatable = true)
	private List<ScanRecord> scanRecords;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the packageId
	 */
	public Long getPackageId() {
		return packageId;
	}

	/**
	 * @param packageId the packageId to set
	 */
	public void setPackageId(Long packageId) {
		this.packageId = packageId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the unitPrice
	 */
	public Double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the length
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(Integer length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * @return the hieght
	 */
	public Integer getHieght() {
		return hieght;
	}

	/**
	 * @param hieght the hieght to set
	 */
	public void setHieght(Integer hieght) {
		this.hieght = hieght;
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * @return the weightMetrics
	 */
	public String getWeightMetrics() {
		return weightMetrics;
	}

	/**
	 * @param weightMetrics the weightMetrics to set
	 */
	public void setWeightMetrics(String weightMetrics) {
		this.weightMetrics = weightMetrics;
	}

	/**
	 * @return the senderAddress
	 */
	public Address getSenderAddress() {
		return senderAddress;
	}

	/**
	 * @param senderAddress the senderAddress to set
	 */
	public void setSenderAddress(Address senderAddress) {
		this.senderAddress = senderAddress;
	}

	/**
	 * @return the receiverAddress
	 */
	public Address getReceiverAddress() {
		return receiverAddress;
	}

	/**
	 * @param receiverAddress the receiverAddress to set
	 */
	public void setReceiverAddress(Address receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	/**
	 * @return the scanRecords
	 */
	public List<ScanRecord> getScanRecords() {
		return scanRecords;
	}

	/**
	 * @param scanRecords the scanRecords to set
	 */
	public void setScanRecords(List<ScanRecord> scanRecords) {
		this.scanRecords = scanRecords;
	}

}
