package com.gocamp.shop.servlet.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.gocamp.shop.bean.PageBean;
import com.gocamp.shop.bean.Product;
import com.gocamp.shop.dao.impl.ProductDAOImp;
import com.gocamp.shop.service.ProductService;



/**
 * Servlet implementation class AdminProductServlet
 */
@WebServlet("/AdminProductServlet")
public class AdminProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside");
		String action = request.getParameter("action");
		System.out.println(action);
		
		switch (action) {
		
		case "jump":
//			jump(request, response);
			break;
		case "list":
			List(request, response);
			break;
		case "add":
			Add(request, response);
			break;
		case "update":
//			Update(request, response);
			break;
		case "edit":
//			Edit(request, response);
			break;
		case "del":
//			Del(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void List(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		ProductService service=new ProductService();
		
		String page = request.getParameter("pageno");

		System.out.println(page);
		
		if (page==null) {
			page="0";
		}
		
		int pageno=Integer.valueOf(page);
		
		PageBean<Product> listAll = service.getAll(pageno);
		
		java.util.List<Product> dataList = listAll.getDataList();
		
		
		System.out.println(dataList);
		
		request.setAttribute("totalPage",listAll.getTotalPage());
		
		request.setAttribute("listAll", dataList);

		RequestDispatcher rd = request.getRequestDispatcher("NiceAdmin/shopAdmin.jsp");

		rd.forward(request, response);
		
	}

	private void Add(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
//	    ProductService service=new ProductService();
//	    
//		String name = request.getParameter("name");
//		System.out.println(name);
//		String brand = request.getParameter("brand");
//		String prices = request.getParameter("price");
//		int price = Integer.valueOf(prices);
//		String stocks = request.getParameter("stock");
//		int stock = Integer.valueOf(stocks);
//		String spec = request.getParameter("spec");
//		String warring = request.getParameter("warring");
//		String categortIds = request.getParameter("cato");
//		int categortId = Integer.valueOf(categortIds);
//		System.out.println(categortId);
//		String productfeature = request.getParameter("feat");
//
//		java.util.List<Product> cattype = service.searchtype(categortId);
//
//		Product shoppingProduct = cattype.get(cattype.size() - 1);
//
//		String id = shoppingProduct.getProductId();
//
//		System.out.println(id);
//
//		AdminProductServlet a = new AdminProductServlet();
//
//		String numbers = a.getNum(id);
//
//		System.out.println(numbers);
//
//		String type = id.replaceAll("([1-9]+[0-9]*|0)(\\.[\\d]+)?", "");
//
//		System.out.println(type);
//
//		int pid = Integer.valueOf(numbers);
//
//		pid = pid + 1;
//
//		String aBuffer;
//
//		if (pid < 100) {
//
//			System.out.println(pid);
//
//			String megid = String.valueOf(pid);
//
//			aBuffer = type + "0" + megid;
//
//		} else {
//			System.out.println(pid);
//
//			String megid = String.valueOf(pid);
//
//			aBuffer = type + megid;
//
//		}
//
//		Product aProduct = new Product(aBuffer, brand, name, price, categortId, spec, stock, warring,
//				productfeature, 0);
//
//		service.inserData(aProduct);
//
//		System.out.println("成功inser");
//
//		request.setAttribute("searchtype", cattype);
//
//		RequestDispatcher rd = request.getRequestDispatcher("admin/listProduct.jsp");
//
//		rd.forward(request, response);

	}
//
//	private void Update(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		Connection connection = null;
//		InitialContext ctxt = null;
//		Object lookup = null;
//		try {
//			ctxt = new InitialContext();
//			lookup = ctxt.lookup("java:comp/env/jdbc/xe");
//			DataSource ds = (DataSource) lookup;
//			connection = ds.getConnection();
//
//		} catch (NamingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		ProductDAOImp service = new ProductDAOImp(connection);
//		String id = request.getParameter("id");
//		Product findProduct = service.findProduct(id);
//		
//		int cato = findProduct.getCategortId();
//		String name = request.getParameter("name");
//		System.out.println(name);
//		String brand = request.getParameter("brand");
//		String prices = request.getParameter("price");
//		int price = Integer.valueOf(prices);
//		String stocks = request.getParameter("stock");
//		int stock = Integer.valueOf(stocks);
//		String spec = request.getParameter("spec");
//		String warring = request.getParameter("warring");
//		String categortIds = request.getParameter("cato");
//	
//		String productfeature = request.getParameter("feat");
//		
//		Product aProduct=new Product(id, brand, name, price, cato, spec, stock, warring, productfeature, 0);
//
//		service.updateDatas(aProduct);
//		
//		findProduct=service.findProduct(id);
//		
//		ArrayList<Product> aList=new ArrayList<Product>();
//		
//		aList.add(findProduct);
//		
//		request.setAttribute("searchtype", aList);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("admin/listProduct.jsp");
//
//		rd.forward(request, response);
//		
////	
//
//	}
//
//	private void Edit(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//	}
//
//	private void Del(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		Connection connection = null;
//		InitialContext ctxt = null;
//		Object lookup = null;
//		try {
//			ctxt = new InitialContext();
//			lookup = ctxt.lookup("java:comp/env/jdbc/xe");
//			DataSource ds = (DataSource) lookup;
//			connection = ds.getConnection();
//
//		} catch (NamingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		ProductDAOImp service = new ProductDAOImp(connection);
//		String id = request.getParameter("id");
//		
//		Product findProduct = service.findProduct(id);
//		
//		service.delete(findProduct);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("admin/ProductManger.jsp");
//
//		rd.forward(request, response);
//		
//		System.out.println("成功刪除");
//	}
//
//	//取得編號內的數字
//	public static String getNum(String strInput) {
//		
//		// 匹配指定範圍內的數字
//		String regEx = "[^0-9]";
//		// Pattern是一個正則表示式經編譯後的表現模式
//		Pattern p = Pattern.compile(regEx);
//		// 一個Matcher物件是一個狀態機器，它依據Pattern物件做為匹配模式對字串展開匹配檢查。
//		Matcher m = p.matcher(strInput);
//		// 將輸入的字串中非數字部分用空格取代並存入一個字串
//		String string = m.replaceAll(" ").trim();
//		// 以空格為分割符在講數字存入一個字串陣列中
//		String[] strArr = string.split(" ");
//		StringBuffer stringBuffer = new StringBuffer();
//		// 遍歷陣列轉換資料型別輸出
//		for (String s : strArr) {
//			stringBuffer.append(s);
//			System.out.println(Integer.parseInt(s));
//		}
//		String num = stringBuffer.toString();
//		System.out.println("num is " + num);
//		return num;
//	}
//
//// 擷取非數字 
//	public String splitNotNumber(String content) {
//		Pattern pattern = Pattern.compile("\\D ");
//		Matcher matcher = pattern.matcher(content);
//		while (matcher.find()) {
//			return matcher.group(0);
//		}
//		return "";
//	}

}
