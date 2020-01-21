package co.exam.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.exam.dto.ExamDto;

public class ExamDao extends DAO{
	public List<ExamDto> selectList() {
		List<ExamDto> list = new ArrayList<ExamDto>();
		try {
			String sql = "select * from exam order by exam_no desc";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(sql);
			
			while (rs.next()) {
				ExamDto dto = new ExamDto();
				dto.setExam_no(rs.getInt("exam_no"));
				dto.setExam_nm(rs.getString("exam_nm"));
				dto.setQuest_cnt(rs.getInt("quest_cnt"));
				dto.setExam_time(rs.getInt("exam_time"));
				dto.setQuest_group(rs.getString("guest_group"));
				dto.setExam_desc(rs.getString("exam_desc"));
				dto.setExam_type(rs.getString("exam_type"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return list;
	}
	
}
