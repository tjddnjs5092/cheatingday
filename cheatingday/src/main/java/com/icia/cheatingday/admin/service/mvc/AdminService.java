package com.icia.cheatingday.admin.service.mvc;

import java.time.format.*;
import java.util.*;

import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.icia.cheatingday.admin.dao.*;
import com.icia.cheatingday.admin.dto.*;
import com.icia.cheatingday.common.dto.*;
import com.icia.cheatingday.user.dao.*;
import com.icia.cheatingday.user.entity.*;
import com.icia.cheatingday.util.*;

@Service
public class AdminService {
/*	@Autowired
	private reviewDao rdao;
	@Autowired
	private UserDao udao;
	@Autowired
	private storeDao sdao;	
	@Autowired
	private AdminDao adao;
	@Autowired
	private ModelMapper mapper;
	
	public Page list (int pageno, int rReport) {
		int countOfBoard = rdao.count(rReport);
		Page page = PagingUtil.getPage(pageno, countOfBoard);
		int srn = page.getStartRowNum();
		int ern = page.getEndRowNum();
		 
		List<Review> reviewlist = null;
		if(rReport>=1)
			reviewlist = rdao.findAllByReport(srn, ern);
		
		List<AdminDto.DtoForList> dtolist = new ArrayList<>();
		for(Review review:reviewlist) {
			AdminDto.DtoForList dto = mapper.map(review, AdminDto.DtoForList.class);
			dto.setRWriteTimeStr(review.getrWriteTime().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
			dto.setUIrum(udao.findById(dto.getUUsername()).getUIrum());
			dto.setSName(sdao.findById(dto.getSNum()).getSName());
			dtolist.add(dto);
		}
		page.setAlist(dtolist);
		return page;
	}

	public List<AdminDto.DtoForUlist> ulist(){
		List<AdminDto.DtoForUlist> dtolist = new ArrayList<>();
		List<User> list = udao.findAll();
		for(User user:list) {
			dtolist.add(mapper.map(user, AdminDto.DtoForUlist.class));
		}
		return dtolist;
	}
	public List<User> blockList(){
		return adao.findAllBlock();
	}
	*/
}
