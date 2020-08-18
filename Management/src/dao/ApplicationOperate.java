package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Application;

public class ApplicationOperate {
	public static boolean insert(Application bean) {
		Connection conn = Connect.getConnection();
		PreparedStatement ps = null;
		int count = 0;
		String sql = "insert into application"
				+ " (id,name,version,type,project,bussinessCategory,bussinessType,runningMode,environment,loadMode,location)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setString(3, bean.getVersion());
			ps.setString(4, bean.getType());
			ps.setString(5, bean.getProject());
			ps.setString(6, bean.getBussinessCategory());
			ps.setString(7, bean.getBussinessType());
			ps.setString(8, bean.getRunningMode());
			ps.setString(9, bean.getEnvironment());
			ps.setString(10, bean.getLoadMode());
			ps.setString(11, bean.getLocation());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if (count > 0) {
			System.out.println("添加成功");
			return true;
		} else {
			System.out.println("添加失败");
			return false;
		}
	}
	
	public static boolean delete(int id) {
		Connection conn = Connect.getConnection();
		PreparedStatement ps = null;
		int count = 0;
		String sql = "delete from application where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if (count > 0) {
			System.out.println("删除成功");
			return true;
		} else {
			System.out.println("删除失败");
			return false;
		}
	}

	public static boolean update(Application bean) {
		Connection conn = Connect.getConnection();
		PreparedStatement ps = null;
		int count = 0;
		String sql = "update application"
				+ " set name = ?, version = ?, type = ?, project = ?, bussinessCategory = ?, bussinessType = ?, runningMode = ?, environment = ?, loadMode = ?, location = ?"
				+ " where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getVersion());
			ps.setString(3, bean.getType());
			ps.setString(4, bean.getProject());
			ps.setString(5, bean.getBussinessCategory());
			ps.setString(6, bean.getBussinessType());
			ps.setString(7, bean.getRunningMode());
			ps.setString(8, bean.getEnvironment());
			ps.setString(9, bean.getLoadMode());
			ps.setString(10, bean.getLocation());
			ps.setInt(11, bean.getId());
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		if (count > 0) {
			System.out.println("修改成功");
			return true;
		} else {
			System.out.println("修改失败");
			return false;
		}
	}
	
	public static ArrayList<Application> query(int id) {
		ArrayList<Application> list = new ArrayList<>(); 
		Connection conn = Connect.getConnection();
		Application bean = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from application where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			if (rs != null) {
				System.out.println("查询成功");
			} else {
				System.out.println("查询失败");
			}
			if (rs.next() == false) {
				System.out.println("，但查询为空");
			}
			do {
				bean = new Application();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setVersion(rs.getString("version"));
				bean.setType(rs.getString("type"));
				bean.setProject(rs.getString("project"));
				bean.setBussinessCategory(rs.getString("bussinessCategory"));
				bean.setBussinessType(rs.getString("bussinessType"));
				bean.setRunningMode(rs.getString("RunningMode"));
				bean.setEnvironment(rs.getString("Environment"));
				bean.setLoadMode(rs.getString("loadMode"));
				bean.setLocation(rs.getString("Location"));
				System.out.println("ope" + bean.getId() + bean.getName());
				list.add(bean);
			} while (rs.next());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	public static ArrayList<Application> getList() {
		ArrayList<Application> list = new ArrayList<>(); 
		Connection conn = Connect.getConnection();
		Application bean = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from application";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs == null) {
				System.out.println("查询失败");
			} else {
				System.out.println("查询成功");
			}
			if (rs.next() == false) {
				System.out.println("，但查询为空");
			}
			do {
				bean = new Application();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setVersion(rs.getString("version"));
				bean.setType(rs.getString("type"));
				bean.setProject(rs.getString("project"));
				bean.setBussinessCategory(rs.getString("bussinessCategory"));
				bean.setBussinessType(rs.getString("bussinessType"));
				bean.setRunningMode(rs.getString("RunningMode"));
				bean.setEnvironment(rs.getString("Environment"));
				bean.setLoadMode(rs.getString("loadMode"));
				bean.setLocation(rs.getString("Location"));
				list.add(bean);
			} while (rs.next());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//关闭连接
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
}