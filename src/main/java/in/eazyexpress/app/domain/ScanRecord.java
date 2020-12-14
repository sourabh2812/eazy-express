package in.eazyexpress.app.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scan_record")
public class ScanRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5831842005813554430L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "package_id")
	private Long packageId;

	@Column(name = "scan_date")
	private Date scanDate;

	@Column(name = "location")
	private String location;

	@Column(name = "activity")
	private String activity;

	@Column(name = "status")
	private String status;

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
	 * @return the scanDate
	 */
	public Date getScanDate() {
		return scanDate;
	}

	/**
	 * @param scanDate the scanDate to set
	 */
	public void setScanDate(Date scanDate) {
		this.scanDate = scanDate;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the activity
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(String activity) {
		this.activity = activity;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
