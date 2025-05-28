package in.ashokit.binding;

public class DashboardResponse {

	private Integer totalEnquriesCnt;
	private Integer enrollCnt;
    private Integer lostCnt;
	public Integer getTotalEnquriesCnt() {
		return totalEnquriesCnt;
	}
	public void setTotalEnquriesCnt(Integer totalEnquriesCnt) {
		this.totalEnquriesCnt = totalEnquriesCnt;
	}
	public Integer getEnrollCnt() {
		return enrollCnt;
	}
	public void setEnrollCnt(Integer enrollCnt) {
		this.enrollCnt = enrollCnt;
	}
	public Integer getLostCnt() {
		return lostCnt;
	}
	public void setLostCnt(Integer lostCnt) {
		this.lostCnt = lostCnt;
	}
  
}
