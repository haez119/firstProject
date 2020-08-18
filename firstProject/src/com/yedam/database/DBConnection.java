package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection dbConn; //필드
    
    public static Connection getConnection() // 메소드
    {
        Connection conn = null;
        try {
            String user = "hr"; // hr로 변경
            String pw = "hr";
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // orcl > xe => 데이터베이스 아이디 
            
            Class.forName("oracle.jdbc.driver.OracleDriver");   // 오라클에서 제공해주는 드라이브
            conn = DriverManager.getConnection(url, user, pw);
            
            System.out.println("Database에 연결되었습니다.\n");
            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
        } catch (SQLException sqle) {
            System.out.println("DB 접속실패 : "+sqle.toString());
        } catch (Exception e) {
            System.out.println("Unkonwn error");
            e.printStackTrace();
        }
        return conn;     
    }


}
