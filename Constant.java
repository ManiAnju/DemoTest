package com.cognizant.ecomivyautomation.constants;

import java.text.SimpleDateFormat;

public class Constant {

	private Constant() {
		
	}
	
	public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");

	public static final String IBMMQ = "wmq";
	
	public static final String ACTIVEMQ = "activemq";
	
	public static final String SITE_ID = "0113";
	public static final String OWNER_ID = "PAH";
	public static final String CLIENT_ID = "PAH";
	public static final String MY_DEFAULT_PROFILE = "myDefaultProfile";	
	
	public static final String SUCCESS = "Success";
	public static final String TRANSMITED = "Transmited";
	public static final String FAILED = "Failed";
	public static final String ERROR = "Error";
	public static final String PROCESSED = "Processed";
	public static final String CNTIND_TYPE = "CNTIND";
	
	public static final String RELREQ_TYPE = "RELREQ";
	public static final String SHPCNF_TYPE = "SHPCNF";
	public static final String ORDREJ_TYPE = "ORDREJ";
	public static final String AORESP_TYPE = "AORESP";
	
	public static final String SHIPPED = "Shipped";
	public static final String AUTOPICKA = "AUTOPICKA";
	public static final String INVENTORY_NOT_FOUND = "Inventory not found";
	
	public static final String INPROGRESS_STATUS = "InProgress";
	public static final String PENDING_STATUS = "Pending";
	public static final String PICKED_STATUS = "Picked";
	public static final String COMPLETE_STATUS = "Complete";
	public static final String READY_TO_LOAD_STATUS = "Ready to Load";
	public static final String NULL_COLUMN_DATE = "01011900000000";
	
}
