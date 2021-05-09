package sample.spring.prg;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;//마이바티스 스프링 연동모듈 핵심
	
 	public int insert(Map<String, Object> map) {
	    return this.sqlSessionTemplate.insert("book.insert", map);
	}
 	public Map<String, Object> selectDetail(Map<String, Object> map) {
 	    return this.sqlSessionTemplate.selectOne("book.select_detail", map);
 	}
 	public int update(Map<String, Object> map) {
 		return this.sqlSessionTemplate.update("book.update",map);//쿼리id, 쿼리 파라미터
 	}
	public int delete(Map<String, Object> map) {
		return this.sqlSessionTemplate.delete("book.delete",map);
	}
	public List<Map<String, Object>> selectList(Map<String, Object> map) {  
		return this.sqlSessionTemplate.selectList("book.select_list", map); //쿼리 결과를 목록으로 받기 위해서  
	}  


}

