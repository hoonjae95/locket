/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2020-12-13 08:34:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import member.model.vo.Member;

public final class board_005fdetail_0028manager_0029_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/resources/globalVariable.jsp", Long.valueOf(1604494328000L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1604579456000L));
    _jspx_dependants.put("/WEB-INF/views/common/nav.jsp", Long.valueOf(1604579456000L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1604579456000L));
    _jspx_dependants.put("/WEB-INF/views/common/tom.jsp", Long.valueOf(1604579456000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.io.File");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>로컬마켓</title>\r\n");
      out.write('\r');
      out.write('\n');

	String context = request.getContextPath();

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar context = \"");
      out.print( context );
      out.write("\";\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.print( context );
      out.write("/resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<link rel = \"icon\" href = \"");
      out.print( context );
      out.write("/favicon.ico\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/base.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/content-area.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/content.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/board.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Member loginMember = (Member)session.getAttribute("loginMember");
	String pImageName = null;
	if(loginMember != null && loginMember.getpImage() != null) {
		File f = new File(loginMember.getpImage());
		pImageName = f.getName();
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id='header'>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( context );
      out.write("/\"> \r\n");
      out.write("\t\t\t\t<img id='logo-img' alt=\"로컬마켓\" src=\"");
      out.print( context );
      out.write("/resources/images/rocket.png\"></a>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print( context );
      out.write("/\"><span id=\"logo-text\">로켓</span></a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t <form action=\"allSearch.all\" method=\"get\" class=\"AllSearchForm\">\r\n");
      out.write("       \t \t<div id=\"header-search\">\r\n");
      out.write("            <input type=\"text\" name=\"word\" placeholder=\"검색어를 입력하세요!\"> \r\n");
      out.write("            <button class=\"glyphicon glyphicon-search\" id=\"AllSearchBtn\"></button>\r\n");
      out.write("         \t</div>\r\n");
      out.write("         </form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t");
 if(loginMember == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"account\">\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print( context );
      out.write("/login.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"id-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"idInput\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" id=\"login\" value=\"로그인\">로그인</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"pw-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"pwInput\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" id=\"signup\" value=\"회원가입\" onclick=\"location.href='");
      out.print( context );
      out.write("/joinForm.do'\">회원가입</button><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" id=\"find\" value=\"ID/PW찾기\" onclick=\"findIDPW();\" style=\"float: right; width: 80px; font-weight:bold; border:none;\">\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"account_info\">\r\n");
      out.write("\t\t\t\t<div id=\"profileArea\">\r\n");
      out.write("\t\t\t\t");
 if(loginMember.getpImage() == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<label id=\"memberIcon\" class=\"glyphicon glyphicon-user\" style=\"top:15px; right: 30px;\"></label>\r\n");
      out.write("\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<img id=\"memberImg\" src=\"");
      out.print( context );
      out.write("/userProfile_uploadFiles/");
      out.print( pImageName );
      out.write("\">\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"membername\">");
      out.print( loginMember.getNickName() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"memberbtn\">\r\n");
      out.write("                  <button id='logoutBtn' onclick=\"location.href='");
      out.print( context );
      out.write("/logout.do'\">로그아웃</button>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <button id=\"myPageBtn\" onclick=\"location.href='");
      out.print( context );
      out.write("/myPage.do'\">마이페이지</button>\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <button id=\"messageBtn\" onclick=\"location.href='");
      out.print( context );
      out.write("/message.do'\">쪽지함</button>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div id=\"alarm\">\r\n");
      out.write("                  <button class=\"glyphicon glyphicon-bell\" onclick=\"location.href='");
      out.print( context );
      out.write("/receiveP.do'\"></button>\r\n");
      out.write("               </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t");
 if(loginMember != null) { 
      out.write("\r\n");
      out.write("\t\t\tvar openProfile = function(closeCallback) {\r\n");
      out.write("\t\t\t    var win = window.open('setProfileImgForm.do', 'setProfileImgForm', 'width=500, height=450');\r\n");
      out.write("\t\t\t    var interval = window.setInterval(function() {\r\n");
      out.write("\t\t\t        try {\r\n");
      out.write("\t\t\t            if (win == null || win.closed) {\r\n");
      out.write("\t\t\t                window.clearInterval(interval);\r\n");
      out.write("\t\t\t                closeCallback(win);\r\n");
      out.write("\t\t\t            }\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t        catch (e) {\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    }, 1000);\r\n");
      out.write("\t\t\t    return win;\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"profileArea\").onclick = function() {\r\n");
      out.write("\t\t\t\topenProfile(function(win) {\r\n");
      out.write("\t\t\t\t\tlocation.reload(true);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t");
 } else { 
      out.write("\r\n");
      out.write("      \tfunction findIDPW() {\r\n");
      out.write("      \t\twindow.open('findIDPWForm.do', 'findIDPWForm', 'width=500, height=135');\r\n");
      out.write("\t\t}\r\n");
      out.write("      \r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t<div id=\"content-area\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>nav</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/nav.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div id=\"nav\">\r\n");
      out.write("   \r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("            <!-- ------------------------------------------------------------------------------------- -->\r\n");
      out.write("            <div id=\"menu-area\">\r\n");
      out.write("               <ul class=\"out-menu\">\r\n");
      out.write("                  <label class=\"glyphicon glyphicon-camera\"><div>중고물품</div></label>\r\n");
      out.write("                  <li><button onclick=\"location.href='");
      out.print( context );
      out.write("/list.pro'\">중고 물품보기</button></li>\r\n");
      out.write("                  ");
 if(loginMember != null) { 
      out.write("\r\n");
      out.write("                     <li><button onclick=\"location.href='");
      out.print( context );
      out.write("/registerForm.pro'\">중고 물품등록</button></li>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("               </ul>\r\n");
      out.write("               <ul class=\"out-menu\">\r\n");
      out.write("                  <label class=\"glyphicon glyphicon-tag\"><div>공동구매</div></label>\r\n");
      out.write("                  <li><button onclick=\"location.href='");
      out.print( context );
      out.write("/groupList.do'\">공동구매 목록조회</button></li>\r\n");
      out.write("                  ");
 if(loginMember != null && loginMember.getRankCode() == 99) { 
      out.write("\r\n");
      out.write("                  <li><button onclick=\"location.href='");
      out.print( context );
      out.write("/groupWriteForm.do'\">공동구매 물품등록</button></li> \r\n");
      out.write("\r\n");
      out.write("                  ");
 } 
      out.write("\r\n");
      out.write("               </ul>\r\n");
      out.write("               <ul class=\"out-menu menuBtn\" onclick=\"location.href='");
      out.print( context );
      out.write("/boardList.do'\">\r\n");
      out.write("                  <label class=\"glyphicon glyphicon-list\" class=\"menuBtn\"><div class=\"menuBtn\">자유게시판</div></label>\r\n");
      out.write("               </ul>\r\n");
      out.write("               ");
 if(loginMember != null && loginMember.getRankCode() == 99) { 
      out.write("\r\n");
      out.write("               <ul class=\"out-menu\">\r\n");
      out.write("                  <label class=\"glyphicon glyphicon-lock\"><div>관리자</div></label>\r\n");
      out.write("                  <li><button onclick=\"location.href='");
      out.print( context );
      out.write("/managerInfo.do'\">회원 정보 관리</li>\r\n");
      out.write("                  <li><button onclick=\"location.href='");
      out.print( context );
      out.write("/managerreport.do'\">신고 목록 관리</li>\r\n");
      out.write("               </ul>\r\n");
      out.write("               ");
 } 
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <!-- ------------------------------------------------------------------------------------- -->\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Top of this Month</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/tom.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"tom\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<b>이달의 로켓왕!</b>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table id=\"tom-table\">\r\n");
      out.write("\t\t\t<tr id=\"table-head\">\r\n");
      out.write("\t\t\t\t<th>No.</th>\r\n");
      out.write("\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t<th>거래 수</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div id=\"loading\">\r\n");
      out.write("\t\t\t<img src=\"");
      out.print( context );
      out.write("/resources/images/loading.gif\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: 'topOfMonth.do',\r\n");
      out.write("\t\ttype: 'post',\r\n");
      out.write("\t\tdata: {first: 1, last: 3},\r\n");
      out.write("\t\tsuccess: function(data) {\t\r\n");
      out.write("\t\t\tvar table = document.getElementById(\"tom-table\");\r\n");
      out.write("\t\t\tfor(var i in data) {\r\n");
      out.write("\t\t\t\tvar tr = document.createElement(\"tr\");\r\n");
      out.write("\t\t\t\tvar td1 = document.createElement(\"td\");\r\n");
      out.write("\t\t\t\ttd1.innerHTML = data[i].rank;\r\n");
      out.write("\t\t\t\tvar td2 = document.createElement(\"td\");\r\n");
      out.write("\t\t\t\ttd2.innerHTML = data[i].nickname;\r\n");
      out.write("\t\t\t\tvar td3 = document.createElement(\"td\");\r\n");
      out.write("\t\t\t\ttd3.innerHTML = data[i].count;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\ttr.appendChild(td1);\r\n");
      out.write("\t\t\t\ttr.appendChild(td2);\r\n");
      out.write("\t\t\t\ttr.appendChild(td3);\r\n");
      out.write("\t\t\t\ttable.appendChild(tr);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('#tom-table').show();\r\n");
      out.write("\t\t\t$('#loading').hide();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("            <!-- ------------------------------------------------------------------------------------- -->\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <script>\r\n");
      out.write("            $('.out-menu').click(function(){\r\n");
      out.write("               $(this).children().next().slideToggle();\r\n");
      out.write("            });\r\n");
      out.write("         </script>\r\n");
      out.write("         \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"b_detail\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<font style=\"font-weight: bold; font-size: 15px; color: rgb(0, 211, 0); padding-left: 10px;\">자유 게시판 >></font>\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t<font style=\"font-size: 30px; padding-left:10px;\">멋쟁이 토마토 요즘 파나요?</font><br>\r\n");
      out.write("\t\t\t\t\t<img src=\"../images/user.png\" style=\"padding-left: 10px; witdh: 45px; height: 45px\">\r\n");
      out.write("\t\t\t\t\t<font style=\"font-weight: bold; font-size: 17px;\">브롤 꿈나무</font>\r\n");
      out.write("\t\t\t\t\t<font style=\"font-size: 15px; padding-left: 5px; color: gray;\">비행기 회원</font>\r\n");
      out.write("\t\t\t\t\t<button id=\"note\">쪽지보내기</button>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t<hr style=\"margin-left:15px; margin-right:10px;\"><br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"b_contents\">안녕하세요 여기는 내용입니다</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"b_comments\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<br><hr><br>\r\n");
      out.write("\t\t\t\t\t<h3>댓글</h3>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div id=\"b_read_comments\"> <!-- 여기에 댓글 입력될떄마다 추가 되야함 -->\r\n");
      out.write("\t\t\t\t\t\t<img src=\"../images/user.png\" style=\"padding-left: 10px; witdh: 45px; height: 45px\">\r\n");
      out.write("\t\t\t\t\t\t<font>다른유저1</font>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<font style=\"padding-left: 60px;\">댓글 내용입니다 댓글내용입니다. 댓글댓글</font>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<font style=\"color: gray; font-size: 10px; padding-right: 20px; padding-left: 60px;\">2019.09.09 16:08</font>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" id=\"report\">댓글 제지</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- 여긴 댓글 쓰는 공간 -->\r\n");
      out.write("\t\t\t\t\t<div id=\"b_write_comment\" style=\"width: 850px; height: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<font style=\"font-weight: bold; font-size: 17px; color: red;\">관리자</font>\r\n");
      out.write("\t\t\t\t\t\t<textarea style=\"width: 850px; height: 110px; resize: none; margin-left: 5px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"button1\" style=\"background: gray;\">글 목록</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<button id=\"button1\" style=\"background: rgb(223,72,0);\">글 제지</button>\r\n");
      out.write("\t\t\t\t\t\t<button id=\"button1\" style=\"margin-left: 620px;\">등록</button>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>footer</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( context );
      out.write("/resources/css/footer.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t(주) 로켓 대표 KIM LOCKET | 서울 강남구 테헤란로14길 6 남도빌딩 2층 <br>\r\n");
      out.write("   E-mail locket_manaer@locket.co.kr | Tel 02-6952-0337 \r\n");
      out.write("   \r\n");
      out.write("   </footer>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}