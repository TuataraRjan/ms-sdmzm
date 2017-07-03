/**
 * 
 */
package studio.tuatara.sdmzm.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import studio.tuatara.sdmzm.common.api.IDemoService;
import studio.tuatara.sdmzm.common.entity.UserInfo;
import studio.tuatara.sdmzm.provider.dao.IDemoDao;

/**
 * @author Rjan
 *
 */
@Service(version="1.0.0")
class DemoServiceImpl implements IDemoService {
	@Autowired
	private IDemoDao demoDao;

	@Override
	public int addUser(UserInfo user) {
		return demoDao.addUser(user);
	}

	@Override
	public List<UserInfo> queryUsers() {

		return demoDao.queryUsers();
	}
}
