/**
 * 
 */
package group.yf.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group.yf.dao.ScoreSegmentMapper;
import group.yf.service.ScoreSegmentService;

/**
 * @author Yang Fei
 *
 */
@Service
public class ScoreSegmentServiceImpl implements ScoreSegmentService{
	
	Logger log=Logger.getLogger(this.getClass());
	@Autowired
	private ScoreSegmentMapper scoreSegmentMapper;
	
	@Override
	public Integer selectRanking(String province, int score,int science,int year) {
		Integer i=scoreSegmentMapper.selectRanking(province, score, science,year);
		return i;
	}

}
