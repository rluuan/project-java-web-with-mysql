package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.rluan.aw.dados.DadosGerais;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
 DadosGerais dadosSite = new DadosGerais(); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/ico\" />\n");
      out.write("\n");
      out.write("    <title>");
 out.print(dadosSite.getNomeSite()); 
      out.write("! | </title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link href=\"vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <link href=\"vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <link href=\"vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("  \n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <link href=\"vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- JQVMap -->\n");
      out.write("    <link href=\"vendors/jqvmap/dist/jqvmap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <!-- bootstrap-daterangepicker -->\n");
      out.write("    <link href=\"vendors/bootstrap-daterangepicker/daterangepicker.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Style -->\n");
      out.write("    <link href=\"build/css/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"nav-md\">\n");
      out.write("    <div class=\"container body\">\n");
      out.write("      <div class=\"main_container\">\n");
      out.write("        <div class=\"col-md-3 left_col\">\n");
      out.write("          <div class=\"left_col scroll-view\">\n");
      out.write("            <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("              <a href=\"index.html\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>");
 out.print(dadosSite.getNomeSite()); 
      out.write("!</span></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <br />\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu_left.html", out, false);
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- top navigation -->\n");
      out.write("        <div class=\"top_nav\">\n");
      out.write("          <div class=\"nav_menu\">\n");
      out.write("            <nav>\n");
      out.write("              <div class=\"nav toggle\">\n");
      out.write("                <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"\">\n");
      out.write("                  <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    <img src=\"images/img.jpg\" alt=\"\">\n");
      out.write("                    <span class=\" fa fa-angle-down\"></span>\n");
      out.write("                  </a>\n");
      out.write("                  <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\n");
      out.write("                    <li><a href=\"javascript:;\"> Profile</a></li>\n");
      out.write("                    <li>\n");
      out.write("                      <a href=\"javascript:;\">\n");
      out.write("                        <span class=\"badge bg-red pull-right\">50%</span>\n");
      out.write("                        <span>Settings</span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"javascript:;\">Help</a></li>\n");
      out.write("                    <li><a href=\"login.html\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /top navigation -->\n");
      out.write("\n");
      out.write("        <!-- page content -->\n");
      out.write("        <div class=\"right_col\" role=\"main\">\n");
      out.write("          <!-- top tiles -->\n");
      out.write("          <div class=\"row tile_count\">\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <!-- /top tiles -->\n");
      out.write("\n");
      out.write("          \n");
      out.write("          <br />\n");
      out.write("           <!-- page content -->\n");
      out.write("        <div class=\"right_col\" role=\"main\">\n");
      out.write("          <div class=\"\">\n");
      out.write("            <div class=\"page-title\">\n");
      out.write("              <div class=\"title_left\">\n");
      out.write("                <h3>Cadastro de Produto</h3>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"title_right\">\n");
      out.write("                <div class=\"col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search\">\n");
      out.write("                  <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search for...\">\n");
      out.write("                    <span class=\"input-group-btn\">\n");
      out.write("                      <button class=\"btn btn-default\" type=\"button\">Go!</button>\n");
      out.write("                    </span>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"x_panel\">\n");
      out.write("                  <div class=\"x_title\">\n");
      out.write("                    <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                      <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i class=\"fa fa-wrench\"></i></a>\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                          <li><a href=\"#\">Settings 1</a>\n");
      out.write("                          </li>\n");
      out.write("                          <li><a href=\"#\">Settings 2</a>\n");
      out.write("                          </li>\n");
      out.write("                        </ul>\n");
      out.write("                      </li>\n");
      out.write("                      <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"x_content\">\n");
      out.write("                    <br />\n");
      out.write("                    <form id=\"cadastro-produto\" method=\"POST\" data-parsley-validate class=\"form-horizontal form-label-left\" action=\"cadastroProdutos.do\">\n");
      out.write("\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"modelo\">Modelo <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"text\" id=\"modelo\" name='modelo' required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\" for=\"marca\">Marca <span class=\"required\">*</span>\n");
      out.write("                        </label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input type=\"text\" id=\"marca\" name=\"marca\" required=\"required\" class=\"form-control col-md-7 col-xs-12\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label for=\"ano\" class=\"control-label col-md-3 col-sm-3 col-xs-12\">Ano</label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input id=\"ano\" class=\"form-control col-md-7 col-xs-12\" type=\"date\" name=\"ano\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"control-label col-md-3 col-sm-3 col-xs-12\">Cor</label>\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                          <input id=\"cor\" class=\"form-control col-md-2 col-xs-2\" type=\"color\" name=\"cor\" value=\"#696969\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"ln_solid\"></div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-md-6 col-sm-6 col-xs-12 col-md-offset-3\">\n");
      out.write("                          <input type=\"submit\" class=\"btn btn-success\" value=\"Submit\" name=\"Submit\"/>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <!-- /page content -->\n");
      out.write("\n");
      out.write("        <!-- footer content -->\n");
      out.write("        <footer>\n");
      out.write("          <div class=\"pull-right\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clearfix\"></div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- /footer content -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- FastClick -->\n");
      out.write("    <script src=\"vendors/fastclick/lib/fastclick.js\"></script>\n");
      out.write("    <!-- NProgress -->\n");
      out.write("    <script src=\"vendors/nprogress/nprogress.js\"></script>\n");
      out.write("    <!-- Chart.js -->\n");
      out.write("    <script src=\"vendors/Chart.js/dist/Chart.min.js\"></script>\n");
      out.write("    <!-- gauge.js -->\n");
      out.write("    <script src=\"vendors/gauge.js/dist/gauge.min.js\"></script>\n");
      out.write("    <!-- bootstrap-progressbar -->\n");
      out.write("    <script src=\"vendors/bootstrap-progressbar/bootstrap-progressbar.min.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"vendors/iCheck/icheck.min.js\"></script>\n");
      out.write("    <!-- Skycons -->\n");
      out.write("    <script src=\"vendors/skycons/skycons.js\"></script>\n");
      out.write("    <!-- Flot -->\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.pie.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.time.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.stack.js\"></script>\n");
      out.write("    <script src=\"vendors/Flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <!-- Flot plugins -->\n");
      out.write("    <script src=\"vendors/flot.orderbars/js/jquery.flot.orderBars.js\"></script>\n");
      out.write("    <script src=\"vendors/flot-spline/js/jquery.flot.spline.min.js\"></script>\n");
      out.write("    <script src=\"vendors/flot.curvedlines/curvedLines.js\"></script>\n");
      out.write("    <!-- DateJS -->\n");
      out.write("    <script src=\"vendors/DateJS/build/date.js\"></script>\n");
      out.write("    <!-- JQVMap -->\n");
      out.write("    <script src=\"vendors/jqvmap/dist/jquery.vmap.js\"></script>\n");
      out.write("    <script src=\"vendors/jqvmap/dist/maps/jquery.vmap.world.js\"></script>\n");
      out.write("    <script src=\"vendors/jqvmap/examples/js/jquery.vmap.sampledata.js\"></script>\n");
      out.write("    <!-- bootstrap-daterangepicker -->\n");
      out.write("    <script src=\"vendors/moment/min/moment.min.js\"></script>\n");
      out.write("    <script src=\"vendors/bootstrap-daterangepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme Scripts -->\n");
      out.write("    <script src=\"build/js/custom.min.js\"></script>\n");
      out.write("  \n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
}
