package domain;

public class UserPayment {

	private int userPaymentNumber;
	private int userOrderNumber;
	private String userId;
	private String productName;
	private int productPrice;
	private int orderAmount;
	private float totalPrice;
	private String paymentFlag;
	private String paymentDate;
	private String className;
	private float disCount;
	private int couponUseAmount;
	
	public UserPayment() {
	
	}

	public int getUserPaymentNumber() {
		return userPaymentNumber;
	}

	public void setUserPaymentNumber(int userPaymentNumber) {
		this.userPaymentNumber = userPaymentNumber;
	}

	public int getUserOrderNumber() {
		return userOrderNumber;
	}

	public void setUserOrderNumber(int userOrderNumber) {
		this.userOrderNumber = userOrderNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentFlag() {
		return paymentFlag;
	}

	public void setPaymentFlag(String paymentFlag) {
		this.paymentFlag = paymentFlag;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
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

	
}
