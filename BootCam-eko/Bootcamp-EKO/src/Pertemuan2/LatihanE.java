package Pertemuan2;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LatihanE {
	
	public static Connection connections() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mahasiswa", "postgres", "admin");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}	
	public static void main(String[] args) {
		//Scanner
		Scanner data = new Scanner(System.in);
		System.out.print("Kode Mahasiswa: ");
		String kode_mahasiswa = data.nextLine();
		System.out.print("Nama Mahasiswa: ");
		String nama_mahasiswa = data.nextLine();
		System.out.print("Alamat Mahasiswa: ");
		String alamat_mahasiswa = data.nextLine();
		System.out.print("Kode Agama: ");
		String kode_agama = data.nextLine();
		System.out.print("Kode Jurusan: ");
		String kode_jurusan = data.nextLine();
		System.out.print("Kode Mahasiswa: ");
		String kode = data.nextLine();
		//End Scanner
		
		//insertData(kode_mahasiswa, nama_mahasiswa, alamat_mahasiswa, kode_agama, kode_jurusan);
		readData("transaction","mahasiswa");
		updateData(kode, kode_mahasiswa, nama_mahasiswa, alamat_mahasiswa, kode_agama, kode_jurusan);
		data.close();
	}
	
	public static void insertData( String kode_mahasiswa,String nama_mahasiswa, String alamat_mahasiswa, String kode_agama, String kode_jurusan) {
			
				//execute insert statement
				try {
					//Create insert statement
					String insert = "INSERT into transaction.mahasiswa "
					+ "(kode_mahasiswa, nama_mahasiswa, alamat_mahasiswa, kode_agama, kode_jurusan)"
					+ "values ('"+kode_mahasiswa+"','"+nama_mahasiswa+"','"+alamat_mahasiswa+"',"
					+ "'"+kode_agama+"','"+kode_jurusan+"')";
					
					Statement statement = null;
					statement = connections().createStatement();
					statement.execute(insert);
				} catch (SQLException e) {
					e.printStackTrace();
		}
	}
		
	public static void readData(String schema, String tabel) {
		try {
		
			Statement statement =null;
			statement=connections().createStatement();
			//Create Call Statement
			String call = "SELECT * FROM "+schema+"."+tabel+"";
			ResultSet call_result = statement.executeQuery(call);			
			System.out.println("=================================================================================");
			//Output
			while(call_result.next()) {
				System.out.printf("%s, %s, %20s, %s, %s\n",
						call_result.getString("kode_mahasiswa"),
						call_result.getString("nama_mahasiswa"),
						call_result.getString("alamat_mahasiswa"),
						call_result.getString("kode_agama"),
						call_result.getString("kode_jurusan"));	
			}	
		} catch (SQLException e) {
			//e.printStackTrace();
			System.err.println(e.getClass().getName() + " : " + e.getMessage());
		}
	}

	public static void updateData(String kode, String kode_mahasiswa,String nama_mahasiswa, String alamat_mahasiswa, String kode_agama, String kode_jurusan) {
		
		//execute insert statement
		try {
			//Create insert statement
			String update = "UPDATE transaction.mahasiswa "
				+ "SET " 
					+ "kode_mahasiswa ='"+kode_mahasiswa+"', nama_mahasiswa='"+nama_mahasiswa+"', alamat_mahasiswa='"+alamat_mahasiswa+"',"
					+ "kode_agama='"+kode_agama+"', kode_jurusan='"+kode_jurusan+"'"
					+ " where kode_mahasiswa = '"+kode+"'";
			
			Statement statement = null;
			statement = connections().createStatement();
			statement.execute(update);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static void deleteData(int id) {
		
		try {
			//Create insert statement
			String delete = "Delete transaction.mahasiswa where kode_mahasiswa = '"+id+"'";
			
			Statement statement = null;
			statement = connections().createStatement();
			statement.execute(delete);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
