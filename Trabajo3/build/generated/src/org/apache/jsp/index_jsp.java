package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.naming.InitialContext;
import cl.model.ServicioLocal;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 ServicioLocal servicio;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_o_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_o_import_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_o_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_o_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_o_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_o_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_o_forEach_var_items.release();
    _jspx_tagPool_o_import_url_nobody.release();
    _jspx_tagPool_o_set_var_value_scope_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    InitialContext ctx = new InitialContext();
    servicio = (ServicioLocal) ctx.lookup("java:global/Trabajo3/Servicio!cl.model.ServicioLocal");
    // ruta donde esta el servicio


      out.write('\n');
      out.write('\n');
      //  o:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_o_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_o_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_o_set_0.setPageContext(_jspx_page_context);
      _jspx_th_o_set_0.setParent(null);
      _jspx_th_o_set_0.setVar("servicio");
      _jspx_th_o_set_0.setScope("page");
      _jspx_th_o_set_0.setValue(servicio);
      int _jspx_eval_o_set_0 = _jspx_th_o_set_0.doStartTag();
      if (_jspx_th_o_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_o_set_var_value_scope_nobody.reuse(_jspx_th_o_set_0);
        return;
      }
      _jspx_tagPool_o_set_var_value_scope_nobody.reuse(_jspx_th_o_set_0);
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"light-blue darken-2\">\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_o_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s6 offset-s3\">\n");
      out.write("                <div class=\"card-panel z-depth-5\">\n");
      out.write("                    \n");
      out.write("         <form action=\"control.do\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <table cellspacing=\"3\" cellpadding=\"5\" border=\"1\">\n");
      out.write("                  <tr>\n");
      out.write("                   <td align=\"right\">Código:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"codigo\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Nombre:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nombre\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td align=\"right\">Precio:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"precio\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td align=\"right\">Stock:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"stock\"></td>\n");
      out.write("                </tr>\n");
      out.write("                   <td align=\"right\">Categoría:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"codigo\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("              <button name=\"bt\" value=\"1\" type=\"submit\" class=\"btn right\">Agregar</button></form> \n");
      out.write("                    <p class=\"center-align\">Lista de Productos</p>\n");
      out.write("                    <table class=\"bordered highlight\">\n");
      out.write("                        <tr>\n");
      out.write("                             ");
      out.write("\n");
      out.write("                            <td>Código</td>\n");
      out.write("                            <td>Producto</td>\n");
      out.write("                            <td>Precio</td>\n");
      out.write("                            <td>Stock</td>\n");
      out.write("                            <td>Categoría</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");
      if (_jspx_meth_o_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function(){\n");
      out.write("                $(\".button-collapse\").sideNav();\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_o_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  o:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_o_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_o_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_o_import_0.setPageContext(_jspx_page_context);
    _jspx_th_o_import_0.setParent(null);
    _jspx_th_o_import_0.setUrl("menu.jsp");
    int[] _jspx_push_body_count_o_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_o_import_0 = _jspx_th_o_import_0.doStartTag();
      if (_jspx_th_o_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_o_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_o_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_o_import_0.doFinally();
      _jspx_tagPool_o_import_url_nobody.reuse(_jspx_th_o_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_o_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  o:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_o_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_o_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_o_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_o_forEach_0.setParent(null);
    _jspx_th_o_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${servicio.getObjetos()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_o_forEach_0.setVar("o");
    int[] _jspx_push_body_count_o_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_o_forEach_0 = _jspx_th_o_forEach_0.doStartTag();
      if (_jspx_eval_o_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <tr>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.stock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.categoria}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                \n");
          out.write("                                <td>\n");
          out.write("                                     <a href=\"vender.jsp?codigo=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&producto=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&precio=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&stock=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.stock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&categoria=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.categoria}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn-floating blue\">\n");
          out.write("                                        <i class=\"material-icons\">local_grocery_store</i>\n");
          out.write("                                    </a>\n");
          out.write("                                </td>\n");
          out.write("          \n");
          out.write("                              \n");
          out.write("                            </tr>\n");
          out.write("                           \n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_o_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_o_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_o_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_o_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_o_forEach_0.doFinally();
      _jspx_tagPool_o_forEach_var_items.reuse(_jspx_th_o_forEach_0);
    }
    return false;
  }
}
