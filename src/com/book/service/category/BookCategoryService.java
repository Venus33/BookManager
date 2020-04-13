package com.book.service.category;

import java.util.List;

import com.book.pojo.BookCategory;

public interface BookCategoryService {
	List<BookCategory> getList();

	boolean delcategory(int id);

	boolean savecategory(BookCategory cg);


}
