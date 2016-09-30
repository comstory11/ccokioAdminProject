package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.Controllers;
import domain.User;
import domain.UserPayment;
import repository.LoginRepository;

public class UserPaymentDao {

	public ArrayList<UserPayment> userPaymentList(User searchUser) {

		ArrayList<UserPayment> userPaymentList = new ArrayList<UserPayment>();

		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{

			String sql = "select pm.userPaymentNumber, pm.userOrderNumber, o.userId, d.className, o.productName, p.productPrice, o.orderAmount, o.couponuseAmount, (((o.orderAmount - o.couponuseAmount)*p.productPrice)*d.discount), pm.paymentDate from UserOrder o, product p, userpayment pm, discount d, user1 u where pm.userorderNumber = o.userorderNumber and o.productName = p.productName and u.userClass = d.udiscountClassNumber and o.paymentflag = 'y' and o.userId = ?";
			pstmt = Controllers.getProgramController().getConnection().prepareStatement(sql);
			pstmt.setString(1, searchUser.getUserId());

			rs = pstmt.executeQuery();

			if(rs.next()){

				UserPayment userPayment = new UserPayment();
				userPayment.setUserPaymentNumber(rs.getInt(1));
				userPayment.setUserOrderNumber(rs.getInt(2));
				userPayment.setUserId(rs.getString(3));
				userPayment.setClassName(rs.getString(4));
				userPayment.setProductName(rs.getString(5));
				userPayment.setProductPrice(rs.getInt(6));
				userPayment.setOrderAmount(rs.getInt(7));
				userPayment.setCouponUseAmount(rs.getInt(8));
				userPayment.setTotalPrice(rs.getFloat(9));
				userPayment.setPaymentDate(rs.getString(10));
				userPaymentList.add(userPayment);

			}

		} catch(SQLException e) {
			e.printStackTrace();
		}finally {

			if(stmt != null){try{stmt.close();} catch (SQLException e){e.printStackTrace();}}
			if(rs != null){try{rs.close();} catch (SQLException e){e.printStackTrace();}}

		}

		return userPaymentList;
	}

}
