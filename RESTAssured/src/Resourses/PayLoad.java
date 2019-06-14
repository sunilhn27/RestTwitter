package Resourses;

public class PayLoad {

	public static String getToken() {
		String s = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTM4NCJ9.eyJ1bmlxdWVfbmFtZSI6Ik1pa2VOZWxzb242NDU5Iiwic2FtYWNjb3VudG5hbWUiOiJNaWtlTmVsc29uNjQ1OSIsImZpcnN0bmFtZSI6Ik1pa2UiLCJsYXN0bmFtZSI6Ik5lbHNvbiIsImVtYWlsIjoibWlrZW5lbHNvbi53b25kZXJicmV3QGdtYWlsLmNvbSIsInJvbGUiOiJDU1MgU3RhbmRhcmQiLCJzdWIiOiJNaWtlTmVsc29uNjQ1OSIsInRlY2hzdXBwb3J0aWQiOiI0MDIxODIzMSIsImlzcyI6Imh0dHA6Ly9qd3RhdXRoc3J2Lmdjc2Rldi5jb20iLCJhdWQiOiJjMDNjN2FmYzYwOWI0ZjM5OWFjOTliNDQ5MTUwNDBmNyIsImV4cCI6MTU2MDM2MjI3OCwibmJmIjoxNTYwMzMzNDc4fQ.vcur3XB2iokFoGMPE7eSnUZW5ys9U7adZxIzSfMoxSa-qwvhtbMRQyVDDpBeHWbT";
		return s;
	}

	public static String getResourses() {
		String s = "/Berlin/GCSWebAPI/api/managecase/servicerequests?pageindex=1&pagesize=undefined&sortcolumn=CreatedOn&sortorder=desc&searchtype=All&searchsubtype=My&startdate=2017-6-12&enddate=2019-6-13";
		return s;
	}
}
