package service;

import java.util.List;
import bean.Application;
import dao.ApplicationOperate;

public class ApplicationService {
	//调用dao的函数对application表进行操作
	public List<Application> getList() {
	    return ApplicationOperate.getList();
	}
	public boolean insert(Application bean) {
		return ApplicationOperate.insert(bean);
	}
	public boolean delete(int id) {
		return ApplicationOperate.delete(id);
	}
	public boolean update(Application bean) {
		return ApplicationOperate.update(bean);
	}
	public List<Application> query(int id) {
		return ApplicationOperate.query(id);
	}
}
