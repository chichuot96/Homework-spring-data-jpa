package vn.topica.itlab4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vn.topica.itlab4.service.CategoryService;
import vn.topica.itlab4.service.ItemService;
import vn.topica.itlab4.service.TypeService;
import vn.topica.itlab4.entity.*;

@SpringBootApplication
public class ExampleSpringDataJpaApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringDataJpaApplication.class, args);
	}
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private TypeService typeService;
	@Override
	public void run(String... strings) {
		List<Type> types = new ArrayList<>();
		List<Category> cates = new ArrayList<>();
		List<Item> items = new ArrayList<>();
		
		types.add(new Type(1,"type1"));
		types.add(new Type(2,"type2"));
		types.add(new Type(3,"type3"));
		cates.add(new Category(1,"cate 11",1));
		cates.add(new Category(2,"cate 12",1));
		cates.add(new Category(3,"cate 13",1));
		cates.add(new Category(4,"cate 21",2));
		cates.add(new Category(5,"cate 3",3));
		items.add(new Item(1,"item 1",1));
		items.add(new Item(2,"item 2",1));
		items.add(new Item(3,"item 3",2));
		items.add(new Item(4,"item 4",3));
		items.add(new Item(5,"item 5",3));
		items.add(new Item(6,"item 6",4));
		items.add(new Item(7,"item 7",1));
		items.add(new Item(8,"item 8",5));
		items.add(new Item(9,"item 9",2));
		
		//Find category
		String type= "type1";
		int pageIndex=1;
		int pageSize=5;
		List<Category> cateList=categoryService.findByType(type, pageIndex, pageSize);
		cateList.stream().forEach(c->{
			System.out.println(c.toString());
		});
		
		// Find item
		String category = "cate 11";

		List<Item> itemList=itemService.findByCategory(category, pageIndex, pageSize);
		itemList.stream().forEach(i->{
			System.out.println(i.toString());
		});
		
	  }
}
