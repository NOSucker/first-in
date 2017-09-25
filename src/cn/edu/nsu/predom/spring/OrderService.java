/**
 * 
 */
package cn.edu.nsu.predom.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author LZG
 *
 */
@Service()
public class OrderService extends BaseService{

	@Override
	public List<Map<String, Object>> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getByEmail(String user_email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Map<String, Object> u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Map<String, Object> newUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public void submitOder(Map<String, Object> order,ArrayList<Map<String, Object>> buys){
		String sql1 = "insert into orders(order_id,order_total,order_dataTime,order_user) values(?,?,?,?)";
		Object[] orderParams = fromMapToObjectArray(order, "order_id,order_total,order-dataTime,order_user");
		jdbcTemplate.update(sql1, orderParams);
		
		String sql2 = "insert into buy(book_id,user_ID,buy_num,order_id) values(?,?,?,?)";
		for(int i=0;i<buys.size();i++){
			Object[] buysParams = fromMapToObjectArray(buys.get(i), "book_id,user_ID,buy_num,order_id");
			jdbcTemplate.update(sql2, buysParams);
		}
		
	}

}
