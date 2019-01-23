/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  
/**
 *
 * @author kd sanghani
 */
import java.util.*;  
    import java.sql.*;  
      
    public class EmpDao {  
        static final String USER = "root";
   static final String PASS = "";
      
        public static Connection getConnection(){  
            Connection con=null;  
            try{  
                Class.forName("com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aj",USER,PASS);  
            }catch(ClassNotFoundException | SQLException e){System.out.println(e);}  
            return con;  
        }  
        public static int save(Emp e){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "insert into user905(id,name,password,email,country,sem) values (?,?,?,?,?,?)");
                ps.setString(1,e.getId());
                ps.setString(2,e.getName());  
                ps.setString(3,e.getPassword());  
                ps.setString(4,e.getEmail());  
                ps.setString(5,e.getCountry()); 
                ps.setString(6,e.getSem());
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int update(Emp e){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "update user905 set name='?', password='?' ,email='?' , country='?' , sem='?' where id=?");  
                ps.setString(1,e.getName());  
                ps.setString(2,e.getPassword());  
                ps.setString(3,e.getEmail());  
                ps.setString(4,e.getCountry());  
                ps.setString(5,e.getSem());
                ps.setString(6,e.getId());  
                status=ps.executeUpdate();    
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int delete(int id){  
            int status=0;  
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
                ps.setInt(1,id);  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return status;  
        }  
        public static Emp getEmployeeById(int id){  
            Emp e=new Emp();  
              
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
                ps.setInt(1,id);  
                ResultSet rs=ps.executeQuery();  
                if(rs.next()){  
                    e.setId(rs.getString(1));  
                    e.setName(rs.getString(2));  
                    e.setPassword(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setCountry(rs.getString(5));  
                    e.setSem(rs.getString(6));
                }  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return e;  
        }  
        public static List<Emp> getAllEmployees(String sid){  
            List<Emp> list=new ArrayList<>();  
              
            try{  
                Connection con=EmpDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from user905 where sem=?"); 
                ps.setString(1,sid);
                ResultSet rs=ps.executeQuery();  
                while(rs.next()){  
                    Emp e=new Emp();  
                    e.setId(rs.getString(1));  
                    e.setName(rs.getString(2));  
                    e.setPassword(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setCountry(rs.getString(5));  
                    e.setSem(rs.getString(6));
                    list.add(e);  
                }  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return list;  
        }  

    static Emp getEmployeeById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }  