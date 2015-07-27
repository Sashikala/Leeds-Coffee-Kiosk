import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import net.proteanit.sql.DummySimplest;
import org.junit.*;
import org.*;
import static org.junit.Assert.*;
//import org.sqlite.SQLiteConnection;
//import org.sqlite.jdbc4.JDBC4PreparedStatement;
//import org.sqlite.JDBC


public class AdminTest {
	
	Connection conn=null;
	PreparedStatement pst=null;
	ResultSet rs=null;

	@Test
	public void testAdmin_1()
		throws Exception {

		Admin result = new Admin();

		
		assertNotNull(result);
	}

	
	@Test
	public void testAdminScreen_1()
		throws Exception {
		conn=javaconnect.ConnecrDB();
		Admin fixture = new Admin();
		fixture.totOrders = 1;
		//fixture.rs = new DummySimplest();
		//fixture.pst = new JDBC4PreparedStatement(new SQLiteConnection("", ""), "");
		//fixture.conn = new SQLiteConnection("", "");
		fixture.totEmp = 1;
		fixture.totSales = 1;
		fixture.salEmp = 1;
		fixture.mnthPayout = 1;

		fixture.AdminScreen();

		
	}

	
	@Before
	public void setUp()
		throws Exception {
		
	}

	
	@After
	public void tearDown()
		throws Exception {
		
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AdminTest.class);
	}
}