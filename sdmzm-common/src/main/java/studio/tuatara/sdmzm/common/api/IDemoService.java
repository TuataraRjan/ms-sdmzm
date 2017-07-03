/**
 * 
 */
package studio.tuatara.sdmzm.common.api;

import java.util.List;

import studio.tuatara.sdmzm.common.entity.UserInfo;

/**
 * @author Rjan
 *
 */
public interface IDemoService {

	int addUser(final UserInfo user);

	List<UserInfo> queryUsers();
}
