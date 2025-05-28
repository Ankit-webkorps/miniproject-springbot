package in.ashokit.service;
import java .util.*;
import in.ashokit.binding.DashboardResponse;
import in.ashokit.binding.EnquiryForm;
import in.ashokit.binding.EnquirySearchCriteria;

public interface EnquiryService {

	
	public List<String> getCourseName();
	public List<String> getEnqStatus();
	public DashboardResponse getDashboardData(Integer userId);
	public String upsertEnquiry(EnquiryForm form);
    public List<EnquiryForm> getEnquries(Integer userId,EnquirySearchCriteria criteria);
 	public EnquiryForm getEnquiry(Integer enqId);
} 
