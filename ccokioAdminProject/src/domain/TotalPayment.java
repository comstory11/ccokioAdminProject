package domain;

public class TotalPayment {

	private String userId = "비회원";
	private String userName;
	private String userTel;
	private String productName;
	private int productPrice;
	private int orderAmount;
	private float userTotalPrice;
	private float nonUserTotalPrice;
	private String className = "해당 안됨";
	private float disCount;
	private int couponUseAmount;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public float getDisCount() {
		return disCount;
	}
	public void setDisCount(float disCount) {
		this.disCount = disCount;
	}
	public int getCouponUseAmount() {
		return couponUseAmount;
	}
	public void setCouponUseAmount(int couponUseAmount) {
		this.couponUseAmount = couponUseAmount;
	}
	public float getUserTotalPrice() {
		return userTotalPrice;
	}
	public void setUserTotalPrice(float userTotalPrice) {
		this.userTotalPrice = userTotalPrice;
	}
	public float getNonUserTotalPrice() {
		return nonUserTotalPrice;
	}
	public void setNonUserTotalPrice(float nonUserTotalPrice) {
		this.nonUserTotalPrice = nonUserTotalPrice;
	}	

}
