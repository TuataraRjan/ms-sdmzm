/**
 * 
 */
package studio.tuatara.sdmzm.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Rjan
 *
 */
public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2370402631630614097L;
	private int id;
	private String userName;
	private String userCode;
	private String area;
	private String userType;
	private Date updateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
}
