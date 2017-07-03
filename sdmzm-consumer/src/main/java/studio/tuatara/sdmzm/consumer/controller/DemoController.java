/**
 * 
 */
package studio.tuatara.sdmzm.consumer.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import studio.tuatara.sdmzm.common.api.IDemoService;
import studio.tuatara.sdmzm.common.entity.UserInfo;

/**
 * @author Rjan
 *
 */
@Controller
public class DemoController {

	@Reference(version="1.0.0")
	private IDemoService demoService;
	
	@RequestMapping("/demo")
    @ResponseBody
    List<UserInfo> demoMethod() {
		UserInfo user = new UserInfo();
		user.setUserName("Rjan");
		user.setUserCode("00001");
		user.setArea("01");
		user.setUserType("01");
		user.setUpdateDate(new Date());
		
		demoService.addUser(user);
		
		
        return demoService.queryUsers();
    }
}
