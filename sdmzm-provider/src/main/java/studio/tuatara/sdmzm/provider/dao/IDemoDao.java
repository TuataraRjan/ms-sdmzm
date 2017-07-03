/**
 * 
 */
package studio.tuatara.sdmzm.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import studio.tuatara.sdmzm.common.entity.UserInfo;

/**
 * @author Rjan
 *
 */
@Mapper
public interface IDemoDao {
	int addUser(UserInfo user);

	List<UserInfo> queryUsers();
}
