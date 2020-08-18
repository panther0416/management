package dao;

import bean.Application;


public class test {

	public static void main(String[] args) {
//		ArrayList<Application> result = ApplicationOperate.getList();
//		int l = result.size();
//		while (l-- > 0) {
//			if (result.get(l) == null) {
//				System.out.println("查询为空");
//			} else {
//				System.out.println(result.get(l).getName());
//			}
//		}
		
//		Application application = new Application(5,"测试用例","faf","fda","dad","fda","fda","faf","fda","fda","fda");
//		if(ApplicationOperate.insert(application)) {
//			System.out.println("添加成功");
//		} else {
//			System.out.println("添加失败");
//		}
		
		Application application = new Application(3,"测试用例3","faf","fda","dad","fda","fda","faf","fda","fda","fda");
		if(ApplicationOperate.update(application)) {
			System.out.println("修改成功");
			System.out.println(ApplicationOperate.query(3).get(0).getName());
		} else {
			System.out.println("修改失败");
		}
	}
}
