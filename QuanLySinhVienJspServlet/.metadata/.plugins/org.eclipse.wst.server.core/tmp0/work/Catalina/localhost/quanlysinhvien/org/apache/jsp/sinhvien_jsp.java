/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2022-11-07 13:29:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sinhvien_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Lớp</title>\r\n");
      out.write("<link href=\"./style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./table.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"./form.css\" rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"Navbar-Container\">\r\n");
      out.write("\t\t<div class=\"d-flex gap-3\">\r\n");
      out.write("\t\t\t<a href=\"menu?action=home\" class=\"link\"> Home </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=khoa\" class=\"link\"> Khoa </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=monHoc\" class=\"link\"> Môn Học </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=giangVien\" class=\"link\"> Giảng Viên </a> <a\r\n");
      out.write("\t\t\t\thref=\"menu?action=timKiemSinhVien\" class=\"link\"> Tìm Kiếm Sinh\r\n");
      out.write("\t\t\t\tViên </a> <a href=\"menu?action=taiKhoan\" class=\"link\"> Tài Khoản </a> <a\r\n");
      out.write("\t\t\t\thref=\"thoat\" class=\"link\"> Thoát </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"khoa\" class=\"link\"> &#8592 Khoa ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ applicationScope.Ten_Khoa }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"chuyennganh\" class=\"link\"> &#8592 Chuyên Ngành ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ applicationScope.Ten_CN }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h1 class=\"heading text-center\">Lớp: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.lopK.tenLop }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("\t<h2 class=\"heading text-center \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.nullSV }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"chuyennganh-button\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<button>\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<a href=\"menu?action=xoaLop&ID_Lop=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.lopK.maLop}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\tXóa Lớp </a>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /sinhvien.jsp(46,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.checkAddSinhVien == null }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<button>\r\n");
        out.write("\t\t\t\t<h2>\r\n");
        out.write("\t\t\t\t\t<a\r\n");
        out.write("\t\t\t\t\t\thref=\"menu?action=themSinhVien&ID_Lop=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.lopK.maLop }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t\t\tThêm Sinh Viên </a>\r\n");
        out.write("\t\t\t\t</h2>\r\n");
        out.write("\t\t\t</button>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /sinhvien.jsp(62,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.checkAddSinhVien == false }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t<div class=\"container\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t<form action=\"themsinhviencheck\" class=\"form-container\">\r\n");
        out.write("\t\t\t\t<label>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.errorSV  }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</label>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"inputmasinhvien\">Mã Sinh Viên</label> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"inputmasinhvien\"\r\n");
        out.write("\t\t\t\t\t\taria-describedby=\"emailHelp\" placeholder=\"Nhập mã sinh viên\"\r\n");
        out.write("\t\t\t\t\t\tname=\"ID_SV\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputtensinhvien\">Tên Sinh Viên</label> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"Inputtensinhvien\"\r\n");
        out.write("\t\t\t\t\t\tplaceholder=\"Nhập tên sinh viên\" name=\"Ten_SV\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"sinhvien-date\">\r\n");
        out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t<label for=\"Inputngaysinh\">Ngày Sinh</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"Inputngaysinh\" placeholder=\"Nhập ngày\"\r\n");
        out.write("\t\t\t\t\t\t\tname=\"NgaySinh_SV\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t<label for=\"Inputtensinhvien\">Tháng</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"Inputtensinhvien\"\r\n");
        out.write("\t\t\t\t\t\t\tplaceholder=\"Nhập tháng\" name=\"ThangSinh_SV\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t<label for=\"Inputnam\">Năm</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"Inputnam\" placeholder=\"Nhập năm\"\r\n");
        out.write("\t\t\t\t\t\t\tname=\"NamSinh_SV\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<select class=\"form-select\" aria-label=\"Default select example\"\r\n");
        out.write("\t\t\t\t\tname=\"GioiTinh_SV\">\r\n");
        out.write("\t\t\t\t\t<option value=\"Nam\">Nam</option>\r\n");
        out.write("\t\t\t\t\t<option value=\"Nữ\">Nữ</option>\r\n");
        out.write("\t\t\t\t</select>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputquequan\">Quê quán</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputquequan\" placeholder=\"Nhập quê quán\"\r\n");
        out.write("\t\t\t\t\t\tname=\"QueQuan_SV\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputsdt\">Số điện thoại</label> <input type=\"tel\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputsdt\"\r\n");
        out.write("\t\t\t\t\t\tplaceholder=\"Nhập số điện thoại\" name=\"SDT_SV\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputemail\">Email</label> <input type=\"email\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputemail\" placeholder=\"Nhập email\"\r\n");
        out.write("\t\t\t\t\t\tname=\"Email_SV\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputmalop\">Mã lớp</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputmalop\" placeholder=\"Nhập mã lớp\"\r\n");
        out.write("\t\t\t\t\t\tname=\"MaLop\" value=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.ID_Lop_para  }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write(" readonly>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" value=\"Thêm\">Thêm</button>\r\n");
        out.write("\t\t\t</form>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /sinhvien.jsp(147,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.checkUpdateSinhVien == false }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<p class=\"chuyennganh-update\">Cập Nhật</p>\r\n");
        out.write("\t\t");
        out.write("\r\n");
        out.write("\t\t<div class=\"container\">\r\n");
        out.write("\r\n");
        out.write("\t\t\t<form action=\"capnhatsinhvien\" method=\"post\">\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"inputmasinhvien\">Mã Sinh Viên</label> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"inputmasinhvien\"\r\n");
        out.write("\t\t\t\t\t\taria-describedby=\"emailHelp\" placeholder=\"Nhập mã sinh viên\"\r\n");
        out.write("\t\t\t\t\t\tname=\"maSV\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.SV.maSinhVien}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\" readonly>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputtensinhvien\">Tên Sinh Viên</label> <input\r\n");
        out.write("\t\t\t\t\t\ttype=\"text\" class=\"form-control\" id=\"Inputtensinhvien\"\r\n");
        out.write("\t\t\t\t\t\tplaceholder=\"Nhập tên sinh viên\" name=\"tenSV\"\r\n");
        out.write("\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.SV.tenSinhVien}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"sinhvien-date\">\r\n");
        out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t\t<label for=\"Inputngaysinh\">Ngày Sinh</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"Inputngaysinh\" placeholder=\"Nhập ngày\"\r\n");
        out.write("\t\t\t\t\t\t\tname=\"NS\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.SV.ngaySinh }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputgioitinh\">Giới Tính</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputgioitinh\"\r\n");
        out.write("\t\t\t\t\t\tplaceholder=\"Nhập giới tính\" name=\"GT\"\r\n");
        out.write("\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.SV.gioiTinh }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputquequan\">Quê quán</label> <input type=\"text\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputquequan\" placeholder=\"Nhập quê quán\"\r\n");
        out.write("\t\t\t\t\t\tname=\"QQ\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.SV.queQuan }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputsdt\">Số điện thoại</label> <input type=\"tel\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputsdt\"\r\n");
        out.write("\t\t\t\t\t\tplaceholder=\"Nhập số điện thoại\" name=\"SDT\"\r\n");
        out.write("\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.SV.sdt }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"form-group\">\r\n");
        out.write("\t\t\t\t\t<label for=\"Inputemail\">Email</label> <input type=\"email\"\r\n");
        out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"Inputemail\" placeholder=\"Nhập email\"\r\n");
        out.write("\t\t\t\t\t\tname=\"E\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.SV.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" value=\"Chỉnh sửa\">Thêm</button>\r\n");
        out.write("\t\t\t</form>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /sinhvien.jsp(243,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ requestScope.list != null }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div class=\"container-fluid\">\r\n");
        out.write("\t\t\t<div class=\"d-flex table-containers\">\r\n");
        out.write("\t\t\t\t<table class=\"table-container\">\r\n");
        out.write("\t\t\t\t\t<thead class=\"bg-info\">\r\n");
        out.write("\t\t\t\t\t\t<tr class=\"tr-heading\">\r\n");
        out.write("\t\t\t\t\t\t\t<th>Tên Lớp</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Mã Sinh Viên</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Họ Tên</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Ngày Sinh</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Giới Tính</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Quê Quán</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Số điện thoại</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Email</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Bảng Điểm</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Cập Nhật</th>\r\n");
        out.write("\t\t\t\t\t\t\t<th>Xóa</th>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t</thead>\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</table>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /sinhvien.jsp(263,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("ds");
    // /sinhvien.jsp(263,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/sinhvien.jsp(263,5) '${ requestScope.list }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${ requestScope.list }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<tr class=\"tr-heading\">\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.lop.tenLop }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.maSinhVien }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.tenSinhVien }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.ngaySinh }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.gioiTinh }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.queQuan }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.sdt }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t<th><a href=\"menu?action=bangDiem&ID_SV=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.maSinhVien }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\tclass=\"watch\"> Xem </a></th>\r\n");
          out.write("\t\t\t\t\t\t\t<th><a href=\"menu?action=capNhatSV&ID_SV=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.maSinhVien }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\tclass=\"fix\"> Sửa </a></th>\r\n");
          out.write("\t\t\t\t\t\t\t<th><a\r\n");
          out.write("\t\t\t\t\t\t\t\thref=\"menu?action=xoaSinhVien&ID_SV=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ds.maSinhVien }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\tclass=\"delete\"> Xóa </a></th>\r\n");
          out.write("\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}