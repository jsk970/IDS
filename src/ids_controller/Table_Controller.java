package ids_controller;

import java.io.File;
import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



import ids_bean.Table;
import ids_service.Table_services;
import ids_service.impl.Table_servicesimpl;
@Controller
public class Table_Controller{
	
	@RequestMapping("/to_add_table")
	public String to_add_table() {
		
		System.out.println("-----------to  add_table.jsp-------------");
		return "add_table";
	}
	@RequestMapping("/to_update_table")
	public String to_update_table() {
		
		System.out.println("-----------to  add_table.jsp---------------");
		return "update_table";
	}
	
	@RequestMapping("/add_table")
	protected String add_table(@RequestParam("table_id") String table_id,
			@RequestParam("table_name") String table_name,
			@RequestParam("table_state") String table_state,
			@RequestParam("table_type") String table_type,
			@RequestParam("table_witter") String table_witter,
			@RequestParam("table_photo") MultipartFile file,
			HttpServletRequest request,Model model) throws ServletException, IOException {
		
	//	System.out.println("---------add_table  action！----------");
		String serverPath = request.getServletContext().getRealPath("/image/table_images/");
	//	System.out.println("----serverPath:"+serverPath);
//		File server = new File(serverPath);
//		if(!server.exists())
//			server.mkdirs();	
		String temp = file.getOriginalFilename();
		String ext_name = temp.substring(temp.length()-3); 
		String path = serverPath+table_name+"."+ext_name ;
		
	//	System.out.println("upload--path:"+path);
//		if (!table_image_path.exists()) {// 判断目录是否存在
//			table_image_path.mkdirs();//创建文件夹
//			System.out.println("---------Create directory success!-------");
//		}
		if(!file.isEmpty()) {
			//上传文件
			file.transferTo(new File(path));
		}
		
		Table_services ts = new Table_servicesimpl();
		
		List<Table> tablelist = ts.find_all_table();
		int result = 0;
		for(Table table:tablelist)
		{
			if(table.getTable_id().equals(table_id)) {
				result = 1;
			}
		}
		if(result==0) {
			
			Table t = new Table();
			t.setTable_id(table_id);
			t.setTable_name(table_name);
			t.setTable_state(table_state);
			t.setTable_type(table_type);
			t.setTable_witter(table_witter);
			t.setTable_eat_number(0);
			t.setTable_dish_done(0);
			t.setTable_dish_nodone(0);
			String photo = "image/table_images/"+table_name+"."+ext_name;
			t.setTable_photo(photo);
			ts.add_table(t);
			List<Table> list = ts.find_all_table();
			
			System.out.println("tablelist"+list);
			model.addAttribute("table_list", list);
			System.out.println("-----add_table："+table_name+"success!！----------");
			return "table_main";
		}else {
			System.out.println("-----------This table number has already existed!---------- ");
			return "add_table";
		}
		
	}

	@RequestMapping("/findAll_table")
	protected String findAll_table(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Table_services ts = new Table_servicesimpl();
		List<Table> list = ts.find_all_table();
		request.setAttribute("table_list", list);
		//request.getRequestDispatcher("table_main.jsp").forward(request, response);
		return "table_main";
	}
	@RequestMapping("/delete_table")
	protected String delete_table(@RequestParam("id_number") int id_number,Model model) throws ServletException, IOException {
		System.out.println("---------action delete !--------");
		
		System.out.println("id_number_"+id_number);
		Table_services ts = new Table_servicesimpl();
		ts.delete_table(id_number);
		//System.out.println("--------delete success!----------");
		List<Table> list = ts.find_all_table();
		model.addAttribute("table_list", list);
		return "table_main";
	}
	@RequestMapping("/table_details")
	protected String table_details(@RequestParam("id_number") int id_number,Model model) throws ServletException, IOException {
		System.out.println("---------table_details--------");
		Table_services ts = new Table_servicesimpl();
		Table table = null;
		System.out.println("id_number_"+id_number);
		table = ts.findtable_byid(id_number);
		System.out.println(table);
		model.addAttribute("table_details",table);
		return "table_details";
	}
	
	@RequestMapping("/update_table")
	protected String update_table(
			@RequestParam("id_number") int id_number,
			@RequestParam("table_id") String table_id,
			@RequestParam("table_name") String table_name,
			@RequestParam("table_state") String table_state,
			@RequestParam("table_type") String table_type,
			@RequestParam("table_witter") String table_witter,
			@RequestParam("table_photo") MultipartFile file,
			HttpServletRequest request,
			Model model
			) throws ServletException, IOException {
		
		System.out.println("---------update_table--------");
		Table_services ts = new Table_servicesimpl();
		
		String serverPath = request.getServletContext().getRealPath("/image/table_images/");
		//	System.out.println("----serverPath:"+serverPath);

			String temp = file.getOriginalFilename();
			String ext_name = temp.substring(temp.length()-3); 
			String path = serverPath+table_name+"."+ext_name ;
					
			if(!file.isEmpty()) {
				//上传文件
				file.transferTo(new File(path));
			}
			Table t = new Table();
			
			t.setTable_id(table_id);
			t.setTable_name(table_name);
			t.setTable_state(table_state);
			t.setTable_type(table_type);
			t.setTable_witter(table_witter);
			String photo = "image/table_images/"+table_name+"."+ext_name;
			t.setTable_photo(photo);
	
			ts.update_table(id_number, t);
			
			System.out.println("--------uptate success!----------");
//		
//			
			Table table = ts.findtable_byid(id_number);
			model.addAttribute("table_details",table);
			return "table_details";

	}
	
	
	
}
	
	



